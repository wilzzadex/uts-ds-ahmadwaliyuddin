package no2;

import java.util.Scanner;

public class no2 {
    public static void getNo2(){
        Scanner inputan = new Scanner(System.in);

        int inputArray[] = new int[10];

        for (int i = 0; i < inputArray.length; i++) {
            System.out.print("Masukkan Angka ke " + (i+1) +" : ");
            inputArray[i] = inputan.nextInt();
        }

        bubbleAbsenGenap(inputArray);
        selectionSortAbsenGanjil(inputArray);
        return;
    }

    public static void bubbleAbsenGenap(int[] array){
        int n = array.length;
        int temp = 0;
        for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){
                if(array[j-1] > array[j]){
                    // swap elements
                    temp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = temp;
                }
            }
        }

        // Bubble Absen Genap
        System.out.println("=== Bubble Sort ===");
        for (int i = 0; i < array.length; i++) {
                System.out.println(array[i]);
        }
    }

    public static void selectionSortAbsenGanjil(int[] array){
        for (int i = 0; i < array.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < array.length; j++){
                if (array[j] < array[index]){
                    index = j;//searching for lowest index
                }
            }
            int smallerNumber = array[index];
            array[index] = array[i];
            array[i] = smallerNumber;
        }

        // Selection Sort
        System.out.println("=== Selection Sort ===");
        for (int i = 0; i < array.length; i++) {
                System.out.println(array[i]);
        }
    }

}
