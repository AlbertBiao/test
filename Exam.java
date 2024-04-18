package com.team.controller;

import java.util.Scanner;

public class Exam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入题目序号：");
        int topic = sc.nextInt();
        switch (topic) {
            case 1:
                //第一题
                System.out.println(one());
                break;
            case 2:
                //第二题
                System.out.println(two());
                break;
            case 3:
                //第三题
                System.out.println(three());
                break;
            case 4:
                //第四题
                System.out.println(four());
                break;
        }
    }

    public static int one() {
        int a = 0;
        int b = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入苹果斤数：");
        a = sc.nextInt();
        System.out.println("请输入草莓斤数：");
        b = sc.nextInt();
        int sun = 8 * a + 13 * b;
        return sun;
    }

    public static int two() {
        int a = 0;
        int b = 0;
        int c = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入苹果斤数：");
        a = sc.nextInt();
        System.out.println("请输入草莓斤数：");
        b = sc.nextInt();
        System.out.println("请输入芒果斤数：");
        c = sc.nextInt();
        int sun = 8 * a + 13 * b + 20 * c;
        return sun;
    }

    public static double three() {
        int a = 0;
        int b = 0;
        int c = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入苹果斤数：");
        a = sc.nextInt();
        System.out.println("请输入草莓斤数：");
        b = sc.nextInt();
        System.out.println("请输入芒果斤数：");
        c = sc.nextInt();
        double sun = 8 * a + 13 * 0.8 * b + 20 * c;
        return sun;
    }

    public static double four() {
        int a = 0;
        int b = 0;
        int c = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入苹果斤数：");
        a = sc.nextInt();
        System.out.println("请输入草莓斤数：");
        b = sc.nextInt();
        System.out.println("请输入芒果斤数：");
        c = sc.nextInt();
        double sun = 8 * a + 13 * 0.8 * b + 20 * c;
        double result = 0;
        if (sun >= 100) {
            result = sun - 10 * Math.floor(sun / 100);
        } else {
            result = sun;
        }
        return result;
    }
}
