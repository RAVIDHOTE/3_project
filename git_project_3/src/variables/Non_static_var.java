package variables;

public class Non_static_var {

	int a = 10;
	String name = "Ravi";

	public void m1() {
		System.out.println(a + " " + name);    
		
		//error comes when it is public static method - 
		/*Error - Cannot make a static reference to the non-static field a
	              Cannot make a static reference to the non-static field name*/                                       

	}

	public static void main(String [] args) {
		Non_static_var u1 = new Non_static_var();
		u1.m1();
	}

}
