<div align="center">
🚀 GO-RENT
Java Console-Based Vehicle Rental System
<img src="https://img.shields.io/badge/Language-Java-red?style=for-the-badge"> <img src="https://img.shields.io/badge/Version-1.0-blue?style=for-the-badge"> <img src="https://img.shields.io/badge/Type-Console--App-green?style=for-the-badge"> </div>
🔥 Tentang GO-RENT

GO-RENT adalah aplikasi penyewaan mobil dan motor berbasis Java Console, dirancang untuk mempermudah proses rental kendaraan secara cepat, efisien, dan akurat.
Program ini mendukung perhitungan otomatis, diskon, validasi input, hingga riwayat transaksi.

Aplikasi ini cocok untuk pembelajaran Java fundamental, tugas kuliah, maupun proyek pemula.

✨ Fitur Utama
🟦 1. Sewa Mobil

5 pilihan mobil.

Hitung biaya otomatis.

Diskon otomatis:

3 hari → 10%

7 hari → 15%

Hitung tanggal kembali dengan logika manual.

Struk pembayaran lengkap.

🟩 2. Sewa Motor

Sistem identik dengan sewa mobil.

5 tipe motor lengkap dengan harga, stok, dan diskon.

🟧 3. Cek Stok

Tabel stok mobil & motor yang selalu update.

🟪 4. Riwayat Transaksi

Menyimpan hingga 100 transaksi.

Format rapi dan terstruktur.

🟥 5. Sistem Rating

Input rating 1–5 saat keluar.

Dapat menambahkan saran.

🧭 Menu Utama
         GO-RENT        
|======================|
| 1. SEWA MOBIL        |
| 2. SEWA MOTOR        |
| 3. CEK STOK UNIT     |
| 4. RIWAYAT TRANSAKSI |
| 5. KELUAR            |
|======================|

🛠️ Teknologi
Komponen	Keterangan
Bahasa	Java
Input	Scanner
Struktur Data	Array
Output	Console
Error Handling	Try–Catch
📥 Cara Menjalankan
git clone https://github.com/username/GoRent-Java.git
cd GoRent-Java
javac TBPDDPUAS.java
java TBPDDPUAS

🧾 Contoh Struk
========= STRUK SEWA MOBIL ==========
Nama             : Andi
Mobil            : Toyota Avanza
Harga/Hari       : Rp 300000
Tanggal Pinjam   : 2/12/2025
Tanggal Kembali  : 5/12/2025
Lama Sewa        : 3 hari
Diskon           : 10%
Total Bayar      : Rp 810000
Kembalian        : Rp 190000
============= TERIMA KASIH ===========

📊 Alur Program
flowchart TD
A[Mulai Program] --> B[Menu Utama]
B -->|1| C[Sewa Mobil]
B -->|2| D[Sewa Motor]
B -->|3| E[Cek Stok]
B -->|4| F[Lihat Riwayat]
B -->|5| G[Exit + Rating]

C --> H[Hitung Biaya + Struk]
D --> H
H --> B

E --> B
F --> B
G --> I[Selesai]

⭐ Keunggulan GO-RENT

🔹 Antarmuka sederhana, mudah digunakan

🔹 Perhitungan otomatis tanpa library tanggal

🔹 Validasi input lengkap

🔹 Stok kendaraan dinamis

🔹 Bisa dikembangkan ke versi GUI atau database

🧩 Pengembangan Selanjutnya

Integrasi database (MySQL / SQLite)

Migrasi ke GUI (JavaFX / Swing)

Export riwayat ke file .txt atau .csv

Login admin + manajemen kendaraan

👥 Tim Pengembang

Silakan isi sesuai kelompok kalian.

Nama	Peran
Developer 1	Programmer
Developer 2	Dokumentasi
Developer 3	Tester
Developer 4	Analyst
<div align="center">
🎉 Terima Kasih Telah Menggunakan GO-RENT

"Simple. Fast. Efficient."

</div>
