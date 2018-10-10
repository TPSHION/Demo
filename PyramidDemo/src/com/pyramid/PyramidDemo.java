package com.pyramid;

import java.util.Scanner;

public class PyramidDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入要打印倒金字塔的层数：");
        int num = scanner.nextInt();
        printPyramid(num);
        scanner.close();
    }
    
    public static void printPyramid(int num) {
        for(int i = 1; i < num+1; i++) {
            for(int j = 0; j < num-i+1;j++){
                System.out.print(" ");
            }
            for(int k = 0; k < 2*i-1; k++) {
                System.out.print("▲");
            }
            System.out.print("\n");  
        }
        
    }
}
