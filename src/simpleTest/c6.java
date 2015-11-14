package simpleTest;
import java.util.Scanner;


public class c6 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("please input you id:");
		String line = scanner.nextLine();
		System.out.println("length of your id is: " + line.length());
	}
}
