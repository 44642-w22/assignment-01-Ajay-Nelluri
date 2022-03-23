package Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Problem2 {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		List<Integer> L1 = new LinkedList<>();
		System.out.println("Please enter length of the list");
		int l1Length = sc.nextInt();
		
		while(l1Length>0) {
			System.out.println("Enter the numbers");
			int i = sc.nextInt();
			L1.add(i);
			l1Length -= 1;
		}
		
		System.out.println("Please enter the number to check sum");
		int k = sc.nextInt();
		
		System.out.println("Input (L1): "+L1);
		System.out.println("K= "+k);
		
		List<ArrayList<Integer>> L2 = new LinkedList<>();
		
		for(int i=0; i<L1.size()-1; i++) {
			int num = L1.get(i);
			int nextNum = L1.get(i+1);
			
			if(num + nextNum == k) {
				ArrayList<Integer> l = new ArrayList<>();
				l.add(num);
				l.add(nextNum);
				L2.add(l);
			}
		}
		
		System.out.println("Output (L2): "+L2);
	}

}
