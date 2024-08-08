package com.itheima;

public class Demo1 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class c = Class.forName("com.itheima.Dog");
        System.out.println(c);

        String s = new String();

        Class c2 = dogClass;
        System.out.println(c2);

        Dog dog = new Dog();
        Class c3 = dog.getClass();
        System.out.println(c3);

    }
}


class Dog {

}