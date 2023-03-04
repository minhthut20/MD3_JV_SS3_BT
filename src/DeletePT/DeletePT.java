package DeletePT;

import java.util.Scanner;

public class DeletePT {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size;
        do {
            System.out.print("Nhập độ dài của mảng : ");
            size = input.nextInt();
            if (size > 20) {
                System.out.print("Dộ dài mảng không quá 20 phần tử ");
            }
        }
        while (size > 20);
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Nhập vào phần tử thứ  " + (i + 1) + " : ");
            arr[i] = input.nextInt();
        }
        System.out.print("Dãy số hiện tại là : ");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " \t ");
        }

        System.out.print("\nNhập giá trị phần tử cần xoá : ");
        int deleteValue = input.nextInt();
        int index = -1;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] == deleteValue) {
                index = j;
                break;
            }
        }

        int[] newArr = new int[size - 1];
        if (index < 0) {
            System.out.print("Không tìm thấy phần tử trong mảng ");
        } else {
            System.out.print("Mảng mới là : ");
            for (int j = 0; j < newArr.length; j++) {
                if (j < index) {
                    newArr[j] = arr[j];
                } else {
                    newArr[j] = arr[j + 1];
                }
                System.out.print(newArr[j] + " \t ");
            }
        }
    }
}
