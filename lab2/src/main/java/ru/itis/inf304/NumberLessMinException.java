package ru.itis.inf304;

public class NumberLessMinException extends Exception{
    public NumberLessMinException(){
        super("Вы ввели число меньше минимального в массиве");
    }
}
