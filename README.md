# Sistem Manajemen Daftar Wisata Di Kaltim #

* Nama : Ahmad Ahdasuki 
* NIM : 2509116021 
* Kelas : A Sistem Informasi 2025 
* Mata Kuliah : Pemograman Berbasis Objek


## **Penjelasan Alur Program**

### Deskripsi Singkat Program
Sistem Manajemen Tempat Wisata di Kalimantan Timur merupakan program berbasis Java yang digunakan untuk mengelola data tempat wisata. Program memungkinkan pengguna untuk menambah, menampilkan, memperbarui, dan menghapus data wisata melalui menu berbasis console.Tempat wisata dibagi menjadi dua jenis, yaitu Wisata Alam dan Wisata Buatan. Keduanya memiliki informasi umum seperti ID, nama, lokasi, dan harga tiket, serta memiliki informasi khusus masing-masing. Wisata Alam memiliki atribut jenis alam, tingkat kesulitan, dan fasilitas, sedangkan Wisata Buatan memiliki atribut jenis wahana, jam buka, jam tutup, dan batas usia.Program ini dibuat sebagai penerapan konsep Pemrograman Berorientasi Objek, khususnya class, object, constructor, encapsulation, getter dan setter, inheritance, ArrayList, CRUD, percabangan, dan perulangan.

### Penggunaan Setiap Class
* TempatWisata: superclass yang berisi data umum seperti ID, nama, lokasi, dan harga tiket.
* WisataAlam: subclass dari TempatWisata yang memiliki atribut tambahan seperti jenis alam, tingkat kesulitan, dan fasilitas.
* WisataBuatan: subclass dari TempatWisata yang memiliki atribut tambahan seperti jenis wahana, jam buka, jam tutup, dan batas usia.
* ManajemenWisata: mengelola data wisata dan proses CRUD menggunakan ArrayList.
* MainWisata: class utama untuk menjalankan program dan menampilkan menu.


### Penjelasan Penggunaan code Inheritence

Inheritance diterapkan dengan membuat class WisataAlam dan WisataBuatan sebagai subclass dari class TempatWisata menggunakan keyword extends.


```java
public class WisataAlam extends TempatWisata
```

```java
public class WisataBuatan extends TempatWisata
```

Artinya, WisataAlam dan WisataBuatan mewarisi atribut dan method yang terdapat pada TempatWisata, seperti idWisata, namaWisata, lokasi, hargaTiket, serta method tampilkanDataUmum().

TempatWisata menyimpan atribut dan method yang bersifat umum, seperti:

```java
private int idWisata;
private String namaWisata;
private String lokasi;
private int hargaTiket;
```

Sedangkan subclass menambahkan atribut yang lebih khusus sesuai dengan jenis wisatanya. WisataAlam memiliki atribut jenisAlam, tingkatKesulitan, dan fasilitasAlam yang digunakan untuk menyimpan informasi khusus tentang wisata alam. Sementara itu, WisataBuatan memiliki atribut jenisWahana, jamBuka, jamTutup, dan batasUsia yang digunakan untuk menyimpan informasi khusus tentang wisata buatan. Dengan demikian, kedua subclass memiliki data umum yang diwarisi dari TempatWisata sekaligus memiliki data khusus masing-masing.


Inheritance juga diterapkan menggunakan super() pada constructor:
```java
super(
    idWisata,
    namaWisata,
    lokasi,
    hargaTiket
);
```

super() digunakan untuk memanggil constructor dari superclass TempatWisata sehingga data umum tempat wisata dapat diinisialisasi. Setelah itu, masing-masing subclass memiliki atribut tambahan sesuai jenis wisatanya.

Jadi TempatWisata menjadi superclass yang menyimpan data umum, sedangkan WisataAlam dan WisataBuatan menjadi subclass yang mewarisi data tersebut dan menambahkan data khusus masing-masing jenis wisata.


### Dokumentasi Program

**1. Tampilan Menu Utama**

<img width="365" height="220" alt="image" src="https://github.com/user-attachments/assets/b407ecc3-c0c6-4a93-819b-6759aff0594c" />

