import java.util.*;
public class FactoralOfANumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        int fact = num;
        for (int i = num-1; i >0; i--) {
            fact = fact*i;
        }
        System.out.println("factorial of " + num + " is " + fact);
    }
}