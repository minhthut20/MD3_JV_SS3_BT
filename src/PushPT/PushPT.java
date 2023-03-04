package PushPT;

import java.util.Scanner;

public class PushPT {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập vào độ dài mảng : ");
        int size = input.nextInt();
        do {
            if (size>20){
                System.out.print("Nhập vào mảng không quá 20 phần tử : ");
            }
        }
        while (size>20);
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Nhập vào phần tử thứ " + ( i + 1 ) + " : ");
            array[i] = input.nextInt();
        }
        System.out.print("Mảng hiện tại là : ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
        System.out.print("Nhập vào phần tử muốn thêm : ");
        int addValue = input.nextInt();
        System.out.print( "\n Nhập vào vị trí muốn thêm : ");
        int index = input.nextInt();
        int[] newArray = new int[size+1];
        if (index<0 || index > array.length-1){
            System.out.println("Vị trí thêm vào không hợp lệ");
        }else {
            System.out.print("Mảng mới là : ");
            for (int j = 0; j < newArray.length; j++) {
                if (j < index) {
                    newArray[j] = array[j];
                } else if (j == index) {
                    newArray[j] = addValue;
                } else {
                    newArray[j] = array[j - 1];
                }
                System.out.print(newArray[j] + "\t");
            }
        }
    }
}
