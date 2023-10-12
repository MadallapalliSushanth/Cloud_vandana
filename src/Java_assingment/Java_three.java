package Java_assingment;

import java.util.Scanner;

public class Java_three {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String input = sc.nextLine().toLowerCase();
        boolean isPangram = isPangram(input);
        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }
    public static boolean isPangram(String input) {
        int[] letterCount = new int[26];
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (Character.isLetter(c)) {
                int index = c - 'a';
                letterCount[index]++;
            }
        }
        for (int count : letterCount) {
            if (count == 0) {
                return false;
            }
        }
        return true;
	}
}
