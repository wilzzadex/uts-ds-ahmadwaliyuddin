package no4;

import no3.Mahasiswa;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class no4 {
    public static void getNo4() throws Exception {

        Scanner inputanJmlMahasiswa = new Scanner(System.in);
        List<Mahasiswa> mahasiswaList = new ArrayList<>();
        System.out.println("Masukkan Jumlah Mahasiswa yang akan di input: ");
        int jmlMahasiswa = inputanJmlMahasiswa.nextInt();
        System.out.println("\n");
//
//
        Scanner inputNama = new Scanner(System.in);
        Scanner inputKelas = new Scanner(System.in);
        Scanner inputTglMasuk = new Scanner(System.in);

        for (int i = 0; i < jmlMahasiswa; i++) {

            int randomInt = (int) (Math.random() * 100 + 1);
            int id = randomInt;

            System.out.print("Masukkan Nama Mahasiswa ke " + (i + 1) + " : ");
            String nama = inputNama.nextLine();

            System.out.print("Masukkan Kelas Mahasiswa ke " + (i + 1) + " : ");
            String kelas = inputKelas.nextLine();

            System.out.print("Masukkan Tanggal Masuk Mahasiswa ke " + (i + 1) + " : ");
            int tglMasuk = inputTglMasuk.nextInt();


            mahasiswaList.add(new Mahasiswa(id, nama, kelas, tglMasuk));
        }

        LinkedList mList = new LinkedList();
        for (int i = 0; i < mahasiswaList.size(); i++) {
            mList.addFirst(mahasiswaList.get(i));
        }

        System.out.println("\n");

        System.out.println("=== Print All Data Mahasiswa ===");
        mList.forEach(System.out::println);

        System.out.println("=== Size Data Mahasiswa ===");
        System.out.println(mList.size());

        Scanner inputanIndex = new Scanner(System.in);
        System.out.println("Masukkan Index Mahasiswa yang akan dihapus: ");
        int index = inputanIndex.nextInt();

        if(index > mList.size()){
            System.out.println("Index yang anda masukkan tidak ada");
        }else{
            mList.remove(index);
            System.out.println("=== Print Data Mahasiswa Setelah Remove ===");
            mList.forEach(System.out::println);
        }

        return;
    }
}
