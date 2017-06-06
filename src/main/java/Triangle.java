import java.util.Scanner;

/**
 * Created by tzx on 17-6-6.
 */
public class Triangle {

    public static void printAsterisk() {
        System.out.println("*");
    }

    public static void printHorizontalLine(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void printVerticalLine(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("*");
        }
    }

    public static void printTriangle(int n) {
        for (int i = 0; i < n; i++) {
            printHorizontalLine(i+1);
        }
    }

    public static void main(String[] args) {

        System.out.println("\n-- Print one '*'");
        printAsterisk();

        System.out.println("\n-- Print horizontal line, please input a number: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        printHorizontalLine(n);

        System.out.println("\n-- Print vertical line, please input a number: ");
        printVerticalLine(in.nextInt());

        System.out.println("\n-- Print triangle, please input a number: ");
        printTriangle(in.nextInt());

    }

}
