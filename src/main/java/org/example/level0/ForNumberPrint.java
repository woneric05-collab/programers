package org.example.level0;

public class ForNumberPrint {
    public static void main(String[] args) {
    /*문자열 my_string과 정수 n이 매개변수로 주어질 때,
    my_string에 들어있는 각 문자를 n만큼 반복한 문자열을 return 하도록 solution 함수를 완성해보세요.

     */
     String my_string = "hello";
     int n = 3;
        System.out.println(soulution(my_string));
    }
    static String soulution(String my_string) {
        StringBuilder sb = new StringBuilder();
        int n=3;
        for (int i = 0; i < my_string.length(); i++) {
            char ch = my_string.charAt(i);

            for (int j = 0; j < n; j++) {
                sb.append(ch);
            }
        }
        return sb.toString();
    }

}
