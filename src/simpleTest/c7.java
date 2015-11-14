
package simpleTest;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class c7 {

	public static void main(String[] args){
		try {
			PrintStream out = System.out;
			PrintStream ps = new PrintStream("./log.txt");
			System.setOut(ps);
			int age = 18;
			System.out.println("set var age to 18");
			System.setOut(out);
			System.out.println("out set done");
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
