public class Buku {
    private String  judul,
                    penulis;
    private int     jumlah;

    public Buku() {
        judul = penulis = "";
        jumlah = 0;
    }
    public Buku(String judul, String penulis, int jumlah) {
        this.judul = judul;
        this.penulis = penulis;
        this.jumlah = jumlah;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public String getJudul() {
        return judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public int getJumlah() {
        return jumlah;
    }

    void tampilkanInfoBuku() {
        System.out.println(getJudul());
        System.out.println(getPenulis());
        System.out.println(getJumlah());
    }

}