public class SwappingTwoNumbers {
	static Integer  a = 10;
	static Integer b = 50;
	public static void swap() {
		a = a + b;
		b = a - b;
		a = a - b;
	}
	
	public static void main(String args[]) {
		System.out.println("before swapping a = " + a + " and b = " + b);
		swap();
		System.out.println("after swapping a = " + a + " and b = " + b);
	}
}