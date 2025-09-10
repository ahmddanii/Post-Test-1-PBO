Ahmad Dani | 2409116074

# Sistem Manajemen Peluncuran Roket NASA

# Deskripsi Program
Program ini adalah sebuah sistem CRUD (Create, Read, Update, Delete) sederhana yang digunakan untuk memanajemen jadwal penluncuran roket pada NASA (National Aeronautics and Space Administration).

## Alur Program
1. Menu Utama

<img width="606" height="442" alt="image" src="https://github.com/user-attachments/assets/0b9693f7-4007-4079-b66b-24ca9a8a2c63" />

Menu ini akan tampil pada saat pertama kali program dijalankan

2. Menu Tambah Jadwal Penerbangan

<img width="478" height="347" alt="image" src="https://github.com/user-attachments/assets/5fac4b9e-78b6-47ae-8102-77f892839545" />

Menu ini berfungsi untuk menambahkan jadwal roket yang akan diluncurkan

3. Menu Lihat Jadwal Penerbangan

<img width="450" height="53" alt="image" src="https://github.com/user-attachments/assets/dbe481f9-52de-4499-8060-76b7db24e03e" />

Jadwal penerbangan yang ada akan kelihatan di menu ini

4. Menu Perbarui Jadwal Penerbangan

<img width="468" height="441" alt="image" src="https://github.com/user-attachments/assets/3f344587-8cbc-484d-8308-de9b2ae10870" />

Menu ini berfungsi untuk mengupdate data data roket yang ada, bisa dipilih sesuai dengan apa yang ingin diubah

5. Menu Hapus Jadwal Penerbangan

<img width="377" height="85" alt="image" src="https://github.com/user-attachments/assets/a8e293ae-066f-4075-a7e0-878bd18233e9" />

Menu ini berfungsi untuk menghapus data jadwal penerbangan yang ada dengan memasukkan id roket.

6. Menu keluar

<img width="156" height="86" alt="image" src="https://github.com/user-attachments/assets/a6bb95d2-5e6b-4220-bfef-7eb149d6583d" />

Menu ini berfungsi untuk menghentikkan program.

## Penjelasan Kode

```java
import java.util.ArrayList;
import java.util.Scanner;
```

Kode diatas digunakan untuk mengimport java package seperti ArrayList yang berfungsi untuk menyimpan data peluncuran roket nantinya dan Scanner yang akan menerima input dari pengguna sistem ini.

```java
public class Main {

    static class JadwalRoket {
        int id;
        String namaRoket;
        String tujuan;
        String tanggal;
        String status;

        public JadwalRoket(int id, String namaRoket, String tujuan, String tanggal, String status) {
            this.id = id;
            this.namaRoket = namaRoket;
            this.tujuan = tujuan;
            this.tanggal = tanggal;
            this.status = status;
        }
    }
```

Pada program ini hanya ada 1 class utama yang bernama main, dan merupakan tempat menampung dari object-object yang ada pada program. Lalu selanjutnya ada class JadwalRoket class ini digunakan sebagai model data untuk menyimpan informasi setiap jadwal penerbangan roket.
Setiap object JadwalRoket akan menyimpan data:

* id → Nomor unik untuk setiap jadwal
* namaRoket → Nama roket yang akan diluncurkan
* tujuan → Lokasi tujuan penerbangan
* tanggal → Tanggal jadwal peluncuran
* status → Status penerbangan (Dijadwalkan, Selesai, atau Dibatalkan)

```java
public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<JadwalRoket> jadwalRoket = new ArrayList<>();

        int pilihan;
```

Kode di atas adalah bagian dari method utama main pada bahasa Java yang menjadi titik awal eksekusi program. Pada baris pertama, digunakan `Scanner input = new Scanner(System.in);` untuk membuat object Scanner yang berfungsi membaca input dari pengguna melalui keyboard. Selanjutnya, `ArrayList<JadwalRoket> jadwalRoket = new ArrayList<>();` membuat sebuah object `ArrayList` dengan tipe data `JadwalRoket` untuk menyimpan data jadwal penerbangan roket secara dinamis, sehingga data dapat ditambah, dihapus, dan ditampilkan. Terakhir, `int pilihan;` mendeklarasikan sebuah variabel bertipe integer yang digunakan untuk menyimpan pilihan menu dari pengguna saat menjalankan program.

