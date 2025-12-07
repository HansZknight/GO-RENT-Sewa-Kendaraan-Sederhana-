public class TBPDDPUAS {
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
        int[] stokMobil = {5, 5, 5, 5, 5};

        
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
        int[] stokMotor = {10, 10, 10, 10, 10};
        
        String[] riwayat = new String[100];
        int jumlahriwayat = 0;
        
        while (pilihan!=5){
        System.out.println("");
        System.out.println("         GO-RENT        ");
        System.out.println("|======================|");
        System.out.println("| 1.  SEWA MOBIL       |");
        System.out.println("| 2.  SEWA MOTOR       |");
        System.out.println("| 3.  CEK STOK UNIT    |");
        System.out.println("| 4.  RIWAYAT TRANSAKSI|");
        System.out.println("| 5.  KELUAR           |");
        System.out.println("|======================|");
        
        System.out.print("Input Pilihan 1/2/3/4/5 : ");
        pilihan = input.nextInt();
        input.nextLine();
        
        
        switch (pilihan)
        {
            case 1 :
                System.out.println("================================================");
                System.out.print("Masukkan Nama Penyewa: ");
                String nama = input.nextLine();
                
                System.out.println("");
                
                System.out.println("|==================DAFTAR MOBIL=================|");
                for (int i = 0; i < 5; i++) {
                        System.out.println(" "+(i + 1) + ". " + mobil[i] + " - Rp "
                                + hargamobil[i] + "/hari - Stok: "+ stokMobil[i]);
                    } 
                System.out.println("|===============================================|");
                System.out.println("Sewa selama 3 hari atau lebih diskon 10%");
                System.out.println("Sewa selama 7 hari atau lebih diskon 15%");
                System.out.println("|===============================================|");
                System.out.println("");
                
                
                System.out.print("Pilih mobil (1-" + 5 + "): ");
                int pilihmobil = input.nextInt();
                
                if ((pilihmobil < 1) || (pilihmobil > 5)){
                   System.out.println("Pilihan tidak valid!!");
                   break;
                }
                 if (stokMobil[pilihmobil - 1] <= 0) {
                   System.out.println("Maaf, stok mobil ini habis!");
                   break;                
                }
                
                
                System.out.print("Input Tanggal (1-31) : ");
                int day = input.nextInt();
                if ((day < 1)||(day > 31)) {
                        System.out.println("Tanggal tidak valid!");
                        break;
                    }
                System.out.print("Input Bulan   (1-12) : ");
                int month = input.nextInt();
                if ((month < 1)||(month > 12)) {
                        System.out.println("Bulan tidak valid!");
                        break;
                    }
                System.out.print("Input Tahun          : ");
                int year = input.nextInt();
                
                String tgl = day +"/"+ month +"/"+ year;
                
                System.out.print("Berapa hari ingin disewa: ");
                    int harimobil = input.nextInt();

                    
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

                    if (harimobil >= 7) {
                        diskonmobil = 0.15;
                    } 
                    else if (harimobil >= 3) {
                        diskonmobil = 0.10; 
                    }

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
                    System.out.println("Nama             : "+nama);
                    System.out.println("Mobil            : " + mobil[pilihmobil - 1]);
                    System.out.println("Harga/Hari       : Rp " + hargaperharimobil);
                    System.out.println("Tanggal Pinjam   : " + tgl);
                    System.out.println("Tanggal Kembali  : " + tglKembali);
                    System.out.println("Lama Sewa        : " + harimobil + " hari");
                    if (diskonmobil > 0) {
                    System.out.println("Harga Awal       : Rp " + totalmobil);
                    System.out.println("Diskon           : " + (diskonmobil * 100) + "%");
                    System.out.println("Potongan Diskon  : Rp " + (int)potonganmobil);
                    System.out.println("Total Bayar      : Rp " + (int)totalbayarmobil);
                    } else {
                    System.out.println("Total Bayar      : Rp " + (int)totalbayarmobil);
                    }
                    System.out.println("Uang Masuk       : Rp " + uangmobil);
                    System.out.println("Kembalian        : Rp " + kembalianmobil);
                    System.out.println("============= TERIMA KASIH ============");

                    riwayat[jumlahriwayat] =
                            "Nama Pelanggan: " + nama + " | [MOBIL] " + mobil[pilihmobil - 1] + " | Pinjam: " + tgl +
                            " | Kembali: " + tglKembali + " | " + harimobil +
                            " hari | Total: Rp " + totalbayarmobil;
                    jumlahriwayat++;
                    stokMobil[pilihmobil - 1]--;

                    break;
               
            case 2 :
                System.out.println("===========================================");
                System.out.print("Masukkan Nama Penyewa: ");
                String namamtr = input.nextLine();
                
                System.out.println("");
                System.out.println("|===============DAFTAR MOTOR===============|");
                for (int i = 0; i < 5; i++) {
                        System.out.println(" "+(i + 1) + ". " + motor[i] + " - Rp "
                                + hargamotor[i] + "/hari - Stok: " + stokMotor[i]);
                    } 
                System.out.println("|==========================================|");
                System.out.println("Sewa selama 3 hari atau lebih diskon 10%");
                System.out.println("Sewa selama 7 hari atau lebih diskon 15%");
                System.out.println("|==========================================|");
                System.out.println("");
                
                System.out.print("Pilih motor (1-" + 5 + "): ");
                int pilihmotor = input.nextInt();
                
                if ((pilihmotor < 1) || (pilihmotor > 5)){
                    System.out.println("Pilihan tidak valid!!");
                    break;
                }
                if (stokMotor[pilihmotor - 1] <= 0) {
                    System.out.println("Maaf, stok motor ini habis!");
                    break;
                }
                
                System.out.print("Input Tanggal (1-31) : ");
                int daymtr = input.nextInt();
                if ((daymtr < 1)||(daymtr > 31)) {
                        System.out.println("Tanggal tidak valid!");
                        break;
                    }
                System.out.print("Input Bulan   (1-12) : ");
                int monthmtr = input.nextInt();
                if ((monthmtr < 1)||(monthmtr > 12)) {
                        System.out.println("Bulan tidak valid!");
                        break;
                    }
                System.out.print("Input Tahun          : ");
                int yearmtr = input.nextInt();
                
                String tglmtr = daymtr +"/"+ monthmtr +"/"+ yearmtr;

                int d2 = daymtr;
                int m2 = monthmtr;
                int y2 = yearmtr;

                System.out.print("Berapa hari ingin disewa: ");
                    int harimotor = input.nextInt();

                   
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

                    if (harimotor >= 7) {
                        diskonmotor = 0.15;
                    } 
                    else if (harimotor >= 3) {
                        diskonmotor = 0.10;
                    }

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
                    System.out.println("Nama             : " +namamtr);
                    System.out.println("Motor            : " + motor[pilihmotor - 1]);
                    System.out.println("Harga/Hari       : Rp " + hargaperharimotor);
                    System.out.println("Tanggal Pinjam   : " + tglmtr);
                    System.out.println("Tanggal Kembali  : " + kembaliMo);
                    System.out.println("Lama Sewa        : " + harimotor + " hari");
                    if (diskonmotor > 0) {
                    System.out.println("Harga Awal       : Rp " + totalmotor);
                    System.out.println("Diskon           : " + (diskonmotor * 100) + "%");
                    System.out.println("Potongan Diskon  : Rp " + (int)potonganmotor);
                    System.out.println("Total Bayar      : Rp " + (int)totalbayarmotor);
                    } else {
                    System.out.println("Total Bayar      : Rp " + (int)totalbayarmotor);
                    }
                    System.out.println("Uang Masuk       : Rp " + uangmotor);
                    System.out.println("Kembalian        : Rp " + kembalianmotor);
                    System.out.println("============= TERIMA KASIH ============");

                    riwayat[jumlahriwayat] =
                            "Nama Pelanggan: " + namamtr + " | [MOTOR] " + motor[pilihmotor - 1] +  " | Pinjam: " + tglmtr +
                            " | Kembali: " + kembaliMo + " | " + harimotor +
                            " hari | Total: Rp " + totalbayarmotor;
                    jumlahriwayat++;
                    stokMotor[pilihmotor - 1]--;

                    break;
                
            case 3:
                    System.out.println("\n===== STOK KENDARAAN =====");

                    System.out.println("\n--- STOK MOBIL ---");
                    for (int i = 0; i < mobil.length; i++) {
                        System.out.println((i+1) + ". " + mobil[i] + " | Stok: " + stokMobil[i]);
                    }

                    System.out.println("\n--- STOK MOTOR ---");
                    for (int i = 0; i < motor.length; i++) {
                        System.out.println((i+1) + ". " + motor[i] + " | Stok: " + stokMotor[i]);
                    }
                    break;

                    
            case 4:
                    System.out.println("\n===== RIWAYAT TRANSAKSI =====");

                    if (jumlahriwayat == 0) {
                        System.out.println("Belum ada transaksi.");
                    } 
                    else 
                    {
                        for (int i = 0; i < jumlahriwayat; i++) {
                            System.out.println((i + 1) + ". " + riwayat[i]);
                        }
                    }
                    break;

            case 5:
                    System.out.print("\nSebelum keluar, apakah Anda ingin memberi rating? (y/n): ");
                    char r = input.next().charAt(0);

                    if (r == 'y') {
                        System.out.print("Beri rating 1-5: ");
                        int rating = input.nextInt();

                        System.out.print("Ada saran atau masukan? (Kosongkan jika tidak): ");
                        input.nextLine();
                        String saran = input.nextLine();

                        System.out.println("\nJawaban diterima, Terima kasih telah menggunakan GO-RENT!");
                    }
                    else if (r == 'n')
                    {
                        System.out.println("\nTerima kasih telah menggunakan GO-RENT!");
                    }
                    
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

