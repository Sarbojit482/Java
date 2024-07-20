import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("To perform :Addition(+), Multiplication(*), Subtraction(-), Division(/)");
        char opp = scan.next().charAt(0);  
        
        System.out.println("Enter First Number");
        int a = scan.nextInt();
        System.out.println("Enter Second Number");
        int b = scan.nextInt();

        switch (opp) {
            case '+':
                System.out.println("Result: " + (a + b));
                break;
            case '*':
                System.out.println("Result: " + (a * b));
                break;
            case '-':
                System.out.println("Result: " + (a - b));
                break;
            case '/':
                if (b != 0) {
                    System.out.println("Result: " + (a / b));
                } else {
                    System.out.println("Error: Division by zero is not allowed");
                }
                break;
            default:
                System.out.println("Error: Invalid operator");
        }
    }
}