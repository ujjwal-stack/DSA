package basic;

import java.util.Scanner;

public class fibonacci {
    static int n1=0, n2=1, n3=0;
    private static void fibonacciNumber(int n){
        if(n>0){
            n3=n2+ n1;
            n1=n2;
            n2=n3;
            System.out.print(" "+n3);
            fibonacciNumber(n-1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. :");
        int n= sc.nextInt();
        System.out.print(n1+" "+n2);
        fibonacciNumber(n);
        sc.close();
    }
}
