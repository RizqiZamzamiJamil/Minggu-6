package rizqi.inheritance.tugas;

public class Dosen extends Pegawai{
    public int jumlahSKS;
    public int TARIF_SKS;

    Dosen(String nip, String nama, String alamat){
        super(nip, nama, alamat);
    }

    void setSKS(int sks){
        this.jumlahSKS = sks;
    }

    public int getGaji(){
        return jumlahSKS * super.getGaji();
    }
}
