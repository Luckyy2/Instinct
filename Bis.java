public class Bis extends Resource {
    private String nama;
    private int jmlKursi;
    private int kelas;

    Bis(String nama, int jmlKursi, int kelas) {
        this.nama = nama;
        this.jmlKursi = jmlKursi;
        this.kelas = kelas;
        super.create([["nama", nama, "string"], ["jmlKursi", jmlKursi, "int"]]);
    }

}
