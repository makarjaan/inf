package ru.itis.inf304;

public class Main{
    public static void main(String[] args) {
        NextNumImpl numFactory = new NextNumImpl();

        Client client1 = new Client("Игорь", Gender.Male, Discount.Student);
        Client client2 = new Client("Федор", Gender.Male);
        Client client3 = new Client("Лилиана", Gender.Female);

        Cook cook1 = new Cook("Федор");
        Cook cook2 = new Cook("Арсений");

        Order order1 = new Order(client1,cook1, Pizza.Маргарита,
                OrderStatus.Заказан, numFactory.next(), "16.12.2023");

        Order order2 = new Order(client2,cook1, Pizza.Пипперони,
                OrderStatus.Готов, numFactory.next(), "16.12.2023");

        Order order3 = new Order(client3,cook2, Pizza.ЧетыреСыра,
                OrderStatus.Выдан, numFactory.next(), "16.12.2023");

        System.out.println(order1.toString());
        System.out.println(order2.toString());
        System.out.println(order3.toString());


    }

}
