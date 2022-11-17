import java.sql.Date;

public class Jadwal extends Resource {
    private Bis bis;
    private Date tglKeberangkatan;
    private String tujuan;
    private int harga;

    public Jadwal(Bis bis, Date tglKeberangkatan, String tujuan, int harga) {
        this.bis = bis;
        this.tglKeberangkatan = tglKeberangkatan;
        this.tujuan = tujuan;
        this.harga = harga;
        super.create();
    }

}
