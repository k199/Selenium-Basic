
public class constructor_methord {
	
	public void method() {
		this.method3(32, 45, 67);
	    System.out.println("Default constructor");
	}
	public void method1(int a) {
	    	this.method();
	    System.out.println("One parameter constructor");
	}
	public void method2(int b,int n) 
	{
		this.method4(98, 90, 67, 67);
	    System.out.println("Two parameterized constructor");
	}
	public void method3(int b,int n,int f) {
	    System.out.println("Three parameterized constructor");
	}
	public void method4(int b,int n,int r,int t) {
         this.method1(6);		
	    System.out.println("Four parameterized constructor");
	}
	public static void main(String[] args) {
		
     constructor_methord d1=new constructor_methord();
     d1.method2(22, 22);
     
	}
}


