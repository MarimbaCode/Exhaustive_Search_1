package net.thejrdev;



public class PalindromicNumbers {


    public int getPalindrome(int max){
        int count = 0;
       for(int i = 1; i <= max; i++){
           count += isPalindrome(String.valueOf(i)) ? 1 : 0;
       }
       return count;
    }

    protected boolean isPalindrome(String num){
        return new StringBuilder().append(num).reverse().toString().equals(num);
    }


}
