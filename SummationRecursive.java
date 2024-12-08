public class SummationRecursive {
    
    static int a = 0;
    static int sum(int n){
        if (n==1){
            System.out.print(a + 1);
            return n;
        } else 
            a+=1;
            System.out.print(a + "+");
            return n+sum(n-1);
    }
    public static void main(String[] args) {
        int result = sum(8);
        System.out.print(" = " + result);
    }
}