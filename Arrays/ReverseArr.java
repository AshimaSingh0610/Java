import java.util.*;

public class ReverseArr {

    public static void main(String[] args) {

        //!Print array in reverse

        //!Meth 1

        // This method simply prints the array in reverse order without changing the original array.

        // Time Complexity (TC): O(n)
        // Two separate loops are used: one to print the original array and one to print it in reverse. 
        // Each loop iterates over the entire array once, leading to a total time complexity of O(n).

        // Space Complexity (SC): O(1)
        // No additional space is required other than loop variables.

        // Pros:
        // - Does not modify the original array: This method is better if you only want to 
        // print the reversed array without changing the original one.
        // - Simple and readable: Easy to understand and use when the only goal is displaying the result.
        // Cons:
        // - Doesn't actually reverse the array: The original array remains unchanged; 
        // only the reverse is printed.
        

        // int[] num = {1,2,3,4,5};

        // // Understanding the Issue
        // // When printing elements of an array, if you just print them one after the other with a comma, 
        // // you might end up with an extra comma after the last element. 
        // // For example, if you have an array like {1, 2, 3}, printing it without any checks would look like this:
        // // Output: 1, 2, 3,
        // // This extra comma at the end is usually not what we want. 
        // // It can look unprofessional or confusing, especially in user interfaces or output displays.

        // // The Solution
        // // To avoid this trailing comma, we can use a conditional expression that checks 
        // // if the current element is the last one in the array before adding a comma. 

        // // The Code Breakdown
        // //! for (int i = 0; i < num.length; i++) {
        //     // Print the current element of the array
        // //!    System.out.print(num[i] + (i < num.length - 1 ? ", " : ""));
            
        //     // Explanation of the conditional part:
        //     // (i < num.length - 1 ? ", " : ""):
        //     // This is a conditional (ternary) operator.
        //     // It checks if the current index i is less than num.length - 1:
        //     // If true (meaning the current element is not the last element), 
        //     // it returns ", ", which adds a comma and a space after the current element.
        //     // If false (meaning the current element is the last one), 
        //     // it returns "" (an empty string), which means no comma will be added.


        // System.out.println("Original: ");
        // for(int i=0;i<num.length;i++)
        // {
        //     System.out.print(num[i]+(i<num.length-1?",":""));

        // }

         
        // System.out.println(); // Move to the next line for better readability

        // System.out.println("Reversed: ");

        // for(int i=num.length-1;i>=0;i--)
        // {
        //     System.out.print(num[i]+(i>0?",":""));
        // }


        //!------------------------------

        //!Meth2
        //! Two Pointer Method
        // Meth 2: In-Place Reversal
        // This method reverses the array by swapping the first element with the last, 
        // the second element with the second-to-last, and so on.

        // Time Complexity (TC): O(n)
        // The array is traversed once, and half of the elements are swapped with 
        // their corresponding elements from the end of the array.
        // Hence, this method runs in linear time O(n), where n is the number of elements.

        // Space Complexity (SC): O(1)
        // This method does not use any extra space. The array is modified in-place, 
        // which makes it efficient in terms of memory usage.

        // Pros: 
        // - Efficient: Only requires one pass through the array to reverse it.
        // - Low space usage: It doesn’t require additional space.
        // Cons:
        // - Modifies the original array: If the original array is needed later, 
        // this method is not suitable unless a copy is made beforehand.

        int[] num={1,2,3,4};

        System.out.println("Original: "+Arrays.toString(num));

        revArr(num);

        System.out.println("Reverse: "+Arrays.toString(num));


        }

        public static void revArr (int[] arr){

            int i=0,j=arr.length-1;
            while(i<j)
            {
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            }
        }

    }
    

