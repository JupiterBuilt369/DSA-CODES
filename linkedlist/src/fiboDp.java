
import java.util.Scanner;

public class fiboDp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] dp = new int[n + 1];

        int ans = dp(15, dp);
        System.out.println(ans);
        scanner.close();

    }

    public static int dp(int n, int[] qb) {
        if (n == 0 || n == 1) {
            System.out.println(n + ": " + qb[n]);

            return n;
        }
        if (qb[n] != 0) {
            return qb[n];
        }

        qb[n] = dp(n - 1, qb) + dp(n - 2, qb);
            System.out.println(n + ": " + qb[n]);

        return qb[n];

    }
}
