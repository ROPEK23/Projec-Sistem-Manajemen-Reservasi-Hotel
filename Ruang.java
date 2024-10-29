public class Ruang {
    int NoKamar;
    private String TipeKamar;
    private double HargaPermalam;

    public Ruang(int noKamar, String tipeKamar, double hargaPermalam) {
        NoKamar = noKamar;
        TipeKamar = tipeKamar;
        HargaPermalam = hargaPermalam;
    }

    public int getNoKamar() {
        return NoKamar;
    }

    public String getTipeKamar() {
        return TipeKamar;
    }

    public double getHargaPermalam() {
        return HargaPermalam;
    }



    //    public Ruang(int roomNumber, String roomType, double pricePerNight) {
//        this.roomNumber = roomNumber;
//        this.roomType = roomType;
//        this.HargaPermalam = pricePerNight;
//    }
//
//    public double getPrice() {
//        return HargaPermalam;
//    }
//
//    public String getRoomType() {
//        return roomType;
//    }
}
