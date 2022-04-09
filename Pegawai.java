public class Pegawai {
    private String nama, nomorPegawai;

    Pegawai(String nama, String nomorPegawai) {
        this.nama = nama;
        this.nomorPegawai = nomorPegawai;
    }

    public void setNomorPegawai(String nomorPegawai) {
        this.nomorPegawai = nomorPegawai;
    }
    public String getNomorPegawai() {
        return nomorPegawai;
    }

    public void setNamaPegawai(String nama) {
        this.nama = nama;
    }
    public String getNamaPegawai() {
        return nama;
    }

    void tampilkanInfoPegawai() {
        System.out.println(getNamaPegawai());
        System.out.println(getNomorPegawai());
    }

    void menambahPelanggan(String nama, String nomorPelanggan) {
        Pelanggan pelanggan = new Pelanggan(nama, nomorPelanggan);
        for (int i = 0; i < 20; i++) {
            if (Perpustakaan.listPelanggan[i] == null) {
                Perpustakaan.listPelanggan[i] = pelanggan;
                break;
            } else if (Perpustakaan.listPelanggan[i].getNama().equals(nama)) {
                break;
            }
        }
    }

    void menambahBuku(String judul, String penulis, int jumlah) {
        Buku buku = new Buku(judul, penulis, jumlah);
        for (int i = 0; i < 100; i++) {
            if (Perpustakaan.listBuku[i] == null) {
                Perpustakaan.listBuku[i] = buku;
                break;
            } else if (Perpustakaan.listBuku[i].getJudul() == judul) {
                Perpustakaan.listBuku[i].setJumlah(Perpustakaan.listBuku[i].getJumlah() + jumlah);
                break;
            }
        }
    }
}