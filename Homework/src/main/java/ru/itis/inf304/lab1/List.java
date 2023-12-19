package ru.itis.inf304.lab1;

import java.util.Scanner;

public class List {
    public static Element head;
    public static int countElms;

    public static void input() {
        Scanner ch = new Scanner(System.in);
        System.out.println("Введите количество чисел из которых будет состоять ваш лист");
        countElms = ch.nextInt();
        System.out.println("Введите эти числа");
        head = new Element(ch.nextInt());
        Element current = head;

        for (int i = 1; i < countElms; i++) {
            Element next = new Element(ch.nextInt());
            current.next = next;
            current.next.prev = current;
            current = next;
        }
    }


    public static void sort() {
        for (int i = 0; i < countElms; i++) {
            Element current = head;
            for (int j = 0; j < countElms - i - 1; j++) {
                if (List.compare(current, current.next) > 0) {
                    List.swap(current, current.next);
                    current = current.prev;
                }
                current = current.next;
            }
        }
    }


    public static void swap(Element e1, Element e2){
        if (e1.prev == null) {
            e1.next = e2.next;
            e2.next = e1;
            head = e2;
        }
        else {
            e1.next = e2.next;
            e2.next = e1;
            e1.prev.next = e2;
        }

        Element cur = head;
        Element tmp = null;
        while (cur != null) {
            cur.prev = tmp;
            tmp = cur;
            cur = cur.next;
        }
    }
    private static int compare(Element e1, Element e2) {
        return e1.value - e2.value;
    }

    public static void output() {
        Element current = head;
        System.out.println("Отсортированный список:");
        while (current != null) {
            System.out.print(current.value + " ");
            current = current.next;
        }
        System.out.println();
    }

}
