public class stairPathsDP {
    // Online Java Compiler
    // Use this editor to write, compile and run your Java code online

    public static void main(String[] args) {
        int n = 10;
        int[] dp = new int[n + 1];
        System.out.println("Total paths: " + climbStairs(n, dp));
    }

    public static int climbStairs(int n, int[] dp) {
        if (n < 0) return 0;
        if (n == 0) return 1;
        if (dp[n] != 0) return dp[n];

        dp[n] = climbStairs(n - 1, dp) + climbStairs(n - 2, dp);
        return dp[n];
    }   
    
    
}
