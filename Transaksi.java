import java.sql.Date;

public class Transaksi extends Resource {
    private Penumpang penumpang;
    private Jadwal jadwal;
    private Date tglTransaksi;
    private int biaya;
    private int jmlKursi;

    public Transaksi(Penumpang penumpang, Jadwal jadwal, Date tglTransaksi, int jmlKursi) {
        this.penumpang = penumpang;
        this.jadwal = jadwal;
        this.tglTransaksi = tglTransaksi;
        this.jmlKursi = jmlKursi;
        super.create();
    }

}
