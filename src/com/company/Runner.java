package com.company;

public class Runner {

    public static void main(String[] args) {
        Animal a = new Animal();
        System.out.println(a.color);

        System.out.println("---");
        Dog d= new Dog();
        System.out.println(d.color);
        d.treatment();


        System.out.println("---");
        Cat c= new Cat();
//        System.out.println(c.color);
//        c.treatment();
    }
}
