public class komik extends buku{
    private int volume;

    public int getVolume(){
        return this.volume;
    }

    public void naikkanHarga(){
        System.out.println("Ini overriding dari method naikkanHarga di class buku");
    }
}
