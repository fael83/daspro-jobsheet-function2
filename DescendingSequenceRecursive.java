import java.util.Scanner;

public class DescendingSequenceRecursive {
    static void displayRecursive(int n){
        if (n==0){
            System.out.print(n);
            return;
        }else {
            System.out.print(n + " ");
            displayRecursive(n-1);
        }
    }
    static void displayIterative(int n){
        for (int i=n;i>=0;i--){
            System.out.print(i + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input number n: ");
        int n = sc.nextInt();
        System.out.println("Display use recursive" );
        displayRecursive(n);
        System.out.println("\nDisplay use iterative");
        displayIterative(n);
    }
}
