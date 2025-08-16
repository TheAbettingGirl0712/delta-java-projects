
import java.util.*;

public class Pattern_printer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        // this int i will indicate the row we're on
        for (int i = 0; i <= num; i++) {
            // I have used System.out.print instead of System.out.println for obvious reasons.
            // this int j will indicate which column we're on.
            for (int j = 0; j <= num; j++) {
                System.out.print(i + j);
            }
            System.out.println();
        }
    }
}
