package com.sun;

import java.util.Scanner;

public class TestSimple {
    public static void main(String[] args) {
        //test1();
        test2();
    }

    /**
     * 编写程序，打印1到100之内的整数，但数字中包含7的要跳过，例如：17、27、71、72
     */
    public static void test1(){
        //字符串实现
        for (int i = 1; i < 100; i++) {
            if ((i + "").indexOf("7") < 0) {
                System.out.print(i + "\t");
            }
        }
        //非字符串实现
        for (int i = 1; i < 100; i++) {
            if (i%10!=7 &&(i/10)%10!=7){
                System.out.print(i + "\t");
            }
        }
    }

    /**
     * 求斐波那契数列第n项，n<30，斐波那契数列前10项为 1,1,2,3,5,8,13,21,34,55
     */
    public static void test2(){
        int n;
        int fn;
        Scanner scanner=new Scanner(System.in);
        System.err.println("请输入30以内的整数：");
        n=scanner.nextInt();
        fn=peibo(n);
        System.out.println("斐波那契数列第"+n+"项为："+fn);
    }
    public static int peibo(int n){
        if(n==1 || n==2){
            return 1;
        }
// System.err.println(peibo(n-1)+peibo(n-2)+" n="+n);
        return peibo(n-1)+peibo(n-2);
    }




}
