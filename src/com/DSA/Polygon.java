package com.DSA;

public class Polygon{
    int length,breadth;
    Polygon(int x, int y){
        length=7;
        breadth=5;
    }
    int PolygonArea(){
        return (length*breadth);
    }
}
class PolygonArea {
    public static void main(String args[]){
        Polygon pla= new Polygon(15,10);
//        pla.length=15;
//        pla.breadth=10;
        int area1= pla.PolygonArea();
        System.out.println("area;"+area1);

    }
}

