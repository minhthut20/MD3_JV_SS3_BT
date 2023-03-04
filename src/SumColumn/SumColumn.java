package SumColumn;

import java.util.Scanner;

public class SumColumn {
    public static void main(String[] args) {
        int [][] array = {
                {1,2,3},
                {4,5,6}
        };
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the column you want to calculate");
        int column = scanner.nextInt();
        int total = 0;
        for (int i = 0; i < array.length; i++) {
            total+=array[i][column];
        }
        System.out.println("Total: " + total);
    }
}
