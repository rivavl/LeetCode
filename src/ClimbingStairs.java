//70. Climbing Stairs
//You are climbing a staircase. It takes n steps to reach the top.
//Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?



public class ClimbingStairs {
    public static int climbStairs(int n) {
        if (n == 1) return 1;
        if (n == 2) return 2;
        int prev = 1;
        int next = 2;

        for (int i = 3; i <= n; ++i) {
            int tmp = next;
            next += prev;
            prev = tmp;
        }
        return next;
    }
}
