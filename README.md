# Aplikasi Cek Cuaca Sederhana

Aplikasi ini adalah program Java berbasis GUI yang memungkinkan pengguna untuk memeriksa cuaca di berbagai kota, memuat data cuaca dari file, menyimpan data cuaca ke file, dan menambahkan kota favorit.

## Identitas
- Nama  : Muhammad Raihan
- NPM   : 2210010364
- Kelas : 5B NonReg Banjarmasin

## Fitur
- **Cek Cuaca:** Dapat memeriksa cuaca terkini berdasarkan nama kota yang dimasukkan.
- **Kota Favorit:** Menambahkan dan menyimpan kota favorit untuk akses cepat di masa depan.
- **Simpan Data Cuaca:** Menyimpan data cuaca yang telah diperoleh ke dalam format CSV.
- **Muat Data Cuaca:** Memuat data cuaca yang disimpan sebelumnya dari file CSV.

## Cara Menggunakan
1. Ketikkan nama kota yang ingin diperiksa di dalam kotak teks yang tersedia.
2. Pilih kota dari dropdown jika ingin memeriksa cuaca kota favorit.
3. Klik tombol "Cek Cuaca" untuk mendapatkan informasi cuaca terkini.
4. Klik tombol "Tambah Favorit" untuk menyimpan kota yang telah diperiksa ke daftar favorit.
5. Klik tombol "Simpan Data" untuk menyimpan informasi cuaca yang telah diperoleh ke dalam file CSV.
6. Klik tombol "Muat Data" untuk memuat data cuaca dari file CSV yang telah disimpan sebelumnya.

## Teknologi yang Digunakan
- **Java**: Bahasa pemrograman untuk mengembangkan aplikasi.
- **Swing**: Framework GUI untuk membangun antarmuka pengguna.
- **API:** OpenWeatherMap API untuk mendapatkan data cuaca terkini
- **CSV**: Format file untuk ekspor dan impor data kontak.

## Keunggulan
- **User-friendly:** Antarmuka pengguna yang sederhana dan mudah digunakan.
- **Fleksibilitas:** Pengguna dapat memilih untuk memeriksa cuaca berdasarkan kota yang dimasukkan atau dari daftar kota favorit.
- **Data Penyimpanan:** Data cuaca dapat disimpan dan dimuat dengan mudah, memungkinkan akses di masa mendatang.

## Screenshot
![9](https://github.com/user-attachments/assets/bae154d5-dc0e-4c99-8a62-116a33802ab6)
![9_](https://github.com/user-attachments/assets/4e8dc996-ee3d-441c-88a8-2c520c9712e0)

## Cara Menjalankan Program
1. **Clone Repository:**
   Clone repositori ini ke mesin lokal Anda.
   ```bash
   git clone https://github.com/raihanuo/AplikasiCekCuacaSederhana.git
   
2. **Prasyarat:**
   - Pastikan Anda memiliki JDK terinstal di sistem Anda (Java Development Kit).
   - Dapatkan API Key dari [OpenWeatherMap](https://openweathermap.org/) dan masukkan ke dalam kode program.
  
3. **Kompilasi Program:**
   - Buka terminal/command prompt.
   - Navigasikan ke direktori tempat file Java disimpan.
   - Jalankan perintah:
     ```bash
     javac NewJFrame.java
     ```

4. **Jalankan Program:**
   - Setelah kompilasi berhasil, jalankan perintah berikut:
     ```bash
     java NewJFrame
     ```

5. **Nikmati Aplikasi:** Aplikasi akan terbuka, dan Anda dapat mulai memeriksa cuaca!
