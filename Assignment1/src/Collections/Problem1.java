package Collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Problem1 {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		LinkedList<Integer> L1 = new LinkedList<Integer>();
		LinkedList<Integer> L2 = new LinkedList<Integer>();
		
		System.out.println("Please enter length of the list");
		int l1Length = sc.nextInt();
		
		while(l1Length > 0) {
			int inp = sc.nextInt();
			L1.add(inp);
			l1Length -=1;
		}
		
		System.out.println("Input (L1): "+L1);
		
		Iterator<Integer> iterator = L1.iterator();
		while(iterator.hasNext()) {
			
			int i=1, sum=0;
			int n=iterator.next();
			while(i <= n/2) {
				
				if( n%i == 0) {
					sum = sum + i;
				}
				i++;
			}
			
			if(sum==n) {
				L2.add(n);
			}
			
		}
		
		System.out.println("Output (L2): "+L2);
		
	}

}
