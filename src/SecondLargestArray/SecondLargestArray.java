package SecondLargestArray;

public class SecondLargestArray {
    public static void main(String[] args) {
        int[] array = {4, 7, 8, 2};
        int max1 = array[0];
        int max2 = array[1];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max1) {
                max1 = array[i];
            }
            if (array[i] > max2 ) {
                max2 = array[i];
                if(max2 < max1) {
                    break;
                }
            }
        }
        System.out.println(max2);
    }
}
