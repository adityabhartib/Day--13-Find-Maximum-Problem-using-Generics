package com.bridgelabz;

public class TestMaximum {
    public static String compareTo(String str1,String str2,String str3) {
        if(str1.compareTo(str2) > 0 ) {
            if(str1.compareTo(str3) > 0) {
                return str1;
            } else {
                return str3;
            }
        } else {
            if(str2.compareTo(str3) > 0) {
                return str2;
            } else {
                return str3;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("----!Welcome to Generic Test Maximum!-----");
        String maxString=compareTo("Banana","Peach","Apple");
        System.out.println("Maximum from 3 String : "+maxString);
    }
}