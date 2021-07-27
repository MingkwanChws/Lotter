package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int[][] lotter = new int[11][25];
        int[] freq = new int[100];
        ranData(lotter);
        findFreq(freq, lotter);
        findMode(freq);
        prt(lotter,freq);
        int mode = findMode(freq);
        System.out.println("mode : " + findMode(freq));
        boolean d = ddouble(mode);
        if(d) System.out.println(findMode(freq)+" is double number");
        else System.out.println(findMode(freq)+" is not double number");

    }

    public static void ranData(int[][] lotter) {
        Random ran = new Random();
        for (int i = 1; i < lotter.length; i++) {
            for (int j = 1; j < lotter[0].length; j++) {
                lotter[i][j] = ran.nextInt(100);
            }
        }
    }

    public static void prt(int[][] lotter, int[] freq) {
        for (int i = 1; i < lotter.length; i++) {
            for (int j = 1; j < lotter[0].length; j++) {
                System.out.printf("%6d", lotter[i][j]);
            }
            System.out.println();
        }
//        System.out.println();
//        System.out.println();
//        for (int i = 0; i < freq.length; i++) {
//            System.out.print(freq[i]+"\t");
//        }
    }

    public static void findFreq(int[] freq, int[][] lotter) {
        for (int i = 1; i < lotter.length; i++) {
            for (int j = 1; j < lotter[0].length; j++) {
                freq[lotter[i][j]]++;
            }
        }
    }

    public static int findMode(int[] freq) {
        int max = 0;
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > freq[max]) max = i;
        }
        return max;
    }

    public static boolean ddouble(int m){
        if(m%11==0) return true;
        else return false;

    }
}