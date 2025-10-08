import java.util.Scanner;

public class Nomor3 {
    public static void main(String[] args) {
        try (Scanner Baju = new Scanner(System.in)) {
            int harga = 0;
            System.out.print("masukkan ukuran baju (S, M, L, XL, XXL)= ");
            String ukuran = Baju.nextLine();
            System.out.print("masukkan jumlah baju = ");
            int jumlah = Baju.nextInt();

            switch (ukuran.toUpperCase()) {
                case "S":
                    harga = jumlah * 30000;
                    break;
                case "M":
                    harga = jumlah * 38000;
                    break;
                case "L":
                    harga = jumlah * 45000;
                    break;
                case "XL":
                    harga = jumlah * 50000;
                    break;
                case "XXL":
                    harga = jumlah * 60000;
                    break;
            }
        System.out.println("Harga yang harus dibayar = "+harga);
        }
    }
}
