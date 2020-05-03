package com.codingquestions.climbingstairs;

public class ClimbingStairs {
    public static void main(String[] args) {
        System.out.println(climbStairs(4));
    }

//    private static int climbStairs(int n) {
//        if (n == 0 || n == 1) {
//            return 1;
//        } else return climbStairs(n - 1) + climbStairs(n - 2);
//    }

    private static int climbStairs(int n) {
        //dp-better no duplicates
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }
}
