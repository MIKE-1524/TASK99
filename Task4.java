import java.util.*;

public class Task4 {
    public static void main(String[] args) {
        Scanner X = new Scanner(System.in);
        System.out.print("ENTER A STRING: ");
        String Z = X.nextLine();
        X.close();
        
        StringBuilder reversedBuilder = new StringBuilder(Z);
        reversedBuilder.reverse();
        String Y = reversedBuilder.toString();
        
        if (Z.equals(Y)) {
            System.out.println("THE INPUT STRING IS A PALINDROME.");
        } else {
            System.out.println("THE INPUT STRING IS NOT A PALINDROME.");
        }
    }
}