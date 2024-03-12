package com.DSA;

class Pyramid {
     void draw(char ch) {
        for(int i = 0;i<10;i+=2) {
            for(int k = 10-i ;k>0 ;k -=2 ){
                System.out.print(" ");
            }
            for(int j = 0 ; j<=i ; j++) {
                System.out.print(ch) ;
            }
            System.out.println();
        }
    }
}
class A extends Thread {
    Pyramid p ;
    A(Pyramid p) {
        this.p = p ;
    }
    public void run() {
        p.draw('*');
    }
}
class B extends Thread {
    Pyramid p ;
    B(Pyramid p) {
        this.p = p ;
    }
    public void run() {
        p.draw('+');
    }
}
public class HelloWorld{
    public static void main(String []args){
        Pyramid p = new Pyramid();
        A a = new A(p) ;
        B b = new B(p) ;

        a.start() ;
        b.start() ;
    }
}