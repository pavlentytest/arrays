package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        int[] a; // null
        int b[];
        //a[0] = 1;
        a = new int[5];
        b = new int[15];

        for(int i=0;i<a.length;i++) {
            System.out.print(a[i] + " ");
        }
        //FOREACH
        for(int p: a) System.out.print(p + " ");

        int[] x = {5,6,7,-100};

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] p = new int[n];
        for(int j=0;j<n; j++) {
            p[j] = scan.nextInt();
        }




    }
}
