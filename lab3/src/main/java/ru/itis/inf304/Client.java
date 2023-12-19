package ru.itis.inf304;

public class Client extends Person{
    private Discount discount;

    public Client(String name, Gender gender){
        if (gender == Gender.Female){
            discount = Discount.Female;
        }
        this.name = name;
    }

    public Client(String name, Gender gender, Discount discount){
        this.name = name;
        this.gender = gender;
        this.discount = discount;
    }
}
