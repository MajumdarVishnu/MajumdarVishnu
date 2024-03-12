package com.DSA;

public class MethodOverloading {
    public int add(int a, int b){
        return a+b;
    }
//    method to add three int
    public int add(int a, int b, int c){
        return a+b+c;
    }
//    method to add two doubles
    public double add(double a , double b){
        return a+b;
    }
    public double add(double a, double b, double c){
        return a+b+c ;
    }
    public static void main(String[] args){
        MethodOverloading obj = new MethodOverloading();



        System.out.println(  obj.add(5,8));
        System.out.println(obj.add(3.5,5.6,6.9));
        System.out.println( obj.add(5.6,6.6));
    }
}

