//(10=2)(10-2)
public class Math_formula {

	
	public int sum(int a, int b) {
	
	int c;
	c=a+b;
	return c;
	}

	public int sub(int a, int c) {
		
		int x;
		x=a-c;
		return x;
	}
	
	public void multi(int q, int w) {
		
		int x1;
		x1=q*w;
		System.out.println("Total= "+x1);
	}
	
	public static void main(String[] args) {
		
		Math_formula obj=new Math_formula();
		int sum_result=obj.sum(22, 2);
		int sub_result=obj.sub(12, 2);
		obj.multi(sum_result, sub_result);
	}
}
 
