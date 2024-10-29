public class Reservation {
    Guest guest;
    private Ruang room;
    private int malam;
    private double additionalFacilities;
    private String status;

    public Reservation(Guest guest, Ruang room, int nights, double additionalFacilities) {
        this.guest = guest;
        this.room = room;
        this.malam = nights;
        this.additionalFacilities = additionalFacilities;
        this.status = "Confirmed";
    }

    public double calculateTotalCost() {
        return (room.getHargaPermalam() * malam) + additionalFacilities;
    }

    public void displayReservation() {
        System.out.println("Reservasi oleh : " + guest.getNama());
        System.out.println("Tipe Kamar : " + room.getTipeKamar());
        System.out.println("jumlah menginap (hari): " + malam);
        System.out.println("Total Harga : " + calculateTotalCost());
    }

    public String getStatus() {
        return status;
    }
}