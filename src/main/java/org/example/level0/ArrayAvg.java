package org.example.level0;

public class ArrayAvg {
    public static void main(String[] args) {
        // 1. 자바에서 배열을 선언할 때는 대괄호[]의 위치와 new 키워드(또는 중괄호{})를 올바르게 써야 합니다.
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        /* 정수 배열 numbers가 매개변수로 주어집니다.
         numbers의 원소의 평균값을 return하도록 solution 함수를 완성해주세요.
         */
        // 2. 메서드 이름의 오타를 수정했습니다. (soulution -> solution)
        System.out.println(solution(numbers));
    }

    static double solution(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            return 0;
        }

        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }

        return (double) sum / numbers.length;
    }
}
