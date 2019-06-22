package com.geeksforgeeks.mathematical;

import java.util.Scanner;

public class CheckPrime {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i=2;i<Math.sqrt(n);i++) {
            if(n%i==0) {
                System.out.println("Not prime");
                System.exit(0);
            }
        }
        System.out.println("prime");
    }

}
