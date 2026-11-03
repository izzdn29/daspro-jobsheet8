// Tugas222.java
import java.util.Scanner;

public class Tugas222 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        do {
            System.out.print("Masukkan nilai n = ");
            n = sc.nextInt();
            if (n < 3) {
                System.out.println("Nilai n minimal 3. Ulangi input!");
            }
        } while (n < 3);

        int jumlah = 0;
        for (int i = 1; i <= n; i++) {          // baris
            for (int j = 1; j <= n; j++) {      // kolom
                int hasil = i * j;
                System.out.printf("%4d", hasil);
                jumlah += hasil;
            }
            System.out.println();
        }
        System.out.println("Jumlah seluruh angka: " + jumlah);
        sc.close();
    }
}
