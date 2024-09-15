package entities;

import Exceptions.ArrayFullException;
import Exceptions.ZeroArraySizeException;

public class ADTIntegerList {
    private final int[] LIST;
    private final int LENGTH;
    private int elements;

    public ADTIntegerList(int LENGTH) throws NegativeArraySizeException, ZeroArraySizeException {
        elements = 0;

        if (LENGTH < 0) throw new NegativeArraySizeException("Invalid array size.");
        if (LENGTH == 0) throw new ZeroArraySizeException("Invalid array size.");

        this.LENGTH = LENGTH;
        LIST = new int[LENGTH];
    }

    public boolean isEmpty() {
        return elements == 0;
    }

    public boolean isFull() {
        return elements == LENGTH;
    }

    public void insertAtStart(int element) throws ArrayFullException {
        if (isFull()) throw new ArrayFullException("Cannot add element at the start. The array is full.");

        for (int i = LENGTH - 1; i > 0; i--) {
            LIST[i] = LIST[i - 1];
        }

        LIST[0] = element;
        elements++;
    }

    public void insertAtEnd(int element) {
        if (isFull()) throw new ArrayFullException("Cannot add element at the end. The array is full.");

        LIST[elements] = element;
        elements++;
    }

    public int getLENGTH() {
        return LENGTH;
    }

    public int getElements() {
        return elements;
    }

    @Override
    public String toString() {
        StringBuilder stringList = new StringBuilder("[");
        int lastIndex = LENGTH - 1;

        for (int currentIndex = 0; currentIndex < LENGTH; currentIndex++) {
            if (currentIndex == lastIndex) {
                stringList.append(LIST[currentIndex]).append("];");
                break;
            }

            stringList.append(LIST[currentIndex]).append(", ");
        }

        return "LIST: " + stringList + "\n" +
                "LENGTH: " + LENGTH + ";\n" +
                "elements: " + elements + ".\n";
    }
}
