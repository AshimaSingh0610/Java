public class Print_1 {
    public static void main (String [] args)
    {

        System.out.println("I like pizza");     //!  Leaves new line then get to other line
        System.out.print("I like apples\n");    //! Now \n is escape sequence
        System.out.println("\t I love painting"); //! Now \t is tab sequence

        /*
         * To print * , " " \ other special char
         * Use \ backslash for that
         * 1. * => \*
         * 2. \ => \\
         * 3. "" => \"\"
         */

         System.out.println("Hi \"I am Ash\"");           //! Prints "" as well
         System.out.println("How r you\\u doin?");       //! Prints / 

    }
}
