package rizqi.inheritance.tugas;

public class Main {
    public static void main(String[] args) {
        DaftarGaji Gaji = new DaftarGaji(4);
        Dosen no1 = new Dosen("111111", "Rizqi", "Kediri");
        no1.setSKS(12);
        Dosen no2 = new Dosen("222222", "Zamzami", "Malang");
        no2.setSKS(8);

        Gaji.addPegawai(no1);
        Gaji.addPegawai(no2);
        Gaji.printSemuaGaji();
    }
}
