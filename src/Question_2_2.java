import java.util.Arrays;

public class Question_2_2 {
//    Noble Integer (element can repeat)
    public static void main(String[] args) {
        int[] array = {-10, 1, 1, 1, 4, 4, 4, 7, 10};
        int count_noble = countnobleInt(array);
        System.out.println("count noble : "+count_noble);
    }
    static int countnobleInt(int[] array){
        Arrays.sort(array);
        int count_noble = 0;
        if(array[0]==0){
            count_noble++;
        }
        int cnt=0;
        for(int i=1;i< array.length;i++){
            if(array[i]!=array[i-1]){
                cnt=i;
            }
            if(array[i]==cnt){
                count_noble++;
            }
        }
        return count_noble;
    }
}
