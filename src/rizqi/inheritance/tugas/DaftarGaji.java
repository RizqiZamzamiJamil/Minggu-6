package rizqi.inheritance.tugas;

public class DaftarGaji {
    public Pegawai[] listPegawai;
    
    DaftarGaji(int jml){
        listPegawai = new Pegawai[jml];
    }

    public void addPegawai(Pegawai pegawai) {
        for (int i = 0; i < listPegawai.length; i++) {
            if (listPegawai[i] == null) {
                this.listPegawai[i] = pegawai;
                break;
            }
        }
    }

    public void printSemuaGaji(){
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("=-=-=-== DATA GAJI PEGAWAI ==-=-=-=");

        for(int i=0; listPegawai[i] != null && i < listPegawai.length; i++){
            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
            System.out.println("    NIP     : " + listPegawai[i].nip);
            System.out.println("    Nama    : " + listPegawai[i].getNama());
            System.out.println("    Gaji    : " + listPegawai[i].getGaji());
            System.out.println("    Alamat  : " + listPegawai[i].alamat);
            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
            System.out.println();
        }    
    }
}
