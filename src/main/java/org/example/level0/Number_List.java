package org.example.level0;

import org.w3c.dom.ls.LSOutput;

public class Number_List {
    public static void main(String[] args) {
        /*정수가 담긴 리스트 num_l
        list가 주어질 때,
        num_list의 원소 중 짝수와 홀수의 개수를 담은 배열을 return 하도록 solution 함수를 완성해보세요.
         */
        int[] num_list = {1,2,3,4,5};
        System.out.println(solution(num_list));

    }
    static int[] solution(int[] num_list) {
        int[] answer = new int[2];

        for (int num : num_list) {
            if(num % 2 == 0) {
                answer[0]++;
            }else {
                answer[1]++;
            }
        }
        return answer;
    }


}
