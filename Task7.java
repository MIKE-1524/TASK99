import java.util.*;

public class Task7 {

    public static double add(double num1, double num2){
        return num1 + num2;
    }

    public static double substract(double num1, double num2){
        return num1 - num2;
    }

    public static double multiply(double num1, double num2){
        return num1 * num2;
    }

    public static double divide(double num1, double num2){
        if (num2 == 0){
            System.out.println("Division by 0 is undefined");
            return Double.NaN;
        }
        
        return num1 / num2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a Number: ");
         double num1 = scanner.nextDouble();

        System.out.println("Enter a Number: ");
        double num2 = scanner.nextDouble();


        System.out.println("/n=====Results=====");
        System.out.println("Sum of the Two Number: " + add(num1, num2));
        System.out.println("Difference of the Two Number: " + substract(num1, num2));
        System.out.println("Product of the Two Number: " + multiply(num1, num2));
        System.out.println("Quotient of the Two Number: " + divide(num1, num2));

        

        scanner.close();
    
    
    }


}