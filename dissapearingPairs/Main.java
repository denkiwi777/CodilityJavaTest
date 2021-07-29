package com.company.dissapearingPairs;

public class Main{
    public static void main(String[] args){
        Solution solution = new Solution();
        String S = "BABABA";
        String result =  solution.solution(S);

    }
}

 class Solution{
    public String solution(String S){
        String solution = S;
        String[] pairs = {"AA", "BB", "CC"};
        int stops = 0;
        for (String pair: pairs
             ) {
            int index = solution.indexOf(pair);
            if (index == -1)
            {
                stops++;
                if(stops==3){
                    return solution;
                }
                continue;
            }
            else
            {
                 solution = solution.substring(0, index) +
                        solution.substring(index + pair.length());
            }

        }
        if(solution.length()>1){
           return solution(solution);
        }
        return solution;

    }
}
