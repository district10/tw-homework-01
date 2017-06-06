import java.util.*;

/**
 * Created by tzx on 17-6-6.
 */
public class PrimeFactors {
    
    public static void factorize(int n, HashSet<Integer> factors) {
        boolean processed = false;
        for (int i = 2; i < n/2+1; i++) {
            if (n%i == 0) {
                factors.add(i);
                do {
                    n = n/i;
                } while(n%i == 0);
                factorize(n, factors);
                processed = true;
            }
        }
        // add last factor
        if (!processed) {
            factors.add(n);
        }
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("\n-- Please input a number: ");
        int num = in.nextInt();
        HashSet<Integer> factors = new HashSet<Integer>();
        factorize(num, factors);
        System.out.println("Factors of "+num+" are: "+factors);
    }
}
