package com.bridgelabz;

public class TestMaximum {
    public static Float compareTo(Float a,Float b,Float c) {
        if(a > b){
            if(a > c) {
                return a;
            } else {
                return c;
            }
        } else {
            if(b > c) {
                return b;
            } else {
                return c;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("----!Welcome to Generic Test Maximum!-----");
        Float maxFloat=compareTo(10.50F,10.70F,900.60F);
        System.out.println("Maximum from 3 Float : "+maxFloat);
    }
}