import java.util.Arrays;

public class Question_2 {
//    Noble Integer (distinct element)
//    given n array elements, calculate no. of noble integer present arr[i] is said to be noble if
//    {no. of elements < arr[i] = arr[i]}
    public static void main(String[] args) {
        int[] array = {-10, -5, 1, 3, 4, 5, 10};
        int count_noble = countenobleInt(array);
        System.out.println("count noble : "+count_noble);
    }
    static int countenobleInt(int[] array){
        Arrays.sort(array);
        int count_noble = 0;
        for(int i=0;i< array.length;i++){
            if(array[i] == i){
                count_noble++;
            }
        }
        return count_noble;
    }
}
