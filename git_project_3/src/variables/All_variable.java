package variables;

public class All_variable {
	
	int a = 10;      //Non-static/Global/instance variable
	String n = "Ravi";    //Non-static/Global/instance variable
	static int b = 50;    //Static variable

	public void run1() {
	int c = 20;       //local variable
	int d = 80;       //local variable
	System.out.println("Testing in progress");
	System.out.println(a+b);
	System.out.println(c+d);
	}

	public static void run2() { 
	System.out.println(b);
	//System.out.println(c+d);
	
	/* Error - when we call local variable into another method
	 * c cannot be resolved to a variable
	d cannot be resolved to a variable*/
	}

	public static void main(String [] args) {
	All_variable y = new All_variable();
	y.run1();
	run2();

	}

}
