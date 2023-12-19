package ru.itis.inf304;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] array = new int[] {3,56,345,7654,78099,234567};
        int necessaryNum = array[0];

        try {
            System.out.println("Введите число:");
            int num = in.nextInt();

            if (num < 1) throw new InvalidNumNonPositiveException();

            if (array[0] < num) {
                boolean flag = true;
                int i = 1;

                while (flag & i < array.length) {

                    if (array[i] < num) {
                        necessaryNum = array[i];
                        i++;
                    }
                    else flag = false;
                }
            }
            else throw new NumberLessMinException();

            System.out.println(necessaryNum);
        }
        catch (InputMismatchException e) {
            System.out.println("Было введено не целочисленное значение");
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
