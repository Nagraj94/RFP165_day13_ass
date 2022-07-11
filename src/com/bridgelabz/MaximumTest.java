package com.bridgelabz;

public class MaximumTest<T extends Comparable<T>> {
    T x,y,z;

    public MaximumTest(T x,T y,T z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
     public T maximum(){
        return MaximumTest.maximum(x,y,z);
     }
     public static <T extends Comparable<T>> T maximum(T x, T y, T z){
        T max = x;
        if(y.compareTo(max) > 0){
            max = y;
        }
        if (z.compareTo(max) > 0){
            max = z;
        }
         System.out.printf("Max of %s, %s and %s is %s\n",x,y,z,max);
        return max;
    }

    public static void main(String[] args) {
        Integer xInt = 3, yInt = 4, zInt = 5;

        new MaximumTest(xInt, yInt, zInt).maximum();
    }
}
