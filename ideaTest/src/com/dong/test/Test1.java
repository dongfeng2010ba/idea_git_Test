package com.dong.test;

import java.util.Stack;

public class Test1 {
    public static void main(String[] args) {
        int pow = pow(2, 3);

        System.out.println("hello,github");


        System.out.println("开发者2加入代码新功能");





    }

    private static int pow(int base, int exponent) {
        int ans = 1;
        while (exponent !=0) {
            if (exponent % 2 == 1) {
                ans = ans * base;
            }
                base = base * base;
                exponent = exponent / 2;

        }
        return ans;
    }

    public static void testFast(int a,int b) {

        int i = 1;
        int mi = b;
        int r = 1, base = a;
        while (b != 0) {
            if (b % 2 != 0) {
                r *= base;

            }
            base *= base;

            b /= 2;

        }
        System.out.println(a + "的" + mi + "次方 = " + r);
    }

}