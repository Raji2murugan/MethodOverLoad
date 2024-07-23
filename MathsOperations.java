package methodOverload;

import java.util.Scanner;

/**
 * 1. Create a Java class MathOperations with methods for basic mathematical
 * operations such as add() , subtract() , multiply() , and divide() . Implement
 * method overloading to allow these operations for integers, doubles, and
 * optionally, other types.
 */
public class MathsOperations {

	// Addition
	public int add(int a, int b) {
		return a + b;
	}

	public double add(double a, double b) {
		return a + b;
	}

	// Subtraction
	public int subtract(int a, int b) {
		return a - b;
	}

	public double subtract(double a, double b) {
		return a - b;
	}

	// Multiplication
	public int multiply(int a, int b) {
		return a * b;
	}

	public double multiply(double a, double b) {
		return a * b;
	}

	// Division
	public int divide(int a, int b) throws ArithmeticException {
		if (b == 0) {
			throw new ArithmeticException("Cannot divide by zero");
		}
		return a / b;
	}

	public double divide(double a, double b) throws ArithmeticException {
		if (b == 0.0) {
			throw new ArithmeticException("Cannot divide by zero");
		}
		return a / b;
	}

	public static void main(String[] args) {
		MathsOperations m = new MathsOperations();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two values");
		int a = sc.nextInt();
		int b = sc.nextInt();

		// Integer operations
		System.out.println("Integer Operations:");
		System.out.println(a+" + "+b+" = " + m.add(a, b));
		System.out.println(a+" - "+b+" = " + m.subtract(a, b));
		System.out.println(a +" * "+ b+" = " + m.multiply(a, b));
		try {
			System.out.println(a +" / "+ b+" = " + m.divide(a, b));
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}

		// Double operations
		double a1=a;
		double b1=b;
		System.out.println("\nDouble Operations:");
		System.out.println(a +" + "+ b+" = " + m.add(a1, b1));
		System.out.println(a +" - "+ b+" = " + m.subtract(a1, b1));
		System.out.println(a +" * "+ b+" = " + m.multiply(a1, b1));
		try {
			System.out.println(a +" / "+ b+" = " + m.divide(a1, b1));
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}
	}
}
