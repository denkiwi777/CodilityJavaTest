package com.company.cyclicRotation;
import java.util.Arrays;

class Main{
    public static void main(String[] args){
         CyclicRotation cyclicRotation = new CyclicRotation();
         //int[] answer = cyclicRotation.solution()

    }}
// Time spent 30 minutes -> result : 87% couldn't see the test cases
// if someone knows a be solution ,let me know !
public class CyclicRotation {
    public int[] solution(int[] A, int K){
            int[] returnArr =A;
            for(int i=0;i<K;i++){
                // Given the number K ,I call the function remove each time which repleaces
                // the value of returnArr
              returnArr = remove(returnArr);

            }
            return returnArr;
    }
    public int[] remove(int[]A ){
        // I store my object to remove
        int toRemove = A[A.length-1];
        // I create a new Array with the new Object
        int[]removed = {toRemove};
        // I create a new Array with the input array minus the last element
        int[] arrayWithoutRemoved = Arrays.copyOf(A, A.length-1);
        // I create the final returning array with the length of the the 2 arrays
        int[] returnArr = new int[removed.length + arrayWithoutRemoved.length];
        // i put the values from the first array(remove) in the position 0 of my
        // returnArr starting from the element 0 to the last one in the remove array
        System.arraycopy(removed,0,returnArr,0,removed.length);
        // same here with the second one
        System.arraycopy(arrayWithoutRemoved,0,returnArr,removed.length,arrayWithoutRemoved.length);
        return returnArr;
    }
}
