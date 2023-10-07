package org.example;

import java.util.Arrays;

public class LinkedList<T> {
    private static final int INITIAL_CAPACITY = 10;
    private Object[] elements;
    private int currentSize;

    LinkedList() {
        elements = new Object[INITIAL_CAPACITY];
        currentSize = 0;
    }

    public void add(T element) {
        if (currentSize == elements.length) {
            increaseCapacity();
        }
        elements[currentSize++] = element;
    }

    public T get(int index) {
        if (index < 0 && index >= currentSize) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        return (T) elements[index];
    }

    public void remove(int index) {
        if (index < 0 && index >= currentSize) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        System.arraycopy(elements, index + 1, elements, index, currentSize - index - 1);
        elements[--currentSize] = null;
    }

    private void increaseCapacity() {
        elements = Arrays.copyOf(elements, elements.length * 2);
    }
}
