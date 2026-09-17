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
