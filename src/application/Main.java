package application;

import entities.ADTIntegerList;

public class Main {
    public static void main(String[] args) {
        // Debugging...
        ADTIntegerList list = new ADTIntegerList(10);

        list.insertAtStart(1);
        list.insertAtStart(12);
        list.insertAtStart(11);
        list.insertAtStart(29);
        list.insertAtStart(8);

        list.insertAtEnd(98);
        list.insertAtEnd(38);
        list.insertAtEnd(41);

        System.out.println(list);
    }
}