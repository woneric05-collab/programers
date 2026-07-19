package org.example.level0;

public class ReverseArray {
    public static void main(String[] args) {
        /*문자열 my_string이 매개변수로 주어집니다.
        my_string을 거꾸로 뒤집은 문자열을 return하도록 solution 함수를 완성해주세요.
         */
        String my_string=  "jaron";
        System.out.println(soulution(my_string));

    }
    static String soulution(String my_string) {
        return new StringBuilder(my_string).reverse().toString();
    }
}
