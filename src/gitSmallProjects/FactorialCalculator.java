package gitSmallProjects;

public class FactorialCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	        int number = 10; // You can change this number to test with different values
	        System.out.println("Factorial of " + number + " using iterative method is: " + factorialIterative(number));
	        System.out.println("Factorial of " + number + " using recursive method is: " + factorialRecursive(number));
	    }

	    // Method to calculate factorial using an iterative approach
	    public static int factorialIterative(int n) {
	        if (n < 0) {
	            throw new IllegalArgumentException("Number must be non-negative.");
	        }
	        int result = 1;
	        for (int i = 1; i <= n; i++) {
	            result *= i;
	        }
	        return result;
	    }

	    // Method to calculate factorial using a recursive approach
	    public static int factorialRecursive(int n) {
	        if (n < 0) {
	            throw new IllegalArgumentException("Number must be non-negative.");
	        }
	        if (n == 0) {
	            return 1;
	        }
	        return n * factorialRecursive(n - 1);
	    }
	}
