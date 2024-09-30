import java.util.*;

public class MinMax {

    public static void main(String args[])
    {
        //!Find the maximum & minimum number in an array of integers.
        
        //!Meth 1
        //* Recommended Approach
            // You could do something like this:

            // Check if the array size is greater than 0 before proceeding with the maximum and minimum calculations.
            // Use your initialization method if the array is non-empty, but still consider edge cases.

        //Input
        // Scanner sc = new Scanner(System.in);

        // System.out.print("Enter size of array:");
        // int size = sc.nextInt();
        // sc.nextLine();

        // //Check array 0 or -ve before input otherwise //! Error => ArrayIndexOutOfBoundsException => if size = 0
        // if(size<=0)
        // {
        //     System.out.println("Array must be positive");
        //     sc.close();
        //     return;
        // }

        // int[] num = new int[size];
        // System.out.println("Enter integers :");

        // for(int i=0; i<num.length;i++)
        // {
        //     num[i] = sc.nextInt();
        // }


        // int max = num[0];
        // int min = num[0];


        // //Output
        // for(int i=0;i<num.length;i++)
        // {
        //     if(num[i]>max)
        //     {
        //         max=num[i];
        //     }
        //     if(num[i]<min)
        //     {
        //         min=num[i];
        //     }

        // }

        // System.out.println("Max is "+ max + "Min is " +min);
        // sc.close();   
        
        // !--------------------------------

        // ! Meth2
        // ! Use MAX_VALUE and MIN_VALUE

        //Input
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of int: ");
        int size = sc.nextInt();
        sc.nextLine();

        int[] num = new int[size];

        System.out.println("Enter "+size+" int values :");
        for(int i=0 ; i<num.length; i++)
        {
            num[i] = sc.nextInt();
        }

        
        // //Output
        // //! Initialize max and min with extreme values
        // /**
        //  * The maximum value in the array.
        //  * 
        //  * This variable is used to track the highest integer 
        //  * value found in the input array. It is initialized 
        //  * to Integer.MIN_VALUE to ensure that any number entered 
        //  * by the user will be larger than this initial value. 
        //  * This allows for accurate comparisons during the 
        //  * search for the maximum value.
        //  */

         int max = Integer.MIN_VALUE; // Start with the smallest possible integer
         int min = Integer.MAX_VALUE; // Start with the largest possible integer

        for(int value:num)
        {
            if(value>max)
            {
                max = value;
            }
            if(value<min)
            {
                min = value;
            }
        }

        System.out.println("MAX is "+max+" Min is "+min);
        sc.close();


    }
    
}
