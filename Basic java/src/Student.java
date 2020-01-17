
public class Student {

	int age, rollno;

	public void Display() {
		
		System.out.println("Wallcome to all of You");
	}

    public static void main(String[] args) {
	    Student abc=new Student();
	    abc.Display();

	    abc.age=25;
	    abc.rollno=12;
	    System.out.println(abc.age);
	    System.out.println(abc.rollno);
}



}

