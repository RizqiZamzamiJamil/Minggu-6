package rizqi.inheritance.percobaan2;

public class ClassB extends ClassA{
    private int z;

    public void setZ(int Z){
        this.z = z;
    }

    public void getNilaiZ(){
        System.out.println("Nilai Z: " + z);
    }
    
    public void getJumlah(){
        System.out.println("Jumlah: " + (x + y + z));
    }
}