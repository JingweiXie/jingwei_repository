package com.company;

public class PersonImp {
    public static void main(String[] args) {
        Person person2 = new Person() {
            @Override
            public void sayMessage(String message) {
                System.out.print("message: " + message);
            }
        };
        Person person1 = message -> System.out.println("message: " + message);
        person1.sayMessage("hello");
        person2.sayMessage("hello");
    }
}
