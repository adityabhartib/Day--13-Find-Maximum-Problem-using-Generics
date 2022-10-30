package com.bridgelabz;

import java.util.ArrayList;
import java.util.Collections;

public class TestMaximum<T extends Comparable<T>> {

        ArrayList<T> list = new ArrayList<T>();

        TestMaximum(T... inputs) {

            for (T value : inputs) {
                this.list.add(value);
            }
        }

        public T testMaximum() {
            return TestMaximum.testMaximum(list);
        }

        public static <T extends Comparable<T>> T testMaximum(ArrayList<T> list) {
            Collections.sort(list);
            T maxValue = list.get(list.size() - 1);
            System.out.println("Maximum value: " + maxValue);
            return maxValue;
        }

        public static void main(String[] args) {
            System.out.println("----!Welcome to Generic Test Maximum!-----");
            Integer intValue1 = 30, intValue2 = 50, intValue3 = 90;
            Float floatValue1 = 3.3f, floatValue2 = 3.5f, floatValue3 = 8.7f;
            String stringValue1 = "Apple", stringValue2 = "Peach", stringValue3 = "Banana";

            new TestMaximum(intValue1, intValue2, intValue3).testMaximum();
            new TestMaximum(floatValue1, floatValue2, floatValue3).testMaximum();
            new TestMaximum(stringValue1, stringValue2, stringValue3).testMaximum();
        }
    }