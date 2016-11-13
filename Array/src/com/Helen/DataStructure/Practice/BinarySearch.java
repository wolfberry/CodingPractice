import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by HelenLi on 10/9/16.
 * watch out when to move left, when to move right
 */
public class BinarySearch {
    public int search(int n, ArrayList<Integer> array){

        int mid;
        int left = 0;
        int right = array.size()-1;

        while(left<=right){
            mid = left + (right - left)/2;
            /*if(array.get(mid) < n){
                left = mid + 1;
            }else if(array.get(mid) == n){
                return mid;
            }else{
                right = mid - 1;
            }*/

            if(array.get(mid) == n){
                return mid;
            }else if(array.get(mid) < n){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }


        //System.out.println(mid);
        return -1;
    }

    public static void main(String[] args){
        ArrayList<Integer> array =  new ArrayList<Integer>(Arrays.asList(1,3,5,6,8,9,10));
        BinarySearch bs = new BinarySearch();
       int result; //= bs.search(5, array);
//        result = bs.search(1, array);
//        result = bs.search(3, array);
//        result = bs.search(5, array);
//        result = bs.search(6, array);
//        result = bs.search(8, array);
//        result = bs.search(9, array);
//        result = bs.search(10, array);
        result = bs.search(1, array);
        System.out.println(result);


    }

}

