import java.sql.Date;

public class Migrate {
    public static void main(String[] args) {
        Bis b1 = new Bis("Damri", 30, 1);
        Penumpang p1 = new Penumpang("alfina", "616127121", "081234567");
        Jadwal j1 = new Jadwal(b1, new Date(2022, 11, 2), "Lampung", 300000);
        Transaksi t1 = new Transaksi(p1, j1, new Date(2022, 11, 2), 1);

    }
}
