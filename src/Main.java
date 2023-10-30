/**
 * Kelas untuk menghitung luas permukaan kubus.
 */
public class LuasPermukaanKubus {

    /**
     * Metode utama untuk menghitung luas permukaan kubus.
     * @param args Argumen baris perintah. Tidak digunakan dalam program ini.
     */
    public static void main(String[] args) {
        // Membaca panjang sisi kubus dari pengguna
        double sisi = bacaPanjangSisi();

        // Menghitung luas permukaan kubus
        double luasPermukaan = hitungLuasPermukaanKubus(sisi);

        // Menampilkan hasil
        tampilkanHasil(luasPermukaan);
    }

    /**
     * Metode untuk membaca panjang sisi kubus dari pengguna.
     * @return Panjang sisi kubus yang dimasukkan pengguna.
     */
    private static double bacaPanjangSisi() {
        // Anda dapat menggunakan Scanner untuk membaca masukan dari pengguna
        // di sini, namun untuk tujuan contoh, kita akan menggunakan nilai tetap.
        return 6;
    }

    /**
     * Metode untuk menghitung luas permukaan kubus.
     * @param sisi Panjang sisi kubus.
     * @return Luas permukaan kubus.
     */
    private static double hitungLuasPermukaanKubus(double sisi) {
        return 6 * sisi * sisi;
    }

    /**
     * Metode untuk menampilkan hasil perhitungan.
     * @param luasPermukaan Luas permukaan kubus yang akan ditampilkan.
     */
    private static void tampilkanHasil(double luasPermukaan) {
        System.out.println("Luas permukaan kubus adalah: " + luasPermukaan);
    }
}
