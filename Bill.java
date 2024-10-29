public class Bill {
    private Reservation reservation;

    public Bill(Reservation reservation) {
        this.reservation = reservation;
    }

    public double getFinalBill() {
        return reservation.calculateTotalCost();
    }

    public void displayBill() {
        System.out.println("Final Bill for " + reservation.guest.getNama());
        System.out.println("Total Amount: " + getFinalBill());
    }
}