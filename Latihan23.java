/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihan23;
import java.util.Scanner;
/**
 *
 * @author nm
 */
public class Latihan23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int banyaknyanilai;
        int nilaiterkecil = Integer.MAX_VALUE;
        int nilaiterbesar = Integer.MIN_VALUE; 

        System.out.println("======Program Nilai Terbesar Dan Terkecil Nilai Mahasiswa======");
        System.out.print("Masukkan Nama Petugas: ");
        String petugas = scanner.nextLine();
        System.out.print("Masukkan Banyaknya Nilai Mahasiswa: ");
        banyaknyanilai = scanner.nextInt();

        for (int i = 1; i <= banyaknyanilai; i++) {
            System.out.print("Masukkan Nilai Mahasiswa ke-" + i + ": ");
            int nilai = scanner.nextInt();

            if (nilai > nilaiterbesar) {
                nilaiterbesar = nilai;
            }

            if (nilai < nilaiterkecil) {
                nilaiterkecil = nilai;
            }
        }

        System.out.println("======Hasil Nilai Mahasiswa======");
        for (int i = 1; i <= banyaknyanilai; i++) {
            System.out.print("Nilai Mahasiswa ke-" + i + ": ");
            int nilai = scanner.nextInt();
        }
        System.out.println("Nilai Terbesar Adalah " + nilaiterbesar);
        System.out.println("Nilai Terkecil Adalah " + nilaiterkecil);
        System.out.println("Petugas: " + petugas);
    }
    
}
