//(((((10+2)-2)+2)*2)/2)
public class Math_formula1 {

	
	public int sum(int a, int b) {
		
		int c;
		c=a+b;
		return c;		
	}
	
	public int sub(int s, int d) {
		
		int r;
		r=s-d;
		return r;
	}
	
	public int mul(int r, int t) {
		
		int e;
		e=r*t;
		return e;
	}
	
	public void div(int w, int t) {
	
	int c=w/t;
	System.out.println("Final result of (((((10+2)-2)+2)*2)/2) ="+c);
}
	public static void main(String[] args) {
		Math_formula1 obj=new Math_formula1();
		int result1=obj.sum(10, 2);
		int result2=obj.sub(result1, 2);
		int result3=obj.sum(result2, 2);
		int result4=obj.mul(result3, 2);
		obj.div(result4, 2);
		
	}
	
	
}