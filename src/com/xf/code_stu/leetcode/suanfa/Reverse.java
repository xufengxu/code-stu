package com.xf.code_stu.leetcode.suanfa;

/**
 * @program code-stu
 * @description:
 * @author: xuf
 * @create: 2019/04/12 14:59
 */

/*给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。

示例 1:
输入: 123
输出: 321

示例 2:
输入: -123
输出: -321

示例 3:
输入: 120
输出: 21

注意:
假设我们的环境只能存储得下 32 位的有符号整数，则其数值范围为 [−231,  231 − 1]。请根据这个假设，如果反转后整数溢出那么就返回 0。*/

public class Reverse {

    public static void main(String[] args) {
        System.out.println(reverse(1234667899));
    }

    public static int reverse(int x) {
        int x1 = 0;
        int y = 0;
        if(x >> 31 != 0){
            x1 = Math.abs(x);
            y = temp(x1)*-1;
        }else{
            y = temp(x);
        }

        if(y > Integer.MAX_VALUE || y < Integer.MIN_VALUE){
            return 0;
        }
        return y;

    }

    private static int temp(int x1){
        String str = String.valueOf(x1);

        StringBuilder sb = new StringBuilder(str);
        String afterStr = sb.reverse().toString();

        int y = 0;
        try {
            y = Integer.parseInt(afterStr);
        } catch (NumberFormatException e) {
            return y;
        }
        return y;
    }

}
