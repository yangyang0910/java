package com.itheima;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] arge) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入：");

        int i = sc.nextInt();

        System.out.println("请输入：");

        int a = sc.nextInt();

        if (a == i) {
            System.out.println("相等");
        } else if (a == 10) {
            System.out.println("a等于10");
        } else {
            System.out.println("不相等");
        }

        switch (a) {
            case 10:
                System.out.println("a等于10");
                break;
            case 11:
                System.out.println("a等于11");
                break;
            default:
                System.out.println("其他");
                break;
        }

        for (int s = 0; s < 10; s++) {
            System.out.println("S:" + s);
        }

        int d = 0;
        for (int s = 1; s <= 5; s++) {
            d += s;
        }
        System.out.println("1-5的和为：" + d);
        int f = 0;
        for (int s = 0; s <= 100; s++) {
            if (s % 2 == 0) {
                f++;
            }
        }
        System.out.println("0-100之间的偶数的个数：" + f);

        for (int s = 100; s < 1000; s++) {
            int g = s / 100;
            int b = s / 10 % 10;
            int h = s % 10;
            int k = g * g * g + b * b * b + h * h * h;
            if (k == s) {
                System.out.println("1000以内水仙花数：" + s);

            }
        }

    }

}