import java.util.*;

public class ArrayBasic{

    public static void main(String args[]){

        //! Initializing an array

        int[] arr1 = {1,2,3};

        int[] arr2 = new int[5];



        //! Print value
        System.out.println(" Array 1 :"+ Arrays.toString(arr1));



        //!Finding the Length of an Array

        System.out.println("Leng of Array1 :"+ arr1.length);




        //! User Input

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int [] num = new int[size];


        //Input
        for(int i=0;i<size;i++)
        {
            num[i] = sc.nextInt();
        }


        //Output
        for(int i=0;i<size;i++)
        {
            System.out.println(num[i]);

        }

        sc.close();





      



    }
}