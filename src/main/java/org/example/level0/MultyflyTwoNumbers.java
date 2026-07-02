package org.example.level0;
public class MultyflyTwoNumbers {
    public static void main(String[] args) {
        /*
        정수 num1, num2가 매개변수 주어집니다.
        num1과 num2를 곱한 값을 return 하도록 solution 함수를 완성해주세요.
         */
        int num1 = 27;
        int num2 = 19;
        System.out.println(soulution(num1, num2));
    }

    static int soulution(int num1, int num2) {

        int answer = 0;
        answer = num1 * num2;
        return answer;

    }
}