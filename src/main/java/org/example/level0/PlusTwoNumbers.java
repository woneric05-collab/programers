package org.example.level0;

public class PlusTwoNumbers {
    public static void main(String[] args) {
        /*정수 num1과 num2가 주어질 때,
         num1과 num2의 합을 return하도록 soltuion 함수를 완성해주세요.
         */

        int num1 = 100;
        int num2 = 2;

        System.out.println(soulution(num1, num2));
    }

    static int soulution(int num1, int num2) {
        int answer = 0;

        answer = num1 + num2;

        return answer;


    }
}
