package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Problem3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		ArrayList<Integer> A1 = new ArrayList<Integer>();
		System.out.print("Number of elements to be added to the list:");
		
		int a = sc.nextInt();
		if (a == 0) {
			if (A1.isEmpty()) {
				System.out.println(Integer.MIN_VALUE);
			}
		} else {
			System.out.print("Enter Array list A1 elements:");
			for (int k = 0; k < a; k++) {
				A1.add(sc.nextInt());
			}
			System.out.println("Input (A1): " + A1);
			System.out.println("Output: " + Collections.max(A1));
		}
	}

}
