package com.barton;

public class Dog extends Mamal {
    /**
     * Multiple Inheritance is illegal
     */
    public static void main(String[] args) {
        Animal a = new Animal();
        Mamal m = new Mamal();
        Dog d = new Dog();
/**
 * getting instances print to true
 */
        System.out.println(m instanceof Animal);
        System.out.println(d instanceof Mamal);
        System.out.println(d instanceof Animal);
    }
}
