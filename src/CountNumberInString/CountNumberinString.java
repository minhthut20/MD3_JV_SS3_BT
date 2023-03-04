package CountNumberInString;

import java.util.Scanner;

public class CountNumberinString {
    public static void main(String[] args) {
        String word = "Bitter Butter";
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        String target;
        do {
            System.out.println("Input the key you want to find");
            target = scanner.nextLine();
        }
        while (target.length()>1);

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == target.charAt(0)) {
                count+=1;
            }
        }
        System.out.println("There are " + count + " in the word");
    }
}
