import java.util.*;
public class primeNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        int check = 1;
        for (int i=2; i<num;i++) {
            if (num%i == 0) {
                check++;
            }
        }
        if (check > 1) {
            System.out.println("Not a prime number");
        } else {
            System.out.println("The Number is a Prime Number");
        }
    }
}
