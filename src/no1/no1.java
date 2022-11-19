package no1;

public class no1 {
    public static void getNo1(){
        int randomArray[] = {71,4,6,9,12,10,23,17,2,8,5,29,87,96,65};
        for(int i = 0; i < randomArray.length; i++) {
            if(randomArray[i] % 2 == 0) {
                System.out.println(randomArray[i] + " --> Bilangan Genap");
            }else{
                System.out.println(randomArray[i] + " --> Bilangan Ganjil");
            }
        }
        return;
    }

}
