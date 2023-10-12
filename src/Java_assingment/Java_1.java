package Java_assingment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Java_one {

	public static void main(String[] args) {
		ArrayList<Integer> originalList = new ArrayList<>();
        originalList.add(1);
        originalList.add(2);
        originalList.add(3);
        originalList.add(4);
        originalList.add(5);
        originalList.add(6);
        originalList.add(7);
        Collections.shuffle(originalList);
        System.out.println("Shuffled Array: " + originalList);
        Scanner scanner = new Scanner(System.in);
        
        
	}

}
