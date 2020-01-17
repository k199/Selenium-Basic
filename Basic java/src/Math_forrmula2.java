//(((((10-2)+2)*2)-2)/2)
public class Math_forrmula2 {

	
public int sub(int a, int b) {
		
		int c;
		c=a+b;
		return c;		
	}
	
	public int sum(int s, int d) {
		
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
		int result1=obj.sub(10, 2);
		int result2=obj.sum(result1, 2);
		int result3=obj.mul(result2, 2);
		int result4=obj.sub(result3, 2);
		obj.div(result4, 2);
		
	}
	
}
