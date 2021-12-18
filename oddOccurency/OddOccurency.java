
//initially got 55% in around 11 min, it was an pretty easy task
//but i have failed the perfomance test
//any tips to make it faster are apreciated
public class OddOccurency{
    public int solution(int[] A) {
        for (int number: A
             ) {
           int numberOfTimes =  countOccurrences(A,A.length, number);
           if(numberOfTimes==1){
               return number;
           }
        }
        }
    static int countOccurrences(int arr[], int n, int x)
    {
        int res = 0;
        for (int i=0; i<n; i++)
            if (x == arr[i]) {
                res++;
            }
        //this if was added after I submitted the results,
        //this should make it faster, so it doesn't cycle the whole list if the value is above 1
        if(res>1) {
            return res;
        }
        return res;
    }
        //This solution is better in terms of performance
    //not mine
    public int solution2(int[] A) {

        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        int oddElement = 0;

        if(A.length > 0 && A.length < 1_000_000){

            for(int ctr=0; ctr < A.length; ctr++){
                if(frequencyMap.containsKey(A[ctr])){
                    frequencyMap.put(A[ctr], frequencyMap.get(A[ctr]) + 1);
                } else {
                    frequencyMap.put(A[ctr], 1);
                }
            }

            for(Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()){
                if(entry.getValue() % 2 != 0){
                    oddElement = entry.getKey();
                    break;
                }
            }
        }

        return oddElement;
    }
}