import java.util.*;
public class Question_1 {
//    min cost to remove all elements
//    given n array elements,at every step remove an array elements.
//    cost to remove array element is sum of array elements present in array.
//    find min cost to remove all elements?
    public static void main(String[] args) {
        int[] array = {2,1,4};
        int cost = findcosttoremove(array);
        System.out.println("cost : "+cost);
    }
    static int findcosttoremove(int[] array){
        Integer[] integerArray = Arrays.stream(array).boxed().toArray(Integer[]::new);
        Arrays.sort(integerArray, (a, b) -> Integer.compare(b, a) ); // using for decending order array sorting getting from chatgpt
        int cost=0;
        for(int i=0;i< integerArray.length;i++){
            cost = cost + (integerArray[i] * (i+1));
        }
        return cost;
    }
}
