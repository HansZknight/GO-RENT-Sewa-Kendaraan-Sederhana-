/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author SIRHAN
 */
import java.util.Scanner;

public class TBDDPUAS2 {
   public static void main (String[] args){
        try{
        Scanner input = new Scanner (System.in) ;
        int pilihan = 0;
        
        String[] mobil = new String[]{
           "Honda Brio",
           "Toyota Avanza",
           "Mitsubishi Xpander",
           "Toyota Innova",
           "Toyota Fortuner"  
        };
        int[] hargamobil = new int[]{
           250000, 300000, 400000, 500000, 800000
        };
        
        String[] motor = new String[]{
           "Honda Beat",
           "Honda Scoopy",
           "Honda Vario",
           "Yamaha Nmax",
           "Yamaha Aerox"
        };
        int[] hargamotor = new int[]{
            80000, 90000, 100000, 120000, 130000
        };
        
        String[] riwayat = new String[100];
        int jumlahriwayat = 0;
        
        while (pilihan!=4){

        System.out.println("");
        System.out.println("    RENTAL KENDARAAN    ");
        System.out.println("|======================|");
        System.out.println("| 1.  SEWA MOBIL       |");
        System.out.println("| 2.  SEWA MOTOR       |");
        System.out.println("| 3.  CETAK STRUK      |");
        System.out.println("| 4.  KELUAR           |");
        System.out.println("|======================|");
        
        System.out.print("Input Pilihan 1/2/3/4 : ");
        pilihan = input.nextInt();
        input.nextLine(); // buffer enter
        
        switch (pilihan)
        {
            // ================================
            //          CASE 1 : MOBIL
            // ================================
            case 1 :
                System.out.print("Masukkan Nama Pelanggan: ");
                String nama = input.nextLine();

                System.out.println("|=============DAFTAR MOBIL=============|");
                for (int i = 0; i < 5; i++) {
                    System.out.println(" "+(i + 1) + ". " + mobil[i] + " - Rp " + hargamobil[i] + "/hari");
                } 
                System.out.println("|======================================|");
            
                System.out.print("Pilih mobil (1-5): ");
                int pilihmobil = input.nextInt();
                
                if ((pilihmobil < 1) || (pilihmobil > 5)){
                    System.out.println("Pilihan tidak valid!!");
                    break;
                }

                System.out.print("Input Tanggal (1-31) : ");
                int day = input.nextInt();
                System.out.print("Input Bulan   (1-12) : ");
                int month = input.nextInt();
                System.out.print("Input Tahun          : ");
                int year = input.nextInt();
                
                String tgl = day +"/"+ month +"/"+ year;

                System.out.print("Berapa hari ingin disewa: ");
                int harimobil = input.nextInt();

                if (harimobil <= 0) {
                    System.out.println("Lama sewa tidak valid!");
                    break;
                }

                int d = day;
                int m = month;
                int y = year;
                int[] hariBulan = {31,28,31,30,31,30,31,31,30,31,30,31};

                d += harimobil;
                while (d > hariBulan[m-1]) {
                    d -= hariBulan[m-1];
                    m++;
                    if (m > 12) {
                        m = 1;
                        y++;
                    }
                }
                String tglKembali = d + "/" + m + "/" + y;
                
                int hargaperharimobil = hargamobil[pilihmobil - 1];
                int totalmobil = hargaperharimobil * harimobil;
                double diskonmobil = 0;

                if (harimobil >= 7) diskonmobil = 0.15;
                else if (harimobil >= 3) diskonmobil = 0.10;

                double potonganmobil = totalmobil * diskonmobil;
                double totalbayarmobil = totalmobil - potonganmobil;

                System.out.println("\nTOTAL BAYAR: Rp " + totalbayarmobil);
                System.out.print("Masukkan uang pembayaran: Rp ");
                long uangmobil = input.nextLong();

                if (uangmobil < totalbayarmobil) {
                    System.out.println("Uang kurang! Transaksi dibatalkan.");
                    break;
                }

                long kembalianmobil = uangmobil - (long)totalbayarmobil;

                System.out.println("\n========= STRUK SEWA MOBIL ==========");
                System.out.println("Nama Pelanggan   : " + nama);
                System.out.println("Mobil            : " + mobil[pilihmobil - 1]);
                System.out.println("Harga/Hari       : Rp " + hargaperharimobil);
                System.out.println("Tanggal Pinjam   : " + tgl);
                System.out.println("Tanggal Kembali  : " + tglKembali);
                System.out.println("Lama Sewa        : " + harimobil + " hari");
                System.out.println("Diskon           : " + (diskonmobil * 100) + "%");
                System.out.println("Total Bayar      : Rp " + totalbayarmobil);
                System.out.println("Uang Masuk       : Rp " + uangmobil);
                System.out.println("Kembalian        : Rp " + kembalianmobil);
                System.out.println("============= TERIMA KASIH ============");

                riwayat[jumlahriwayat] =
                    "Nama: " + nama + " | [MOBIL] " + mobil[pilihmobil - 1] +
                    " | Pinjam: " + tgl + " | Kembali: " + tglKembali +
                    " | " + harimobil + " hari | Total: Rp " + totalbayarmobil;
                jumlahriwayat++;

                break;
                
                
            // ================================
            //          CASE 2 : MOTOR
            // ================================
            case 2 :
                System.out.print("Masukkan Nama Pelanggan: ");
                String namamtr = input.nextLine();

                System.out.println("|=============DAFTAR MOTOR=============|");
                for (int i = 0; i < 5; i++) {
                    System.out.println(" "+(i + 1) + ". " + motor[i] + " - Rp " + hargamotor[i] + "/hari");
                } 
                System.out.println("|======================================|");
            
                System.out.print("Pilih motor (1-5): ");
                int pilihmotor = input.nextInt();
                
                if ((pilihmotor < 1) || (pilihmotor > 5)){
                    System.out.println("Pilihan tidak valid!!");
                    break;
                }
                
                System.out.print("Input Tanggal (1-31) : ");
                int daymtr = input.nextInt();
                System.out.print("Input Bulan   (1-12) : ");
                int monthmtr = input.nextInt();
                System.out.print("Input Tahun          : ");
                int yearmtr = input.nextInt();
                
                String tglmtr = daymtr +"/"+ monthmtr +"/"+ yearmtr;
                
                System.out.print("Berapa hari ingin disewa: ");
                int harimotor = input.nextInt();

                if (harimotor <= 0) {
                    System.out.println("Lama sewa tidak valid!");
                    break;
                }

                int d2 = daymtr;
                int m2 = monthmtr;
                int y2 = yearmtr;
                int[] hariMo = {31,28,31,30,31,30,31,31,30,31,30,31};

                d2 += harimotor;
                while (d2 > hariMo[m2-1]) {
                    d2 -= hariMo[m2-1];
                    m2++;
                    if (m2 > 12) {
                        m2 = 1;
                        y2++;
                    }
                }
                String kembaliMo = d2 + "/" + m2 + "/" + y2;
                
                int hargaperharimotor = hargamotor[pilihmotor - 1];
                int totalmotor = hargaperharimotor * harimotor;
                double diskonmotor = 0;

                if (harimotor >= 7) diskonmotor = 0.15;
                else if (harimotor >= 3) diskonmotor = 0.10;

                double potonganmotor = totalmotor * diskonmotor;
                double totalbayarmotor = totalmotor - potonganmotor;

                System.out.println("\nTOTAL BAYAR: Rp " + totalbayarmotor);
                System.out.print("Masukkan uang pembayaran: Rp ");
                long uangmotor = input.nextLong();

                if (uangmotor < totalbayarmotor) {
                    System.out.println("Uang kurang! Transaksi dibatalkan.");
                    break;
                }

                long kembalianmotor = uangmotor - (long)totalbayarmotor;

                System.out.println("\n========= STRUK SEWA MOTOR ==========");
                System.out.println("Nama Pelanggan   : " + namamtr);
                System.out.println("Motor            : " + motor[pilihmotor - 1]);
                System.out.println("Harga/Hari       : Rp " + hargaperharimotor);
                System.out.println("Tanggal Pinjam   : " + tglmtr);
                System.out.println("Tanggal Kembali  : " + kembaliMo);
                System.out.println("Lama Sewa        : " + harimotor + " hari");
                System.out.println("Diskon           : " + (diskonmotor * 100) + "%");
                System.out.println("Total Bayar      : Rp " + totalbayarmotor);
                System.out.println("Uang Masuk       : Rp " + uangmotor);
                System.out.println("Kembalian        : Rp " + kembalianmotor);
                System.out.println("============= TERIMA KASIH ============");

                riwayat[jumlahriwayat] =
                    "Nama: " + namamtr + " | [MOTOR] " + motor[pilihmotor - 1] +
                    " | Pinjam: " + tglmtr + " | Kembali: " + kembaliMo +
                    " | " + harimotor + " hari | Total: Rp " + totalbayarmotor;
                jumlahriwayat++;

                break;
                
                
            // ================================
            //          CASE 3 : RIWAYAT
            // ================================
            case 3:
                System.out.println("\n===== RIWAYAT TRANSAKSI =====");

                if (jumlahriwayat == 0) {
                    System.out.println("Belum ada transaksi.");
                } 
                else {
                    for (int i = 0; i < jumlahriwayat; i++) {
                        System.out.println((i + 1) + ". " + riwayat[i]);
                    }
                }
                break;


            case 4:
                System.out.println("\nTerima kasih telah menggunakan jasa Rental Kendaraan!");
                break;

            default:
                System.out.println("Kode pilihan tidak valid!");        
            
            }
          }       
        }
        catch (Exception ie) {
            System.out.println("Data yang diinput salah!!");
        }
    }  
}
