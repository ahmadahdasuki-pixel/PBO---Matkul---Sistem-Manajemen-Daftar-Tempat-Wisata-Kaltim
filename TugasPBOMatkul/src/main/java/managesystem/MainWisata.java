/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package managesystem;

import java.util.Scanner;
import managesystem.TempatWisata;
import managesystem.WisataAlam;
import managesystem.WisataBuatan;
import managesystem.ManajemenWisata;

/**
 *
 * @author Ahmad Ahdasuki
 */
public class MainWisata {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ManajemenWisata manajemen = new ManajemenWisata(scanner);

        boolean berjalan = true;

        while (berjalan) {

            System.out.println("======================================");
            System.out.println("       MANAJEMEN TEMPAT WISATA");
            System.out.println("                KALTIM");
            System.out.println("======================================");
            System.out.println("1. Tambah Data Wisata");
            System.out.println("2. Tampilkan Data Wisata");
            System.out.println("3. Update Data Wisata");
            System.out.println("4. Hapus Data Wisata");
            System.out.println("5. Keluar");
            System.out.println("======================================");

            System.out.print("Pilih menu (1-5): ");
            int pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {

                case 1:
                    manajemen.tambahWisata();
                    break;

                case 2:
                    manajemen.tampilkanWisata();
                    break;

                case 3:
                    manajemen.updateWisata();
                    break;

                case 4:
                    manajemen.hapusWisata();
                    break;

                case 5:
                    berjalan = false;
                    System.out.println("Program selesai. Terima kasih!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }

        scanner.close();
    }
}
