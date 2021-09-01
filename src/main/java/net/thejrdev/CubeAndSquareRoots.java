package net.thejrdev;

import java.util.ArrayList;

public class CubeAndSquareRoots {


    public ArrayList<Integer> findNums(int max){
        ArrayList<Integer> nums = new ArrayList<>();
        for(int i = 1; i <= max; i++){
            if(Math.sqrt(i) % 1 == 0 && Math.cbrt(i) % 1 == 0){
                nums.add(i);
            }
        }
        return nums;
    }
}
