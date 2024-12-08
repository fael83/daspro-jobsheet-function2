import java.util.Scanner;

public class PrimeCheckingRecursive {

    static boolean checkNumber(int n, int x) {
        if (n <= 1) 
            return false; 
        if (x == 1) 
            return true; 
        if (n % x == 0) 
            return false; 
        return checkNumber(n, x - 1); 
    }

    static boolean divider(int n) {
        return checkNumber(n, n / 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (divider(n)) {
            System.out.println(n + " is a prime number.");
        } else {
            System.out.println(n + " not a prime number.");
        }
    }
}
