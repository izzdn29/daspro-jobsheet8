// StarGanjil22.java
import java.util.Scanner;

// Pertanyaan 3: potongan kode i = 2; i += 2 dimodifikasi menjadi bilangan ganjil positif <= n
public class StarGanjil22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai n = ");
        int n = sc.nextInt();

        // Kode asli (bilangan genap)
        System.out.print("Genap : ");
        for (int i = 2; i <= n; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Modifikasi (bilangan ganjil)
        System.out.print("Ganjil: ");
        for (int i = 1; i <= n; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
        sc.close();
    }
}
