public class Calculator {
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
        if (a == 0 || b == 0) {
            return 0;
        }
        return a/b;
    }

    public int modulo(int a, int b) {
        return a % b;
    }

    public double sqrt(int a) {
        return Math.sqrt(a);
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("Addition: " + calculator.add(10, 5));
        System.out.println("Subtraction: " + calculator.subtract(10, 5));
        System.out.println("Multiplication: " + calculator.multiply(10, 5));
        System.out.println("Divisio: " + calculator.divide(10, 5));
        System.out.println("Divisio: " + calculator.divide(0, 5));
        System.out.println("Modulo: " + calculator.modulo(0, 5));
        System.out.println("Squared: " + calculator.sqrt(49));

    }
}
