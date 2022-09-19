package variables;

public class Static_var {

	static int a = 10;
	static String b = "Ravi";

	public static void a1() {
		System.out.println(a + " " + b);
	}

	public static void main(String [] args) {
		System.out.println("Static variable testing");
		//Static_var q = new Static_var();
		a1();
	}

}