Ini adalah tampilan awal atau menu utama saat program baru di jalankan.Menu utama program menyediakan berbagai fitur untuk mengelola data tempat wisata, yaitu tambah, tampilkan, update, hapus, dan keluar dari program. 

**2. Tampilkan Data Daftar Wisata**

<img width="308" height="564" alt="image" src="https://github.com/user-attachments/assets/a5aee822-0ceb-4896-a9d3-b7a4e7db81c9" />

Pilihan Menu 2 menunjukkan data tempat wisata yang telah tersimpan dalam program. Data dibagi menjadi dua kategori, yaitu Wisata Alam dan Wisata Buatan. Setiap kategori memiliki informasi umum seperti ID, nama, lokasi, dan harga tiket, serta informasi khusus sesuai jenis wisatanya. Pembagian data tersebut sesuai dengan studi kasus karena tempat wisata di Kalimantan Timur memiliki karakteristik yang berbeda. Wisata alam membutuhkan informasi seperti jenis alam dan tingkat kesulitan, sedangkan wisata buatan membutuhkan informasi seperti jenis wahana, jam operasional, dan batas usia.

**3. Tambah Menu Wisata**

<img width="356" height="564" alt="image" src="https://github.com/user-attachments/assets/6251e0c8-c302-4a9a-b80b-c44ec28e6f18" />

Pilihan menu 1 menunjukkan proses penambahan data wisata baru melalui menu tambah. Pengguna memasukkan data umum tempat wisata terlebih dahulu, kemudian memilih jenis wisata untuk menentukan data khusus yang harus dimasukkan. Fitur ini membuat data tempat wisata dapat ditambahkan secara dinamis tanpa harus mengubah source code. Pemilihan jenis wisata juga menunjukkan penerapan struktur class WisataAlam dan WisataBuatan.

**4. Update/Ubah Data Tempat Wisata**

<img width="429" height="479" alt="image" src="https://github.com/user-attachments/assets/1a0b30cb-2f4c-42f6-a62e-86ec2c82ad55" />

Pilihan menu 3 menunjukkan proses pembaruan data wisata berdasarkan ID. Setelah ID ditemukan, pengguna dapat mengubah informasi umum maupun informasi khusus dari tempat wisata tersebut. Fitur update menunjukkan bahwa program tidak hanya dapat menyimpan data, tetapi juga dapat memelihara dan memperbarui informasi apabila terjadi perubahan, misalnya perubahan harga tiket atau fasilitas.

**5. Hapus Data Tempat Wisata**

<img width="334" height="428" alt="image" src="https://github.com/user-attachments/assets/ba609906-9e7e-4022-bd3a-be7e47e745b3" />

Pilihan menu 4 menunjukkan proses penghapusan data wisata berdasarkan ID. Program mencari data berdasarkan ID yang dimasukkan, kemudian menghapus data tersebut dari ArrayList. Fitur hapus diperlukan agar data yang sudah tidak relevan dapat dikeluarkan dari sistem. Dengan demikian, data tempat wisata yang tersimpan tetap dapat dikelola sesuai kondisi yang sebenarnya.

**6. Keluar Program**

<img width="537" height="302" alt="image" src="https://github.com/user-attachments/assets/0cc49796-8c72-45a5-a272-631d279d737c" />

Pilihan menu 5 adalah keluar dari program yang menandakan program selesai.

Berdasarkan hasil running program, Sistem Manajemen Tempat Wisata di Kalimantan Timur mampu mengelola data tempat wisata melalui proses tambah, tampil, update, dan hapus. Data wisata dibedakan menjadi Wisata Alam dan Wisata Buatan dengan atribut khusus masing-masing. Hal ini menunjukkan bahwa program tidak hanya menerapkan konsep CRUD, tetapi juga menggunakan inheritance untuk mengelompokkan data berdasarkan karakteristik tempat wisata. Program dapat membantu pengelolaan informasi wisata secara lebih terstruktur sehingga data seperti lokasi, harga tiket, fasilitas, jam operasional, dan batas usia dapat disimpan dan diperbarui dengan mudah.





