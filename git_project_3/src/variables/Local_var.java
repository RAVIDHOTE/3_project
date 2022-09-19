package variables;

public class Local_var {
	
	public void r1() {

		int a = 10;   //local variable--inside the method body
		int b = 20;   //only used inside the specific method
		              //Next method is not able access variables not aware about this varibales

		System.out.println(a+b);
		}

		public void r2() {

		int c =20;
		int d = 20;

		System.out.println(c+d);
		}

		public static void main(String [] args) {

		Local_var h1 = new Local_var();
		h1.r1();
		h1.r2();
		}

}
