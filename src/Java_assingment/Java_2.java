package Java_assingment;

import java.util.Scanner;

public class Java_two {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String romanNumeral = scanner.nextLine().toUpperCase();
		int result = romanToInteger(romanNumeral);
		if (result == -1) {
			System.out.println("Invalid Roman numeral input.");
		} else {
			System.out.println("Integer equivalent: " + result);
		}
		scanner.close();
	}

	public static int romanToInteger(String s) {
		int result = 0;
		int prevValue = 0;
		for (int i = s.length() - 1; i >= 0; i--) {
			char currentChar = s.charAt(i);
			int currentValue = romanCharToValue(currentChar);
			if (currentValue == -1) {
				return -1;
			}
			if (currentValue < prevValue) {
				result -= currentValue;
			} else {
				result += currentValue;
			}
			prevValue = currentValue;
		}
		return result;
	}

	public static int romanCharToValue(char c) {
		switch (c) {
		case 'I':
			return 1;
		case 'V':
			return 5;
		case 'X':
			return 10;
		case 'L':
			return 50;
		case 'C':
			return 100;
		case 'D':
			return 500;
		case 'M':
			return 1000;
		default:
			return -1;
		}
	}
}
