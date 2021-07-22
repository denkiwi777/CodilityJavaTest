package com.company.binaryGap;
// initial result was 60% as I didn't consider the case where there was only one 0
// there requirements are hard to understand
  class Main {
    public static void main(String[] args){
        BinaryGap binaryGap = new BinaryGap();
        int solution = binaryGap.solution(5);
    }
}

public class BinaryGap {
    public int solution(int N) {

        //We start with a return value default 0
        //and a tempVal to store the counting variable
        int returnVal = 0;
        int tempVal = 0;
        //we convert our integer in a a binary string and we split every character to have an array
    String[] binaryArr = Integer.toBinaryString(N).split("");

        for (String number: binaryArr
             ) {
            //if we find a 0 while we cycle ,we increase the tempVal
                if(Integer.parseInt(number)==0 ){
                    tempVal ++;
                }

                else{
                    //if not we reset the tempVal and check if it's bigger than 0 and bigger
                    //than the current returnVal
                    if(tempVal>0 && returnVal<tempVal){
                        returnVal = tempVal;

                    }
                    tempVal=0;
                }
        }
        return returnVal;
    }
}
