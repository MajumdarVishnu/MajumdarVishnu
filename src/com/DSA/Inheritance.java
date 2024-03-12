package com.DSA;
class Animal{
    void eat(){
        System.out.println("animal is eating");
    }
}
class Dog extends Animal{
    void barking()
    {
        System.out.println("Dog is barking..");
    }
}
class Babydog extends Dog{
    void weeping(){
        System.out.println("Its weeping..");
    }
}
class Cat extends Animal{
    void mewoing(){
        System.out.println("cat is mewoing..");
    }
}
class Lion extends Animal{
    void roar(){
        System.out.println("lion is roaring..");
    }
}
public class Inheritance {
    public static void main(String[] args){
//        single inheritance
        Dog dog= new Dog();
        dog.eat();
        dog.barking();
        System.out.println();
//        multilevel inheritance
        Babydog bdog=new Babydog();
        bdog.eat();
        bdog.barking();
        bdog.weeping();
        System.out.println();
//        multiple inheritance
        Cat cat= new Cat();
        cat.eat();
        cat.mewoing();
        Lion lion =new Lion();
        lion.eat();
        lion.roar();
    }

}
