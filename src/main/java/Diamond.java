import java.util.Scanner;

/**
 * Created by tzx on 17-6-6.
 */
public class Diamond {

    public static void printCharRep(char c, int rep) {
        if (rep <= 0) { return; }
        for (int i = 0; i < rep; i++) {
            System.out.print(c);
        }
    }

    public static void printDiamond(int n) {
        for (int i = 0; i < n; i++) {
            printCharRep(' ', n-(i+1));
            printCharRep('*', i+1+i);
            System.out.println();
        }
        for (int i = n-2; i >= 0; i--) {
            printCharRep(' ', n-(i+1));
            printCharRep('*', i+1+i);
            System.out.println();
        }
    }

    public static void printDiamondWithName(int n, String name) {
        for (int i = 0; i < n-1; i++) {
            printCharRep(' ', n-(i+1));
            printCharRep('*', i+1+i);
            System.out.println();
        }
        printCharRep(' ', n-name.length()/2-1);
        System.out.print(name);
        printCharRep(' ', n-name.length()/2);
        System.out.println();
        for (int i = n-2; i >= 0; i--) {
            printCharRep(' ', n-(i+1));
            printCharRep('*', i+1+i);
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("\n-- Print diamond, please input a number: ");
        printDiamond(in.nextInt());

        System.out.println("\n-- Print diamond with name, please input a number, and your name: ");
        printDiamondWithName(in.nextInt(), in.next());

    }

}
