package com.fclass;

public class Main {

    public static void main(String[] args) {
	// write your code here

        CustomHashMap<Integer, String> head = new CustomHashMap<>(4);
        head.put(1212123 , "Ali");
        System.out.println(head.getHashIndex());
        head.put(1234, "Raffay");
        System.out.println(head.getHashIndex());
        head.put(123, "Ayesha");
        System.out.println(head.getHashIndex());
        head.put(4321, "Nabia");
        System.out.println(head.getHashIndex());
        head.put(null , "Nabia");
        System.out.println(head.getHashIndex());
        head.put(null , "Raffayaa");
        System.out.println(head.getHashIndex());
        System.out.println("this is the values");
        head.printAll();



    }
}
