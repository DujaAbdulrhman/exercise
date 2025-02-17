import java.util.ArrayList;
import java.util.Arrays;

public class Day6ex {
    public static void main(String[] args){


        /*1.Write a Java program to test if the first and the last element of an array of
        integers are same. The length of the array must be greater than or equal to
        2 Test Data:
        array = 50, -20, 0, 30, 40, 60, 10
        Sample Output: false */

       /*int [] num={50,-20,0,30,40,60,10};
       if (num[0]==nnum[num.length - 1]){
           System.out.println(true);
       }else System.out.println("false");*/






        /*2.Write a Java program to find the numbers greater than the average of the
        numbers of a given array.
        Original Array:
        [1, 4, 17, 7, 25, 3, 100]
        Expected Output:
        The average of the said array is: 22.0 The numbers in the said array that are
        greater than the average are: 25 100 */

        /*int []num={1, 4, 17, 7, 25, 3, 100};
        int sum=0;
        int avarege=0;
        int grater = 0;
        ArrayList<Integer> newlisr=new ArrayList<>();
        for (int j : num) {
            sum += j;
        }
        avarege = sum/num.length;
        for (int j : num) {
            if (j > avarege) {
                newlisr.add(j);
            } else continue;
        }
        System.out.println("The average of the said array is: "+avarege+" The numbers in the said array that are\n" +
                "greater than the average are: "+newlisr);*/


        /*3.Write a Java program to get the larger value between first and last
        element of an array of integers.
        Original Array:
        [20, 30, 40]
        Sample Output:
        Larger value between first and last element: 40*/

       /*  int[] larger = {20, 30, 40};
        int n = larger.length;

        if (n > 0) {

            int largestValue = larger[0];

            for (int i = 1; i < n; i++) {
                if (larger[i] > largestValue) {
                    largestValue = larger[i];
                }
            }
            System.out.println("Original Array: " + java.util.Arrays.toString(larger));
            System.out.println("Largest value in the array: " + largestValue);
        }
*/

        /*4.Write a Java program to swap the first and last elements of an array and
        create a new array.
        Original Array:
        [20, 30, 40]
        Sample Output:
        New array after swapping the first and last elements: [40, 30, 20]*/

        /*ArrayList swap=new ArrayList<>();
        swap.add(20);
        swap.add(30);
        swap.add(40);

        swap.set(2, 20);
        swap.set(0,40);
        System.out.println("New array after swapping the first and last elements: "+swap);*/

        /*5.Write a program that places the odd elements of an array before the
        even elements.
        Original Array:
        [2,3,40,1,5,9,4,10,7]
        Sample Output:
        [3,1,5,9,7,2,40,4,10]*/


        /*ArrayList<Integer> original = new ArrayList<>();
        original.add(2);
        original.add(3);
        original.add(40);
        original.add(1);
        original.add(5);
        original.add(9);
        original.add(4);
        original.add(10);
        original.add(7);

        ArrayList<Integer> copy = new ArrayList<>();

        for (Integer value : original) {
            if (value % 2 != 0) {
                copy.add(value);
            }
        }

        for (Integer integer : original) {
            if (integer % 2 == 0) {
                copy.add(integer);
            }
        }
        for (int i = 0; i < original.size(); i++) {
            original.set(i, copy.get(i));
        } System.out.println(original);*/

        /*6. Write a program that test the equality of two arrays.
        [2,3,6,6,4] [2,3,6,6,4]
        Sample Output: true */

       /* int[] num1={2,3,6,6,4};
        int []num2={2,3,6,6,4,};
        boolean areEqual = true;
        
        if (num1.length != num2.length) {
            areEqual = false;
        } else {
            for (int i = 0; i < num1.length; i++) {
                if (num1[i] == num2[i]) {
                    areEqual = true;
                }else {areEqual=false;}
            }}System.out.println(areEqual);*/



    }
}
