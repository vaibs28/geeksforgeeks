package com.geeksforgeeks.mathematical;

import java.util.Scanner;

public class SieveOfErasthothenes {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();
        printPrime(n);

    }

    private static void printPrime(int n) {
        boolean prime[] = new boolean[n+1];
        for(int i=0;i<n;i++)
            prime[i] = true;
        
        for(int j=2;j*j<=n;j++) {
            if(prime[j]==true) {
                for(int k =j*2;k<=n;k=k+j)
                    prime[k] = false;
            }
        }
        
        for(int i=2;i<=n;i++) {
            if(prime[i]==true)
                System.out.println(i);
        }
        
    }

}
