package net.thejrdev;

import java.util.stream.IntStream;

public class TaxiNumbers {

    public int[] taxiNumbers(int max){

        IntStream stream = IntStream.range(1, max);
        stream.map(n -> (int)Math.pow(n, 3));
        int[] nums = stream.toArray();
        int[] sums = new int[nums.length * nums.length];
        for(int i = 0; i < nums.length; i++){
            
        }

    }

}
