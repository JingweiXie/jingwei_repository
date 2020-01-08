package com.company;

public class MyTestll {
    public static void main(String[] args) {
        Child c = new Child();
        System.out.println(c);
    }
}

class Parent{
    static int a = 3;
    static{
        System.out.println("parent static block");
    }
}

class Child extends Parent{
    static{
        System.out.println("child static block");
    }

    @Override
    public String toString() {
        return "重写的toString";
    }
}