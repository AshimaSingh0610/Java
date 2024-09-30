import java.util.*;

//! Take an array of numbers as input and check if it is an array sorted in ascending order.
            //! Eg : { 1, 2, 4, 7 } is sorted in ascending order.
            //! {3, 4, 6, 2} is not sorted in ascending order.

public class IsSorted_Or_Not{


    public static void main(String args[]){

            //Input
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter size of arr:");
            int size = sc.nextInt();

            int[] num = new int[size];


            System.out.println("Enter nums: ");
            for(int i=0;i<num.length;i++)
            {
                num[i]=sc.nextInt();
            }

            //Check ascending or not 

            boolean isAsending = true;

        //     /**
        //  * Understanding Array Indexing
        //  * 
        //  * Array Length:
        //  * When you create an array in Java, its length is the total number of elements it can hold.
        //  * For example, if you create an array with size = 5, the valid indices for that array are 0, 1, 2, 3, 4.
        //  * So, num.length gives you 5, but the last index you can use is 4 (which is num.length - 1).
        //  * 
        //  * Why num.length - 1:
        //  * When you want to compare each element in the array with the next element (to check if the array is sorted), 
        //  * you look at pairs of elements.
        //  * For instance, you compare num[0] with num[1], num[1] with num[2], and so on, 
        //  * until the last pair which is num[3] with num[4] in a 5-element array.
        //  * If you tried to compare num[4] (the last element) with num[5], 
        //  * it would cause an ArrayIndexOutOfBoundsException because num[5] does not exist; 
        //  * the valid indices go from 0 to 4.
        //  * 
        //  * Example:
        //  * Let's look at a simple example with a 5-element array:
        //  * 
        //  * int[] num = {1, 2, 3, 4, 5}; // This array has 5 elements
        //  * Length of Array: num.length is 5.
        //  * Valid Indices: The valid indices are 0, 1, 2, 3, 4.
        //  * 
        //  * Looping through the Array:
        //  * To check if the array is sorted, you only need to loop through the first 4 indices (from 0 to 3)
        //  * and compare them with the next index:
        //  * 
        //  * for (int i = 0; i < num.length - 1; i++) { // Loop from 0 to 3
        //  *     // Compare num[i] with num[i + 1]
        //  * }
        //  * When i is 0, you compare num[0] with num[1].
        //  * When i is 1, you compare num[1] with num[2].
        //  * When i is 2, you compare num[2] with num[3].
        //  * When i is 3, you compare num[3] with num[4].
        //  * 
        //  * After that, if i were to reach 4, you would try to compare num[4] with num[5], which doesn’t exist!
        //  */

        //  //! num.length => ArrayIndexOutOfBound Error
        //  //! Use num.length - 1 

            for(int i=0;i<num.length - 1;i++)
            {
                if(num[i]>num[i+1])
                {
                    isAsending = false;
                    break; // No need to check further
                }
            }

            //Output

            if(isAsending==true)
            {
                System.out.println("Array is in asending");
            }
            else{

                System.out.println("Array is not in asending");

            }

        }


 }

        //!=======================================================