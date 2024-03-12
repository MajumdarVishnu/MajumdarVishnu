package com.DSA;

public class IfElse {
    public static void main(String[] args){
        int result = 80;
        char grade;
        if (result>90){
            grade ='A';
        } else if (result>=80) {
            grade='B';

        } else if (result>=70) {
            grade='C';
        }
//        Object esle;
        else if(result>=60){
            grade='D';
        }
        else {
            grade='F';

        }
        System.out.println("Grade of student is :"+grade);
    }
}
