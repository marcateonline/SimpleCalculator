package basicCalculations;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		main main = new main();
	        System.out.println("Addition: " + main.add(5, 3));
	        System.out.println("Subtraction: " + main.subtract(5, 3));
	        System.out.println("Multiplication: " + main.multiply(5, 3));
	        System.out.println("Division: " + main.divide(6, 3));
	}

	public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Error.");
        }
        return a / b;
    }
}
