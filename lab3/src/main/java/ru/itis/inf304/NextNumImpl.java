package ru.itis.inf304;

public class NextNumImpl implements NextNum{

    private Node current;

    public NextNumImpl(){
        Node root = new Node(1);
        current = root;
        for (int i = 2; i<= 10; i++){
            current.next = new Node(i);
            current = current.next;
        }
        current.next = root;
    }

    public int next(){
        current = current.next;
        int result = current.value;
        return result;
    }

}
