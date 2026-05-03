package subtration;

public class Subtration {
	int a=10;
	int b=5;
	
	
	public static void main(String[]args) {
		Subtration obj=new Subtration();
		obj.subtract(obj.a,obj.b);
	}

	void subtract(int a,int b) {
		int c=a-b;
		System.out.println("subtraction of two digits:"+c);
}
}
