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
    public static String testMaxString(String x, String y, String z){
        String max = x;
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
        Integer xInt = 4, yInt = 5, zInt = 3;
        Float xFloat = 5.5f, yFloat = 4.4f, zFloat = 6.6f ;
        String xString = "Apple", yString = "Peach", zString = "Banana";
        MaximumTest.testMaxString(xString,yString,zString);
        new MaximumTest(xInt, yInt, zInt).maximum();
        new MaximumTest(xFloat,yFloat,zFloat).maximum();
        new MaximumTest(xString,yString,zString).maximum();
    }
}
