public class Perpustakaan {
    static Buku[] listBuku = new Buku[100];
    public Pegawai pegawaiPerpus;
    static Pelanggan[] listPelanggan = new Pelanggan[20];

    Perpustakaan(Pegawai pegawai) {
        this.pegawaiPerpus = pegawai;
    }

    void pinjam(String namaPelanggan, String judulBuku) {
        if (cariBuku(judulBuku)!=null) {
            int i = 0;
            while (listPelanggan[i]!=null) {
                if (listPelanggan[i].getNama().equals(namaPelanggan)) {
                    listPelanggan[i].tambahBuku(cariBuku(judulBuku));
                    break;
                }
                i++;
            }
        }
    }

    Buku cariBuku(String judulBuku) {
        int i = 0;
        while (listBuku[i]!=null) {
            if (listBuku[i].getJudul().equals(judulBuku)) {
                return listBuku[i];
            }
            i++;
        }
        return null;
    }

    void tampilkanInfoPerpustakaan() {
        pegawaiPerpus.tampilkanInfoPegawai();
        for (int i = 0; i < listPelanggan.length; i++) {
            if (listPelanggan[i] != null) {
                listPelanggan[i].tampilkanInfoPelanggan();
            } else break;
        }
        for (int i = 0; i < listBuku.length; i++) {
            if (listBuku[i] != null) {
                listBuku[i].tampilkanInfoBuku();
            } else break;
        }
    }
}
