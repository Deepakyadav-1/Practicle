package exception;

public class mulitcatch { // class name 
	static void fun() { //function and method name 
		try { // try block
		int i=50/0; // division
		System.out.println(i);//print i
		int arr[]=new int[3]; // array declare
		arr[4]=7; //number save
		}
		catch(ArithmeticException e) { //exception handle
			System.out.println("this fist exception");
			// first catch is working 
		}
		catch(ArrayIndexOutOfBoundsException ae) {
			System.out.println("this second exception");
		}
	}
	public static void main(String[] args) {
		fun();
	}

}
