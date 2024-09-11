package com.example.task06;

public class Task06 {

    public static int solution(int x, int y) {
        int result = x + y;
        int cnt = 0;

         while (result != 0) {
             cnt++;
             result /= 10;
         }

        if (cnt == 0) return 1;


        return cnt;
    }

    public static void main(String[] args) {
        int result = solution(12, 34);
        System.out.println(result);
    }

}
