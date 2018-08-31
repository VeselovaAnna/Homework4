package Homework4;

import java.util.Scanner;

public class Homework4 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //printArray(scan.nextInt());
          //    drawRectangle(scan.nextInt(),scan.nextInt());
          //    drawRectangle(scan.nextInt());
           //  getMax(scan.nextInt(), scan.nextInt());
          //    getMax(scan.nextFloat(), scan.nextFloat());
          //    printArr(scan.nextInt());
         drawRectangleRecur(scan.nextInt(), scan.nextInt());
    }


    public static void printArray(int length) { //каждый метод должен быть в своих кавычках не майне!!!!!
        for (int i = 1; i <= length; i++) {
            System.out.println("" + i);
        }
    }

    public static void drawRectangle(int height, int width) { //аргументы (переменные) с консоли вводятся в метод
        for (int j = 0; j < width; j++) {              //в майне просто вызываешь метод имя и (scan.nextInt());
            for (int k = 0; k < height; k++) {
                System.out.print("+");
            }
            System.out.println();

        }
    }

    public static void drawRectangle(int width) {
        drawRectangle(width, width);
    }

    public static void getMax(int a, int b) {
        if (a > b) {
            System.out.println("Число А больше " + a);
        } else {
            System.out.println("Число В больше " + b);
        }
    }

    public static void getMax(float a, float b) {
        if (a > b) {
            System.out.println("Число А больше " + a);
        } else {
            System.out.println("Число В больше " + b);
        }
    }

    public static void printArr(int n) { //выводит 4 значения так как ввод 5 запоминает как пятое число
        if (n <= 1) return; //пока не будет 1 сюда программа не зайдет, а будет внизу
        System.out.println(n - 1 + ""); //ввожу 5 и оно отнимает по одному и запоминает 4 и опять отнимает
        printArr(n - 1); // вызвала метод в себе

    }

    public static void drawRectangleRecur(int height, int width) {

        if (height > 1) {
            drawRectangleRecur(height - 1, width);
        }
        if (width > 0) {
            drawRectangleRecur(0, width - 1);
            System.out.print("*");
        } else {
            System.out.println();
        }


    }
}

