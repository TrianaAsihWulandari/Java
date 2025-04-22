package day01;

import java.util.Scanner;

public class ch1Triana {
    public static void main(String[] args){
        //number1(5);
        //number2(5);
        //number3(5);
        //number4(5);
        //number5(5);
        //number6(5);
        //number7();
        //number9(9);
        //number9(5);
        //number10(9);
        //number10(5);

    }
    public static void number1(int n) {
        int counter = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf(counter+" ");
                counter++;
            }
            System.out.println();
        }
    }
    public static void number2(int n) {
        for (int i = 1; i <= n; i++) {
            int counter =i;
            for (int j = 1; j <= i; j++) {
                System.out.print(counter+" ");
                counter++;
            }
            System.out.println();
        }
    }
    public static void number3(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print(j+ " ");
            }
            System.out.println();
        }
    }
    public static void number4(int n) {  //kurang spasi untuk result
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i <= j){
                    System.out.print(j);
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void number5(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == j) {
                    System.out.printf(j+" ");
                }else if (i<j) {
                    System.out.printf(10 + " ");
                }
                else {
                    System.out.printf(20 + " ");
                }
            }
            System.out.println();
        }
    }
    public static void number6(int n)  {
        for (int i = n; i >= 1; i--) {
            for (int j = n; j >= 1; j--) {
                if (i == j) {
                    System.out.printf(j + " ");
                } else if (i<j) {
                    System.out.printf(10 + " ");
                }
                else {
                    System.out.printf(20 + " ");
                }
            }
            System.out.println();
        }
    }
    public static void number7() {
        Scanner scan = new Scanner(System.in);
        System.out.print("input jumlah baris piramid : ");
        int n = scan.nextInt();
        for (int i=n; i>=1; i--){
            for (int j = i; j >=1; j--) {
                System.out.printf("%4d ", j);

            }
            for (int j = 2; j <=i ; j++) {
                System.out.printf("%4d ", j);
            }
            System.out.println();
        }
    }
    public static void number9(int n) {
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                for (int j = n; j >= 1; j--) {
                    System.out.printf("%2d ", j);
                }
            }
            else {
                for (int j = 1; j <=n ; j++) {
                    System.out.printf("%2d ",j);
                }
            }
            System.out.println();
        }
    }
    public static void number10(int n) {
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                for (int j = 1; j <= n; j++) {
                    if (j%2 == 0){
                        System.out.printf("%2d ", j);
                    }
                    else {
                        System.out.print("-");
                    }
                }
            }
            else {
                for (int j = 1; j <=n ; j++) {
                    if(j%2!=0){
                        System.out.printf("%2d ",j);
                    }
                    else {
                        System.out.print("-");
                    }

                }
            }
            System.out.println();
        }
    }

}
