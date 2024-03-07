import java.util.*;

class Mahasiswa {
    String nama, nim, jurusan;

    Mahasiswa(String nama, String nim, String jurusan) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
    }
}

class Universitas {
    String namaUniversitas;
    ArrayList<Mahasiswa> daftarMahasiswa;

    Universitas(String namaUniversitas) {
        this.namaUniversitas = namaUniversitas;
        this.daftarMahasiswa = new ArrayList<>();
    }
    void tambahMahasiswa(Mahasiswa mhs) {
        daftarMahasiswa.add(mhs);
    }

    void tampilkanDataMahasiswa() {
        System.out.println("Universitas " + namaUniversitas);
        for (Mahasiswa mhs : daftarMahasiswa) {
            System.out.println("Nama : " + mhs.nama + ", NIM : " + mhs.nim + ", Jurusan : " + mhs.jurusan);
        }
    }
}

public class boby  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Universitas umm = new Universitas("Universitas Muhammadiyah Malang");
        int pilihan;
        do {
            System.out.println("\nMenu : ");
            System.out.println("\n 1 Tambah Data Mahasiswa");
            System.out.println("\n 2. Tampilkan Data Mahasiswa");
            System.out.println("\n 3. Keluar");
            System.out.print("Pilihan Anda : ");
            pilihan = sc.nextInt();
            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan nama mahasiswa : ");
                    sc.nextLine();
                    String nama = sc.nextLine();
                    System.out.print("Masukkan NIM mahasiswa : ");
                    String nim = sc.nextLine();
                    while (nim.length() != 15) {
                        System.out.println("NIM harus 15 digit!");
                        System.out.println("Masukkan NIM mahasiswa : ");
                        nim = sc.nextLine();
                    }
                    System.out.print("Masukkan jurusan mahasiswa : ");
                    String jurusan = sc.nextLine();
                    umm.tambahMahasiswa(new Mahasiswa(nama, nim, jurusan));
                    System.out.println("Data mahasiswa berhasil ditambahkan.");
                    break;
                case 2:
                    umm.tampilkanDataMahasiswa();
                    break;
                case 3:
                    System.out.println("Selesai");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 3);
        sc.close();
    }
}