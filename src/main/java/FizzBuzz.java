import java.util.Scanner;

/**
 * Created by tzx on 17-6-6.
 */
public class FizzBuzz {
    public static void main(String[] args) {
        int n = 100;
        for (int i = 0; i < n; i++) {
            int num = i+1;
            if (num%3 != 0 && num%5 != 0) {
                System.out.println(num);
            } else {
                if (num%3 == 0) { System.out.print("Fizz"); }
                if (num%5 == 0) { System.out.print("Buzz"); }
                System.out.println();
            }

        }
    }
}
