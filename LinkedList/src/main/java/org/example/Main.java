package org.example;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> customList = new LinkedList<>();
        customList.add("Hello!");
        System.out.println(customList.get(0));
        customList.remove(0);
        System.out.println(customList.get(0));
    }
}