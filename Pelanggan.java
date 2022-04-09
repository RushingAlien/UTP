public class Pelanggan {
    private String nama, nomorPelanggan;
    private Buku[] BukuPinjaman = new Buku[3];

    Pelanggan() {

    }
    Pelanggan(String nama, String nomorPelanggan) {
        this.nama = nama;
        this.nomorPelanggan = nomorPelanggan;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getNama() {
        return nama;
    }

    public void setNomorPelanggan(String nomorPelanggan) {
        this.nomorPelanggan = nomorPelanggan;
    }
    public String getNomorPelanggan() {
        return nomorPelanggan;
    }

    void tambahBuku(Buku bukuPinjam) {
        for (int i = 0; i < BukuPinjaman.length; i++) {
            if (BukuPinjaman[i] == null) {
                BukuPinjaman[i] = bukuPinjam;
                BukuPinjaman[i].setJumlah(BukuPinjaman[i].getJumlah()-1);
                break;
            }
        }
    }

    void tampilkanInfoPelanggan() {
        int i = 0;
        System.out.println(getNama());
        System.out.println(getNomorPelanggan());
        while (BukuPinjaman[i] != null) {
            System.out.println(BukuPinjaman[0].getJudul());
            i++;
        }
    }
}
