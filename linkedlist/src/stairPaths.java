public class starPaths {
    // Online Java Compiler
// Use this editor to write, compile and run your Java code online

    public static void main(String[] args) {
        climbStairs(10, "");
        
        // System.out.println(value);
        
    }
        static int ans = 0;
    public static void climbStairs(int n , String path) {
        if(n == 0 ){
        System.out.println("path " + ans++ + "  :  " + path);
        return ;}
        if(n < 0) return ;

        climbStairs(n-1 , path + "1");
        climbStairs(n-2 , path + "2");
        
    }

}
    

