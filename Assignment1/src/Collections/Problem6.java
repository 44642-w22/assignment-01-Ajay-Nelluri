package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;

public class Problem6 {

	public static void main(String[] arg) {

		Stack<Integer> S = new Stack<>();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the even number of elements to place on the stack:");
		
		int stackSize = sc.nextInt();
		boolean user = false;
		do {
			if (stackSize % 2 == 0) {
				System.out.println("Enter the Elements");
				int i = 0;
				while (i < stackSize) {

					int number = sc.nextInt();
					S.push(number);

					i++;
				}
				System.out.println("Input (S): " + S);

				ArrayList<Integer> A = new ArrayList<>();
				int size = stackSize / 2;
				for (int j = 0; j < size; j++) {
					A.add(S.pop());
				}
				S.sort(Collections.reverseOrder());
				for (int j = 0; j < size; j++) {
					A.add(S.pop());
				}
				System.out.println("Output (A): " + A);
				break;
			} else {
				
				System.out.println("Enter the only even number of elements:");
				stackSize = sc.nextInt();
				if (stackSize % 2 == 0) {
					user = true;
				}
			}
		} while (user);

	}

}
