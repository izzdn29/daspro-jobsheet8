// TriangleAwal22.java
import java.util.Scanner;

// Kode awal (sengaja salah) dari jobsheet, dengan baris debug sementara (langkah 4)
public class TriangleAwal22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai n = ");
        int n = sc.nextInt();

        int i = 0;
        while (i <= n) {
            System.out.print("[i=" + i + "] "); // debug sementara
            int j = 0;
            while (j < i) {
                System.out.print("*");
                j++;
            }
            i++;
        }
        sc.close();
    }
}
