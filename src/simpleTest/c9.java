package simpleTest;

import java.math.BigDecimal;
import java.util.Scanner;

public class c9 {
	
	public static void power2() {
		Scanner scan = new Scanner(System.in);
		System.out.println("input a integer");
		long number = scan.nextLong();
		System.out.println("you have input: "+ number);
		System.out.println("multiply 2 = " + (number << 1));
		
	}
	
	public static void findLeapYear() {
		Scanner scan = new Scanner(System.in);
		System.out.println("input a year");
		long year;
		try{
			year = scan.nextLong();
			if (year % 4 == 0 && year % 100 !=0 || year % 400 ==0) {
				System.out.println("it is a leap year");
			} else {
				System.out.println("it is not leap year");
			}
		} catch (Exception e) {
			System.out.println("not a valid year");
		}
	}
	
	public static void checkLogin() {
		Scanner scan = new Scanner(System.in);
		System.out.println("input login name:");
		String username = scan.nextLine();
		System.out.println("please input password:");
		String password = scan.nextLine();
		if (! username.equals("zs")) {
			System.out.println("unknown username");
		} else if (! password.equals("123")) {
			System.out.println("wrong password");
		} else {
			System.out.println("congratulations");
		}
	}
	
	public static void dispatchEmployee() {
		Scanner scan = new Scanner(System.in);
		System.out.println("input your language");
		String language = scan.nextLine();
		System.out.println(language.hashCode());
		switch(language.hashCode()) {
			case 123:
				System.out.println("language is 123");
				break;
			case 234:
				System.out.println("234");
				break;
			case 3254818:
				System.out.println("you know java? cool~");
				break;
			default:
				System.out.println("unknown type");
		}
	}
	
	public static void judgeSeason() {
		Scanner scan = new Scanner(System.in);
		System.out.println("input month number and i will tell you seasons");
		System.out.println(-5%2);
		int month = scan.nextInt();
		switch(month) {
		case 12:
		case 2:
		case 1:
			System.out.println("winter");
			break;
		default:
			System.out.println("only support winter currently");
		}
	}
	
	public static void simpleWhile() {
		String[] aves = new String[] {"birds", "pegon"};
		int index = 0;
		while(index < aves.length) {
			System.out.println(aves[index++]);
		}
	}
	
	public static void yanghuiTriangle() {
		int triangle[][]  = new int[10][];
		for (int i =0; i< triangle.length;i++) {
			triangle[i] = new int[i+1];
			for (int j = 0;j < i+1; j++) {
				if (i ==0 || j==0 || j == i) {
					triangle[i][j] = 1;
				} else {
					triangle[i][j] = triangle[i-1][j-1] + triangle[i-1][j];
				}
				System.out.print(triangle[i][j] + "\t");
			}
			System.out.println();
		}
		//System.out.println(triangle);
	}
	
	public static void multiplicationTable() {
	
		//int table[][] = new int[9][];
		for (int i = 0; i< 9; i++) {
			//table[i] = new int[i+1];
			for (int j = 0; j< i+1; j ++) {
				System.out.print((i+1) + "*" + (j+1) + "=" + (i+1)*(j+1) + "\t");
			}
			System.out.println();
		}
	}
	
	public static void bigDecimal() {
		BigDecimal sum = new BigDecimal(0.0);
		BigDecimal factorial = new BigDecimal(1.0);
		
		int i = 1;
		while (i<=10) {
			sum = sum.add(factorial);
			factorial = factorial.multiply(new BigDecimal(1.0/i));
			i++;
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		//power2();
		//findLeapYear();
		//checkLogin();
		//dispatchEmployee();
		//judgeSeason();
		//simpleWhile();
		//yanghuiTriangle();
		//multiplicationTable();
		bigDecimal();
		
		
	}
}
