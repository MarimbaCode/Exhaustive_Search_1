package net.thejrdev;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class TaxiNumbers {

    public ArrayList<Long> taxiNumbers(int max){


        ProgressBar progressBar = new ProgressBar();
        int[] nums = IntStream.range(1, max).map(n -> (int)Math.pow(n, 3)).toArray();

        ArrayList<Long> sums = new ArrayList<>();
        ArrayList<Long> out = new ArrayList<>();
        long sum;
        for(int i = 0; i < nums.length - 1; i++){
            for(int j = i+1; j < nums.length; j++){
                sum = (nums[i] + nums[j]);
                if(sums.contains(sum)){
                    out.add(sum);
                }else{
                    sums.add(sum);
                }
            }
            System.out.print("\r" + progressBar.createBar(i, nums.length));
        }
        return out;
    }

}
