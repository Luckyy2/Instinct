public class Penumpang extends Resource {
    private String nama;
    private String nik;
    private String noHp;

    public Penumpang(String nama, String nik, String noHp) {
        this.nama = nama;
        this.nik = nik;
        this.noHp = noHp;
        super.create();
    }

}
