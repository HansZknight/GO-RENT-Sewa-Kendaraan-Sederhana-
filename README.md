🟦 GO-RENT — Aplikasi Rental Kendaraan Berbasis Java (Console App)

GO-RENT adalah aplikasi sederhana berbasis Java yang digunakan untuk mengelola penyewaan mobil dan motor secara digital melalui antarmuka console.
Aplikasi ini dirancang untuk memudahkan proses transaksi, pengecekan stok, penghitungan biaya, hingga pencatatan riwayat penyewaan.

🚀 Fitur Utama
1. Sewa Mobil

Memilih jenis mobil dari daftar 5 pilihan.

Perhitungan total biaya otomatis.

Diskon otomatis:

≥ 3 hari → 10%

≥ 7 hari → 15%

Sistem tanggal kembali otomatis (tanpa library tambahan).

Validasi stok & input tanggal.

Menampilkan struk pembayaran lengkap.

2. Sewa Motor

Sistem serupa dengan sewa mobil.

Menyediakan 5 pilihan motor dengan harga berbeda.

Perhitungan diskon dan tanggal kembali otomatis.

Struk transaksi ditampilkan secara detail.

3. Cek Stok Kendaraan

Menampilkan stok terkini untuk semua mobil dan motor.

Stok berkurang otomatis setelah transaksi berhasil.

4. Riwayat Transaksi

Menyimpan hingga 100 riwayat transaksi.

Menampilkan transaksi secara berurutan (mobil & motor).

5. Sistem Rating (Sebelum Keluar)

Pengguna dapat memberi rating (1–5).

Bisa meninggalkan saran atau masukan.

Sistem keluar dengan pesan terima kasih.

📌 Struktur Menu Utama
         GO-RENT        
|======================|
| 1. SEWA MOBIL        |
| 2. SEWA MOTOR        |
| 3. CEK STOK UNIT     |
| 4. RIWAYAT TRANSAKSI |
| 5. KELUAR            |
|======================|

🛠️ Teknologi yang Digunakan

Java Standard Edition

Scanner (untuk input pengguna)

Array untuk menyimpan:

daftar kendaraan

harga

stok

riwayat transaksi

Tidak memakai library eksternal sehingga sangat ringan dan mudah dijalankan.

📥 Cara Menjalankan Program
1. Clone Repository
git clone https://github.com/username/GoRent-Java.git

2. Masuk ke folder project
cd GoRent-Java

3. Compile program
javac TBPDDPUAS.java

4. Jalankan
java TBPDDPUAS

📊 Flow Program

User memilih menu.

Program memvalidasi input.

Jika menyewa:

Pilih kendaraan

Masukkan tanggal

Masukkan lama sewa

Sistem menghitung:

Harga awal

Diskon

Total bayar

Tanggal kembali

Menampilkan struk transaksi.

Riwayat disimpan.

Stok berkurang otomatis.

Saat keluar → pengguna dapat memberi rating.

🧾 Contoh Output Struk
========= STRUK SEWA MOBIL ==========
Nama             : Andi
Mobil            : Toyota Avanza
Harga/Hari       : Rp 300000
Tanggal Pinjam   : 2/12/2025
Tanggal Kembali  : 5/12/2025
Lama Sewa        : 3 hari
Harga Awal       : Rp 900000
Diskon           : 10%
Potongan Diskon  : Rp 90000
Total Bayar      : Rp 810000
Uang Masuk       : Rp 1000000
Kembalian        : Rp 190000
============= TERIMA KASIH ===========

🔒 Validasi Sistem

Program telah dilengkapi dengan berbagai validasi:

✔ Input tanggal valid

✔ Input pilihan kendaraan (1–5)

✔ Stok tidak boleh negatif

✔ Uang pembayaran harus cukup

✔ Menangani error input menggunakan try-catch

👥 Anggota Tim

(Sesuaikan sendiri dengan nama kelompok kalian)

Nama 1 — Developer

Nama 2 — Dokumentasi & Testing

Nama 3 — Analyst

Nama 4 — Debugging

📌 Catatan Pengembangan

Beberapa hal yang dapat ditingkatkan untuk versi selanjutnya:

Sistem login admin

Penyimpanan riwayat dengan file .txt atau database

Perhitungan tanggal menggunakan library LocalDate

Mendesain UI berbasis GUI (JavaFX / Swing)

Integrasi ke database untuk rental skala besar

🎉 Penutup

GO-RENT dibuat sebagai aplikasi sederhana namun fungsional untuk mempelajari konsep dasar:

Array

Kondisi

Perulangan

Validasi input

Perhitungan otomatis

Pembuatan struk

Aplikasi ini diharapkan menjadi dasar untuk membangun sistem rental yang lebih kompleks dan modern.
