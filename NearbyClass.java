package com.zoli;

import java.util.ArrayList;

public class NearbyClass {

    private static int[][] multi = new int[][]{
            { 2, 0, 4, 1241, 12, 5, 11, 1110, -42, 424, 1, 12323 },
            { 1, 3, 5, 7 },
            { 321, 320, 32, 3, 41241, -11, -12, -13, -66, -688 }
    };

    public static int[] nearby(int x, int y, int range){
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        if (x > -1 && x < multi.length){
            for (int i = 0; i < (range*2+1); i++){
                int index = y-range+i;
                //System.out.println(index);
                if (index != y && index > -1 && index < multi[x].length){
                    numbers.add(multi[x][y-range+i]);
                }
            }
        }
        int[] numberArray = new int[numbers.size()];
        for (int i = 0; i< numbers.size(); i++){
            numberArray[i] = numbers.get(i);
        }
        return numberArray;
    }

    public static void main(String[] args) {
	// write your code here
        for (int number : NearbyClass.nearby(1,3,5)){
            System.out.println(number);
        };
    }
}
