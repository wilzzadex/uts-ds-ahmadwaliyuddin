import java.util.Scanner;

import static no1.no1.getNo1;
import static no2.no2.getNo2;
import static no3.no3.getNo3;
import static no4.no4.getNo4;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner inputNoSoal = new Scanner(System.in);
        System.out.println("Masukkan Nomor Soal yang akan dijalankan: ");
        int noSoal = inputNoSoal.nextInt();

        switch (noSoal){
            case 1:
                getNo1();
                rerunSoal(noSoal);
                main(args);
                break;
            case 2:
                getNo2();
                rerunSoal(noSoal);
                main(args);
                break;
            case 3:
                getNo3();
                rerunSoal(noSoal);
                main(args);
                break;
            case 4:
                getNo4();
                rerunSoal(noSoal);
                main(args);
                break;
            default:
                System.out.println("No Soal Tidak Ada");
                main(args);
        }

    }

    public  static void rerunSoal(int noSoal) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("Apakah anda ingin menjalankan soal lagi? (Y/N)");
        String pilihan = input.nextLine();
        if(pilihan.equals("Y") || pilihan.equals("y")) {
            switch (noSoal){
                case 1:
                    getNo1();
                    rerunSoal(noSoal);
                    break;
                case 2:
                    getNo2();
                    rerunSoal(noSoal);
                    break;
                case 3:
                    getNo3();
                    rerunSoal(noSoal);
                    break;
                case 4:
                    getNo4();
                    rerunSoal(noSoal);
                    break;
                default:
                    System.out.println("No Soal Tidak Ada");
                    rerunSoal(noSoal);
            }
        }
    }

//    public static void getIdentitas(){
//        int time = java.time.LocalTime.now().getHour();
//        String timeRange = "";
//        if(time >= 0 && time < 12) {
//            timeRange = "Pagi";
//        }
//        else if(time >= 12 && time < 15) {
//            timeRange = "Siang";
//        }
//        else if(time >= 15 && time < 18) {
//            timeRange = "Sore";
//        }
//        else if(time >= 18 && time < 24) {
//            timeRange = "Malam";
//        }
//
//        System.out.println("=== Selamat " + timeRange +" ===");
//        System.out.println("Nama : Ahmad Waliyuddin");
//        System.out.println("NPM : 22552011106");
//        System.out.println("Kelas: TIF RM 22A - OFFLINE");
//        System.out.println("UTS: Struktur Data");
//        System.out.println("===================================");
//    }
}