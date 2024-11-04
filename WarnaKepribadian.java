import java.util.Scanner;

public class WarnaKepribadian {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input dari pengguna
        System.out.print("Masukkan nama Anda: ");
        String nama = scanner.nextLine();

        System.out.print("Masukkan warna favorit Anda: ");
        String warna = scanner.nextLine();

        // Menampilkan hasil tes kepribadian
        hasilKepribadian(nama, warna);
    }

    public static void hasilKepribadian(String nama, String warna) {
        String[] sifat;

        // Menentukan sifat berdasarkan warna favorit
        switch (warna.toLowerCase()) {
            case "hijau":
                sifat = new String[]{
                    "Menyenangkan",
                    "Penuh harapan",
                    "Mempunyai rasa percaya diri yang tinggi",
                    "Suka ketenangan",
                    "Senang berbagi",
                    "Bersahabat",
                    "Cenderung pragmatis",
                    "Mencari keseimbangan dalam hidup"
                };
                break;
            case "biru":
                sifat = new String[]{
                    "Menyenangkan",
                    "Bijaksana",
                    "Pembawaan diri tenang saat menghadapi masalah",
                    "Mampu mendengarkan dengan baik",
                    "Senang berbagi",
                    "Bersahabat",
                    "Tidak terlalu suka menjadi sorotan banyak orang",
                    "Mencari jalan damai"
                };
                break;
            case "ungu":
                sifat = new String[]{
                    "Kreatif",
                    "Penuh imajinasi",
                    "Penuh semangat",
                    "Menarik perhatian",
                    "Bersikap diplomatis",
                    "Suka melakukan hal-hal unik",
                    "Memiliki intuisi yang kuat",
                    "Mencari kedamaian dalam hidup"
                };
                break;
            default:
                sifat = new String[]{"Warna tidak dikenali"};
                break;
        }

        // Menampilkan hasil
        System.out.println("HASIL TEST KEPRIBADIAN " + nama.toUpperCase());
        System.out.println("Warna Favoritmu adalah " + warna.toUpperCase());
        for (int i = 0; i < sifat.length; i++) {
            System.out.println((i + 1) + ". " + sifat[i]);
        }
    }
}