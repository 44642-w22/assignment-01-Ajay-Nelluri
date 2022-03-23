package Collections;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem4 {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of the list");
		int size = sc.nextInt();
		ArrayList<String> list =  new ArrayList<>(size);
		ArrayList<String> list2 =  new ArrayList<>(size);
		for(int i=0; i <size; i++) {
			System.out.print("Enter the string: ");
			String n = sc.next();
			list.add(n);
		}
		
		System.out.println("Input (A1): "+list);
		for(String s: list) {
			list2.add(s);
		}
		list2.sort((s1,s2) -> s1.length()-s2.length() );
		System.out.println("Output (A2): "+list2);
		
	}
	
}

