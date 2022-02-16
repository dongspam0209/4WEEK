package com.company;

import java.util.Scanner;

public class S34501 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N= scanner.nextInt();  //남은 일하는 일

        int[] t = new int[N+5];//time
        int[] p = new int[N+5];//pay

        for (int i=0;i<N;i++){
            t[i]=scanner.nextInt();
            p[i]=scanner.nextInt();
        }

        int[] b= new int[N+5]; //max benefit
        int max=0;
        for (int i=0;i<=N;i++){
            b[i]=Math.max(b[i],max);

            b[i + t[i]] = Math.max(b[i + t[i]], b[i] + p[i]);

            max=Math.max(max,b[i]);

        }
        System.out.println(max);
    }

}
//출처 https://hu-coding.tistory.com/33
