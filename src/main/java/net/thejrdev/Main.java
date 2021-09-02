package net.thejrdev;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {

        //System.out.println(IntStream.range(1, Integer.parseInt(args[0])).filter(num -> new StringBuilder().append((num)).reverse().toString().equals((String.valueOf(num)))).count());

        //System.out.println(Arrays.toString(IntStream.range(1, Integer.parseInt(args[0])).filter(num -> (Math.sqrt(num) % 1 == 0 && Math.cbrt(num) % 1 == 0)).toArray()));


        TaxiNumbers nums = new TaxiNumbers();

        System.out.println(Arrays.toString(nums.taxiNumbers(100).toArray()));


        /*
        PalindromicNumbers nums = new PalindromicNumbers();

        System.out.println(nums.getPalindrome(Integer.parseInt(args[0])));

         */


    }
}
