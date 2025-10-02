package jobsheet5;
import java.util.Scanner;

public class Perpustakaan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        System.out.println("=== Sistem Perpustakaan ===");
        System.out.print("Apakah membawa kartu mahasiswa? (Ya/Tidak): ");
        String kartu = sc.nextLine();
        System.out.print("Apakah sudah registrasi online? (Ya/Tidak): ");
        String registrasi = sc.nextLine();

        if (kartu.equalsIgnoreCase("Ya") || registrasi.equalsIgnoreCase("Ya")) {
            System.out.println("Izin masuk diberikan (Boleh masuk perpustakaan).");
        } else {
            System.out.println("Izin masuk ditolak.");
        }

        sc.close();
    }
}

