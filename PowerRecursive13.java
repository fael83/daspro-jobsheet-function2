import java.util.Scanner;

public class PowerRecursive13 {
    static int calculatePower(int base, int pow){
        if (pow==0) {
            System.out.print("1");
            return 1;
        }else{
            System.out.print(base + "x");
            return base*calculatePower(base, pow-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input base number: ");
        int base = sc.nextInt();
        System.err.print("Input power number: ");
        int power = sc.nextInt();
        // System.out.println("Result of " + base + " power " + power + " = " +
                                // calculatePower(base, power));
        int Result = calculatePower(base, power);
        System.out.print(" = " + Result);
    }
}
