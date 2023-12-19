package ru.itis.inf304;

public class InvalidNumNonPositiveException extends Exception{
    public InvalidNumNonPositiveException() {
        super("Число не должно быть меньше нуля");
    }
}