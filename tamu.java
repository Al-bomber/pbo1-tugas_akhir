public class tamu extends pengguna{
    private int sisaMasaAktif;

    public void menambahMasaAktif(int tambahan){
        this.sisaMasaAktif = this.sisaMasaAktif + tambahan;
    }

    public void hapus(){
        System.out.println("DELETE FROM pengguna WHERE status = 'tamu' ");
    }

    public void login(){
        System.out.println("Login sebagai tamu");
    }
}
