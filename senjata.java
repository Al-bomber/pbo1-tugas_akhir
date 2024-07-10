public class senjata {
    private String namaSenjata;
    private String tipeSenjata;
    private String asalSenjata;
    private int tahunDibuat;
    private String seriSenjata;
    private int jumlahAmunisi;
    private double hargaSenjata;

    public void tembakSenjata(){
        System.out.println("dor dor dor triple kill");
    }

    public void reloadSenjata(){
        System.out.println("reloading the weapon");
    }
    
    public void gantiSenjata(){
        System.out.println("mengganti senjata ke pistol lebih cepat daripada reload senjata");
    }

    public String getNamaSenjata(){
        return this.namaSenjata;
    }

    public String getTipeSenjata(){
        return this.tipeSenjata;
    }

    public String getAsalSenjata(){
        return this.asalSenjata;
    }

    public int getTahunDibuat(){
        return this.tahunDibuat;
    }

    public void setNamaSenjata(String namaSenjata){
        this.namaSenjata = namaSenjata;
    }

    public void setTipeSenjata(String tipeSenjata){
        this.tipeSenjata = tipeSenjata;
    }

    public void setAsalSenjata(String asalSenjata){
        this.asalSenjata = asalSenjata;
    }

    public void setTahunDibuat(int tahunDibuat){
        this.tahunDibuat = tahunDibuat;
    }

    public senjata(){
        System.out.println("Objek telah dibuat, ready to open fire, go go go");
    }

    public void overReload(){
        System.out.println("reloading to much can make your weapon jamming");
    }

    public void overReload(int jumlahReload){
        System.out.println("Too much reload, weapon got jammed, cant open fire");
    }
}
