// Tugas322.java
import java.util.Scanner;

public class Tugas322 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jumlahToko;
        do {
            System.out.print("Masukkan jumlah toko: ");
            jumlahToko = sc.nextInt();
            if (jumlahToko < 1) {
                System.out.println("Jumlah toko minimal 1. Ulangi input!");
            }
        } while (jumlahToko < 1);

        int totalSeluruh = 0;
        int tokoTerbanyak = 0;
        int barangTerbanyak = -1;   // -1 agar toko pertama pasti tercatat

        // Rekap per toko disimpan sementara sebagai teks agar tampil di ringkasan akhir
        String rekap = "";

        for (int t = 1; t <= jumlahToko; t++) {
            int jumlahPelanggan;
            do {
                System.out.print("Toko " + t + " - jumlah pelanggan: ");
                jumlahPelanggan = sc.nextInt();
                if (jumlahPelanggan < 0) {
                    System.out.println("Tidak boleh negatif. Ulangi input!");
                }
            } while (jumlahPelanggan < 0);

            int totalBarangToko = 0;
            for (int p = 1; p <= jumlahPelanggan; p++) {
                int barang;
                do {
                    System.out.print("  Pelanggan " + p + " - jumlah barang: ");
                    barang = sc.nextInt();
                    if (barang < 0) {
                        System.out.println("  Tidak boleh negatif. Ulangi input!");
                    }
                } while (barang < 0);
                totalBarangToko += barang;
            }

            rekap += "Toko " + t + " - pelanggan: " + jumlahPelanggan
                    + ", total barang: " + totalBarangToko + "\n";
            totalSeluruh += totalBarangToko;

            if (totalBarangToko > barangTerbanyak) {   // '>' : nomor toko terkecil menang jika sama
                barangTerbanyak = totalBarangToko;
                tokoTerbanyak = t;
            }
        }

        System.out.println();
        System.out.println("=== Rekap Penjualan ===");
        System.out.print(rekap);
        System.out.println("Total barang seluruh toko: " + totalSeluruh);
        System.out.println("Toko dengan barang terbanyak: " + tokoTerbanyak);
        sc.close();
    }
}
