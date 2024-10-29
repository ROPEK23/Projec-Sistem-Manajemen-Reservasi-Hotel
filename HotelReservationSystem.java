import java.util.ArrayList;

public class HotelReservationSystem {
    private ArrayList<Ruang> rooms = new ArrayList<>();
    private ArrayList<Reservation> reservations = new ArrayList<>();

    public void addRoom(Ruang room) {
        rooms.add(room);
    }

    public Ruang getRoomByNumber(int roomNumber) {
        for (Ruang room : rooms) {
            if (room.NoKamar == roomNumber) {
                return room;
            }
        }
        System.out.println("Room not found.");
        return null;
    }

    public Reservation createReservation(Guest guest, Ruang room, int nights, double additionalFacilities) {
        Reservation reservation = new Reservation(guest, room, nights, additionalFacilities);
        reservations.add(reservation);
        return reservation;
    }

    public void getReservationStatus(Reservation reservation) {
        System.out.println("Reservation Status for " + reservation.guest.getNama() + ": " + reservation.getStatus());
    }

    public void showReservations() {
        for (Reservation reservation : reservations) {
            reservation.displayReservation();
        }
    }
}
