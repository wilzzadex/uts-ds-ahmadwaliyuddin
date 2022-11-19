package no3;

import java.util.ArrayList;
import java.util.List;

public class no3 {
    public static void getNo3(){
        List<Mahasiswa> mahasiswaList = new ArrayList<>();
        mahasiswaList.add(new Mahasiswa(1,"Ahmad Waliyuddin", "TIF RM 22A - OFFLINE", 20));
        mahasiswaList.add(new Mahasiswa(2,"Ahmad", "TIF RM 22B - ONLINE", 23));
        mahasiswaList.add(new Mahasiswa(3,"Willy", "TIF RM 22C - HYBRID", 04));
        mahasiswaList.add(new Mahasiswa(4,"Waliyuddin", "TIF RM 20A - OFFLINE", 10));
        mahasiswaList.add(new Mahasiswa(5,"Dinda Lestari", "TI RM 20A - ONLINE", 5));

        // get Size Array Sebelum di remove / add;
        System.out.println("===  get Size Array Sebelum di remove / add; ===");
        System.out.println(mahasiswaList.size());
        System.out.println("\n");

        // loop using forEach
        System.out.println("=== (Print all) di Looping menggunakan forEach ===");
        mahasiswaList.forEach(mahasiswa -> {
            System.out.println(mahasiswa);
        });
        System.out.println("\n");

        // loop using for
        System.out.println("=== (Print all) di Looping menggunakan for ===");
        for(int i = 0; i < mahasiswaList.size(); i++){
            System.out.println(mahasiswaList.get(i));
        }
        System.out.println("\n");

        // remove data ke 3
        System.out.println("=== Print After Remove Data Ke 2 ===");
        mahasiswaList.remove(1);
        mahasiswaList.forEach(mahasiswa -> {
            System.out.println(mahasiswa);
        });
        System.out.println("\n");

        // add data baru
        mahasiswaList.add(new Mahasiswa(7,"Fabio Quartararo", "DKV RM 20A - ONLINE", 2));
        mahasiswaList.add(new Mahasiswa(8,"Max Verstappen", "DKV RM 21B - OFFLINE", 25));
        System.out.println("=== Print After Remove and Add 2 Data ===");
        mahasiswaList.forEach(mahasiswa -> {
            System.out.println(mahasiswa);
        });
        System.out.println("\n");

        // get Size Array Setelah di remove / add;
        System.out.println("===  get Size Array Setelah di remove / add; ===");
        System.out.println(mahasiswaList.size());

        return;
    }
}
