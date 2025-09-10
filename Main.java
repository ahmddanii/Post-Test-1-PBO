import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;


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

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<JadwalRoket> jadwalRoket = new ArrayList<>();

        int pilihan;
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

                    case 5:
                        System.out.println("Terima Kasih! ");
                        break;

                    default:
                        System.out.println("⚠ Pilihan tidak valid!");
            }
        } while (pilihan !=5);

        input.close();
    }
}