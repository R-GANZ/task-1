import java.util.Scanner;

class Calculator {
    double a, b;
    String operation;


    void calculate() {
        if (operation.equalsIgnoreCase("add")) {
            System.out.println("Result: " + (a + b));
        } else if (operation.equalsIgnoreCase("sub")) {
            System.out.println("Result: " + (a - b));
        } else if (operation.equalsIgnoreCase("mul")) {
            System.out.println("Result: " + (a * b));
        } else if (operation.equalsIgnoreCase("div")) {
            if (b != 0) {
                System.out.println("Result: " + (a / b));
            } else {
                System.out.println("Error: Division by zero!");
            }
        } else {
            System.out.println("Invalid operation!");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Calculator calc = new Calculator();

        System.out.print("Enter first number: ");
        calc.a = sc.nextDouble();

        System.out.print("Enter second number: ");
        calc.b = sc.nextDouble();

        System.out.print("Enter operation (add/sub/mul/div): ");
        calc.operation = sc.next();

        calc.calculate();
        sc.close();
    }
}
