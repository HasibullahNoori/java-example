package com.company.polymorphism;

public class Runner {

    public static void main(String[] args) {

        int z;
        z =10;

        z =30;

        Shape s;
        s= new Circle();
        s.Draw();
        s = new Rectangle();
        s.Draw();
    }
}
