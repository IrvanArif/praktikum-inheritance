public class Pegawai {
    private String nama;
    public double gaji;
}
class manajer extends Pegawai {
    public String departemen;

    public void Isidata(String n, String d) {
        nama=n;
        departemen=d;
    }
}