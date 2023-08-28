package p1;

public class Calculator {
	
	public static int add(int a, int b) {
		return a + b;
	}
	
	public int subtract(int a, int b) {
		return a - b;
	}
	
	public int multiply(int a, int b) {
		return a * b;
	}
	
	public float division(int a, int b) {
		return a / b;
	}
	
	public MyObj testComplex(MyObj myobj) {
		return myobj;
	}

	public static void main (String args[]) {
		System.out.println(add(1,2));
	}
}
