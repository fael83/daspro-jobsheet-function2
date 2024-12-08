import java.util.Scanner;

public class ProvitRecursive13 {
    static double calculateProvit(double balance, int period){
        if (period == 0)
            return 1;
        else
            return 1.11*calculateProvit(balance, period-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input balance: ");
        double initialBalance = sc.nextInt();
        System.out.print("Input Investment period: ");
        int investPeriod = sc.nextInt();
        System.out.println("Balance after " + investPeriod + " year = " +
                            calculateProvit(initialBalance, investPeriod));
    }
}
