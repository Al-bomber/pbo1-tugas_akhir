public class buku {
    private int id;
    private String judul;
    private String penulis;
    private int jumlahHalaman;
    private double harga;

    public void tambahBuku(){
        System.out.println("Ini method menambah stok buku");
    }

    public void pinjamBuku(){
        System.out.println("Ini method pinjam buku");
    }

    public void beliBuku(){
        System.out.println("Ini method");
    }

    public int getIdBuku(){
        return this.id;
    }

    public String getJudul(){
        return this.judul;
    }

    public String getPenulis(){
        return this.penulis;
    }

    public int getJumlahHalaman(){
        return this.jumlahHalaman;
    }
    
    public double getHarga(){
        return this.harga;
    }

    public void setIdBuku(int id){
        this.id = id;
    }

    public void setJudul(String judul){
        this.judul = judul;
    }

    public void setPenulis(String penulis){
        this.penulis = penulis;
    }

    public void setJumlahHalaman(int jumlahHalaman){
        this.jumlahHalaman = jumlahHalaman;
    }

    public void setHarga(double harga){
        this.harga = harga;
    }

    public buku(){
        System.out.println("Objek telah diciptakan, construktor berjalan");
    }

    public void naikkanHarga(){
        System.out.println("Ini method overloading naikkan harga 1");
    }

    public void naikkanHarga(double kenaikan){
        System.out.println("Ini method overloading naikkan harga 2");
    }
}
