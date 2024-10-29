import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HotelReservationSystem system = new HotelReservationSystem();

        System.out.printf("HOTEL\n");
        System.out.println("1. Kamar Standard");
        System.out.println("-250.000-");
        System.out.println("2. Kamar Suite");
        System.out.println("-600.000-");

        // Tambah beberapa kamar secara dinamis
        System.out.print("Masukkan jumlah kamar yang akan ditambahkan: ");
        int numRooms = scanner.nextInt();
        scanner.nextLine(); // Mengonsumsi newline

        for (int i = 0; i < numRooms; i++) {
            System.out.print("Masukkan nomor kamar: ");
            int roomNumber = scanner.nextInt();
            scanner.nextLine(); // Mengonsumsi newline
            System.out.print("Masukkan tipe kamar (Standard/Suite): ");
            String roomType = scanner.nextLine();

            if (roomType.equalsIgnoreCase("Standard")) {
                system.addRoom(new StandardRoom(roomNumber));
            } else if (roomType.equalsIgnoreCase("Suite")) {
                system.addRoom(new SuiteRoom(roomNumber));
            } else {
                System.out.println("Tipe kamar tidak valid.");
                i--; // Ulangi input jika tipe tidak valid
            }
        }

        // Tambah data tamu secara dinamis
        System.out.print("Masukkan nama tamu: ");
        String guestName = scanner.nextLine();
        System.out.print("Masukkan NIK : ");
        String guestId = scanner.nextLine();

        Guest guest = new Guest(guestName, guestId);

        // Membuat reservasi
        System.out.print("Masukkan nomor kamar yang ingin dipesan: ");
        int roomNumber = scanner.nextInt();
        Ruang room = system.getRoomByNumber(roomNumber);

        if (room != null) {
            System.out.print("Masukkan jumlah malam menginap: ");
            int nights = scanner.nextInt();
            System.out.print("Masukkan biaya tambahan fasilitas: ");
            double additionalFacilities = scanner.nextDouble();

            // Membuat reservasi dan menampilkannya
            Reservation reservation = system.createReservation(guest, room, nights, additionalFacilities);
            system.getReservationStatus(reservation);
            reservation.displayReservation();

            // Menampilkan tagihan akhir
            Bill bill = new Bill(reservation);
            bill.displayBill();
        } else {
            System.out.println("Reservasi gagal, kamar tidak ditemukan.");
        }

        scanner.close();
    }
}
