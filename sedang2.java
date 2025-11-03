import java.util.Scanner;
public class sedang2 {
   
    // Fungsi untuk menghitung volume tabung
    public static double hitungVolumeTabung(double jariJari, double tinggi) {
        return Math.PI * jariJari * jariJari * tinggi;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta input jari-jari dan tinggi dari pengguna
        System.out.print("Masukkan jari-jari tabung (cm): ");
        double jariJari = scanner.nextDouble();
        System.out.print("Masukkan tinggi tabung (cm): ");
        double tinggi = scanner.nextDouble();

        // Menghitung volume menggunakan fungsi
        double volume = hitungVolumeTabung(jariJari, tinggi);

        // Menampilkan hasil
        System.out.println("Volume tabung adalah: " + volume + " cm³");

        scanner.close();
    }
}


