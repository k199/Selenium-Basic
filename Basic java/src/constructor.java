
public class constructor {

	public constructor() {
		this(4,4,4);
	    System.out.println("Default constructor");
	}
	public constructor(int a) {
	    this();	
	    System.out.println("One parameter constructor");
	}
	public constructor(int b,int n) {
		this (6,7,8,9);
	    System.out.println("Two parameterized constructor");
	}
	public constructor(int b,int n,int f) {
	    System.out.println("Three parameterized constructor");
	}
	public constructor(int b,int n,int r,int t) {
		this(1);
	    System.out.println("Four parameterized constructor");
	}
	public static void main(String[] args) {
		
     constructor d= new constructor(7,7);
     
	}
}
