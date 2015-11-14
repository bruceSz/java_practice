package simpleTest;

import java.util.Scanner;

public class c8 {

	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("please input a english name");
		String password = scanner.nextLine();
		char[] arr = password.toCharArray();
		for (int i=0; i<arr.length; i++) {
			arr[i] = (char) (arr[i]^2000);
		}
		System.out.println("encrypted password:");
		System.out.println(arr);
		for (int i=0; i<arr.length; i++) {
			arr[i] = (char) (arr[i]^2000);
		}
		System.out.println(arr);
	}
}
