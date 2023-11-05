public class Calculator {
	// Method to add two numbers
	public static double add(double a, double b) {
		return a + b;
	}

	// Method to subtract two numbers
	public static double subtract(double a, double b) {
		return a - b;
	}

	// Method to multiply two numbers
	public static double multiply(double a, double b) {
		return a * b;
	}

	// Method to divide two numbers
	public static double divide(double a, double b) {
		if (b == 0) {
			System.out.println("Cannot divide by zero!");
			return Double.NaN; // NaN represents "Not-a-Number"
		}
		return a / b;
	}
}
