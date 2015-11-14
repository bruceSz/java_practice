package simpleTest;

import java.util.Scanner;

public class c9 {
	
	public static void power2() {
		Scanner scan = new Scanner(System.in);
		System.out.println("input a integer");
		long number = scan.nextLong();
		System.out.println("you have input: "+ number);
		System.out.println("multiply 2 = " + (number << 1));
		
	}

	public static void main(String[] args) {
		power2();
	}
}
