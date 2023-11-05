public class Main {
    public static void main(String[] args) {
        double resultAdd = Calculator.add(5, 3);
        double resultSubtract = Calculator.subtract(10, 4);
        double resultMultiply = Calculator.multiply(6, 7);
        double resultDivide = Calculator.divide(20, 5);

        System.out.println("Addition: " + resultAdd);
        System.out.println("Subtraction: " + resultSubtract);
        System.out.println("Multiplication: " + resultMultiply);
        System.out.println("Division: " + resultDivide);
    }
}