```java
do {
            System.out.println("-----------------------------------------------------------");
            System.out.println("|    .__   __.      ___           _______.     ___        |");
            System.out.println("|    |  \\ |  |     /   \\         /       |    /   \\       |");
            System.out.println("|    |   \\|  |    /  ^  \\       |   (----`   /  ^  \\      |");
            System.out.println("|    |  . `  |   /  /_\\  \\       \\   \\      /  /_\\  \\     |");
            System.out.println("|    |  |\\   |  /  _____  \\  .----)   |    /  _____  \\    |");
            System.out.println("|    |__| \\__| /__/     \\__\\ |_______/    /__/     \\__\\   |");
            System.out.println();
            System.out.println("|     NASA - Sistem Manajemen Jadwal Penerbangan Roket    |");
            System.out.println("-----------------------------------------------------------");
            System.out.println("[1] Tambah jadwal penerbangan");
            System.out.println("[2] Lihat jadwal penerbangan");
            System.out.println("[3] Perbarui jadwal penerbangan");
            System.out.println("[4] Hapus jadwal penerbangan");
            System.out.println("[5] Keluar");
            System.out.println("Pilih menu: ");
            pilihan = input.nextInt();
            input.nextLine();
```
Pada program ini saya menggunakan perulangan do while, dan kode di atas adalah tampilan utama dari program yang akan meminta inputan 1-5 dari pengguna.

```java
switch(pilihan) {
                case 1:
                    System.out.println("Masukkan Id Roket: ");
                    int id = input.nextInt();
                    input.nextLine();
                    System.out.println("Masukkan Nama Roket: ");
                    String namaRoket = input.nextLine();
                    System.out.println("Masukkan Tujuan: ");
                    String tujuan = input.nextLine();
                    System.out.println("Masukkan Tanggal Peluncuran: ");
                    String tanggal = input.nextLine();
                    System.out.println("Masukkan Status (Terjadwal/Ditunda/Selesai): ");
                    String status = input.nextLine();

                    jadwalRoket.add(new JadwalRoket(id, namaRoket, tujuan, tanggal, status));
                    System.out.println("Jadwal berhasil ditambahkan!");
                    break;
```

Selanjutnya masuk ke percabangan, disini saya menggunakan switch case untuk masuk ke menu yang ada. Pada kondisi pertama user akan diminta untuk menginputkan data terkait peluncuran roket, data yang sudah diinputkan akan disimpan ke dalam `ArrayList` yang sudah dibuat sebelumnya

```java
case 2:
                    if(jadwalRoket.isEmpty()) {
                        System.out.println("⚠ Belum ada jadwal penerbangan! ⚠ ");
                    } else {
                        System.out.println("\n----- Jadwal Roket -----");
                        for(JadwalRoket jr : jadwalRoket) {
                            System.out.println(jr.id + " | " + jr.namaRoket + " | " + jr.tujuan + " | " + jr.tanggal + " | " + jr.status);
                        }
                    }
                    break;
```

Pada case 2 program akan menampilkan data data dari `ArrayList`. Data hanya akan ditampilkan jika `ArrayList` memiliki isi, jika tidak maka akan tampil `⚠ Belum ada jadwal penerbangan! ⚠`
  
```java
case 3:
                    System.out.println("-------  Update Jadwal Roket -------");
                    if(jadwalRoket.isEmpty()) {
                        System.out.println("⚠ Belum ada jadwal penerbangan! ⚠ ");
                    } else {
                        for(JadwalRoket jr : jadwalRoket) {
                            System.out.println(jr.id + " | " + jr.namaRoket + " | " + jr.tujuan + " | " + jr.tanggal + " | " + jr.status);
                        }
                    }
                    System.out.println("Masukkan ID Roket: ");
                    int updateId = input.nextInt();
                    input.nextLine();
                    boolean ditemukan = false;

                    for(JadwalRoket jr : jadwalRoket) {
                        if (jr.id == updateId) {
                            int pilihanUpdate;
                            System.out.println("----- Pilih yang ingin diubah -----");
                            System.out.println("[1] Nama Roket");
                            System.out.println("[2] Tujuan Roket");
                            System.out.println("[3] Tanggal Peluncuran Roket");
                            System.out.println("[4] Status Roket");
                            pilihanUpdate = input.nextInt();
                            input.nextLine();

                            switch(pilihanUpdate) {
                                case 1:
                                    System.out.println("Masukkan Nama Roket Baru: ");
                                    jr.namaRoket = input.nextLine();
                                    System.out.println("Nama Roket Berhasil Diperbarui!");
                                    ditemukan = true;
                                    break;
                                case 2:
                                    System.out.println("Masukkan Tujuan Baru: ");
                                    jr.tujuan = input.nextLine();
                                    System.out.println("Tujuan Roket Berhasil Diperbarui!");
                                    ditemukan = true;
                                    break;
                                case 3:
                                    System.out.println("Masukkan Tanggal Peluncuran Baru: ");
                                    jr.tanggal = input.nextLine();
                                    System.out.println("Tanggal Peluncuran Roket Berhasil Diperbarui!");
                                    ditemukan = true;
                                    break;
                                case 4:
                                    System.out.println("Masukkan Status Baru: ");
                                    String statusBaru = input.nextLine();
                                    System.out.println("Status Roket Berhasil Diperbarui!");
                                    jr.status = statusBaru;
                                    ditemukan = true;
                                    break;
                                default:
                                    System.out.println("⚠ Menu Tidak Tersedia! ⚠");
                                    return;
                            }
                            System.out.println("Jadwal berhasil diperbarui!");
                        }
                    }

                    if (!ditemukan) {
                        System.out.println("⚠ Id Roket tidak ditemukan! ⚠");
                    }
                    break;
```

Untuk menu update sendiri, pengguna bisa memilih ingin mengupdate apa saja. Tanpa harus mengupdate keseluruhan data yang ada

```java
case 4:
                        System.out.println("Masukkan ID Roket yang ingin dihapus: ");
                        int hapusId = input.nextInt();
                        input.nextLine();
                        boolean terhapus = false;

                        for(int i = 0; i < jadwalRoket.size(); i++) {
                            if (jadwalRoket.get(i).id == hapusId) {
                                jadwalRoket.remove(i);
                                terhapus = true;
                                System.out.println("Jadwal berhasil dihapus!");
                                break;
                            }
                        }

                        if (!terhapus) {
                            System.out.println("⚠ Jadwal tidak ditemukan! ⚠");
                        }
                        break;
```
Kode diatas digunakan untuk menghapus data jadwal roket berdasarkan ID. Program meminta pengguna memasukkan ID roket, lalu melakukan perulangan pada ArrayList jadwalRoket untuk mencari data yang cocok. Jika ditemukan, data dihapus dengan remove() dan menampilkan pesan sukses. Jika tidak ditemukan, program menampilkan pesan peringatan.

```java
case 5:
                        System.out.println("Terima Kasih! ");
                        break;

                    default:
                        System.out.println("⚠ Pilihan tidak valid!");
            }
```

Kode diatas berfungsi untuk keluar dari program dan menangani input yang salah. Pada case 5, program menampilkan pesan "Terima Kasih!" saat pengguna memilih keluar. Sedangkan pada bagian default, program menampilkan peringatan "Pilihan tidak valid!" jika pengguna memasukkan menu yang tidak tersedia.
```java
} while (pilihan !=5);

        input.close();
    }
}
```
Potongan kode ini merupakan bagian akhir dari sebuah loop menu interaktif yang menggunakan do-while. Loop ini akan terus meminta input dari pengguna hingga mereka memilih opsi keluar, yaitu angka 5.



  
