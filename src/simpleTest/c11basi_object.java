package simpleTest;

class Book{
	private String title;
	private String author;
	private double price;
	public Book(String title, String author, double price) {
		this.setTitle(title);
		this.author = author;
		this.price = price;
		
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
}
class Initialization{
	private byte b;
	private short s;
	private int i;
	private long l;
	private float f;
	private double d;
	private boolean bl;
	private char c;
	private String string;
	public byte getB() {
		return b;
	}
	public void setB(byte b) {
		this.b = b;
	}
	public short getS() {
		return s;
	}
	public void setS(short s) {
		this.s = s;
	}
	public int getI() {
		return i;
	}
	public void setI(int i) {
		this.i = i;
	}
	public long getL() {
		return l;
	}
	public void setL(long l) {
		this.l = l;
	}
	public float getF() {
		return f;
	}
	public void setF(float f) {
		this.f = f;
	}
	public double getD() {
		return d;
	}
	public void setD(double d) {
		this.d = d;
	}
	public boolean isBl() {
		return bl;
	}
	public void setBl(boolean bl) {
		this.bl = bl;
	}
	public char getC() {
		return c;
	}
	public void setC(char c) {
		this.c = c;
	}
	public String getString() {
		return string;
	}
	public void setString(String string) {
		this.string = string;
	}
	
}

class Emperor {
	private static Emperor emperor = null;
	private String name;
	private Emperor(String name){
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	public static Emperor getInstance() {
		if(emperor == null) {
			emperor = new Emperor("god");
			
		}
		return emperor;
	}
}



public class c11basi_object {
	
	/*
	 * there are level plates on tower1 and using tower2 as tmp space, 
	 * put level plates onto tower3
	 */
	public static void moveDisk(int level , char tower1, char tower2, char tower3) {
		if (level == 1) {
			System.out.println("move top 1 from "+tower1+"to: "+tower3);
		} else {
			moveDisk(level-1, tower1, tower3, tower2);
			System.out.println("move biggest on "+tower1+"to "+tower3);
			moveDisk(level-1,tower2, tower1, tower3);
			
		}
	}
	
	public static void hanoiTower() {
		int nDisk = 3;
		moveDisk(nDisk, 'A', 'B', 'C');
		
	}
	
	public void info(String name, int age) {
		
	}
	
	public void info(int aget, String name) {
		
	}
	
	public static void main(String[] args) {
		/*Initialization init = new Initialization();
		System.out.println("hello");
		System.out.println("yy"+init.getC()+"xx");
		System.out.println(init.getD());
		System.out.println(init.getF());
		System.out.println(init.getI());
		System.out.println(init.getL());
		System.out.println(init.getString());
		System.out.println(init.getB());
		System.out.println(init.getS());*/
		/*Emperor emp = Emperor.getInstance();
		System.out.println(emp.getName());*/
		hanoiTower();
	}
}
