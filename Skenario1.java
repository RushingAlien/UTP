public class Skenario1 {
    public static void main(String[] args) {
        Pegawai pegawaiPerpus = new Pegawai("Hemas", "215123025573");
        Perpustakaan perpus = new Perpustakaan(pegawaiPerpus);

        pegawaiPerpus.menambahPelanggan("Hayasaka", "99001110009");
        pegawaiPerpus.menambahPelanggan("Miyuki", "99001100008");
        pegawaiPerpus.menambahPelanggan("Kei", "990011110077");
        pegawaiPerpus.menambahBuku("Heavens", "Tiancan", 3);
        pegawaiPerpus.menambahBuku("Kaguya-sama", "Akasaka", 3);
        pegawaiPerpus.menambahBuku("Solo Leveling", "Chugong", 1);
        
        perpus.pinjam("Hayasaka", "Overlord");
        perpus.pinjam("Miyuki", "Solo Leveling");
        perpus.pinjam("Kei", "Solo Leveling");

        perpus.tampilkanInfoPerpustakaan();
    }
}
