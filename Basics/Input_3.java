package Basics;
//! Notes at the end

import java.util.Scanner; //! Importing the Scanner class from the java.util package for reading input

public class Input_3 {

    public static void main (String [] args)
    {
        Scanner sc = new Scanner(System.in); //! Ye ek baar banao then use it as many times u want

        System.out.println("What is ur name?");
        String name = sc.nextLine();

        System.out.println("My name is "+name);

        System.out.println("How old r u?");
        int age = sc.nextInt();

        System.out.println("I am "+age+" years old.");


        //! Issue using nextLine() after nextInt()  => Description in Notes at the end
        System.out.println("Do u like pizza?");
        String ans = sc.nextLine(); 
        //! Isko \n left by nextInt() mila and it thought its the end so wont take any input=>(nextLine()) frm user

        System.out.println(ans);



        //! Solution hai
        //! Use nextLine() after Int wala 

        System.out.println("How old r u?");
        int ag = sc.nextInt();

        System.out.println("I am "+ag+" years old.");


        sc.nextLine();      //!Ye \n le lega so input mein no issues


        System.out.println("Do u like pizza?");
        String answer = sc.nextLine(); 
    

        System.out.println(answer);


    }
    
}

/*
 * The `Scanner` class is used to read input from various sources, including the console, files, and strings.
 * It is part of the `java.util` package and provides methods to parse primitive types and strings using regular expressions.
 * 
 * To use the `Scanner` class, you need to import it from the `java.util` package:
 * import java.util.Scanner;
 * 
 * 1. Creating a `Scanner` Object:
 *    - `Scanner sc = new Scanner(System.in);`
 *    - Creates a `Scanner` object named `sc` to read input from the console.
 *    - `System.in` is an `InputStream` that reads data from the keyboard.
 * 
 * 2. Commonly Used Methods:
 * 
 *    - `nextLine()`
 *      - Reads a line of text (input until the Enter key is pressed).
 *      - Example: If the user types "Hello World", it captures "Hello World".
 * 
 *    - `next()`
 *      - Reads the next token (word) from the input. Delimiters (whitespace by default) are used to separate tokens.
 *      - Example: If the user types "Hello World", `next()` will capture "Hello".
 * 
 *    - `nextInt()`
 *      - Reads the next integer from the input.
 *      - Example: If the user types "42", `nextInt()` will capture 42 as an integer.
 * 
 *    - `nextDouble()`
 *      - Reads the next double-precision floating-point number.
 *      - Example: If the user types "3.14", `nextDouble()` will capture 3.14 as a double.
 * 
 *    - `nextBoolean()`
 *      - Reads the next boolean value (`true` or `false`).
 *      - Example: If the user types "true", `nextBoolean()` will capture true.
 * 
 *    - `nextChar()`
 *      - `Scanner` does not have a `nextChar()` method directly. To read a character, use `next().charAt(0)`.
 *      - Example: If the user types "A", `next().charAt(0)` will capture 'A'.
 * 
 * 3. Error Handling:
 *    - It's important to handle exceptions such as `InputMismatchException` when the input does not match the expected type.
 *    - Example: If `nextInt()` is used but the user inputs "hello", an `InputMismatchException` will be thrown.
 * 
 * 4. Closing the Scanner:
 *    - `sc.close();` - Closes the `Scanner` object to release resources. This is recommended when the `Scanner` is no longer needed.
 *    - Note: Avoid closing `System.in` if other parts of the program still need to read from the console.
 */

 /*
 * Issue Using nextLine() After nextInt()
 * 
 * When using `nextInt()` (or other similar methods like `nextDouble()`, `nextFloat()`, etc.) followed by `nextLine()`, 
 * you may encounter an issue where `nextLine()` does not behave as expected. This issue arises due to the way `Scanner` 
 * handles input buffering.
 * 
 * Explanation:
 * - `nextInt()` reads an integer value from the input but does not consume the newline character (`\n`) left in the buffer 
 *   after the integer input. This newline character represents the end of the input line.
 * - When `nextLine()` is called immediately after `nextInt()`, it reads the leftover newline character from the buffer, 
 *   which results in `nextLine()` returning an empty string.
 * 
 * Example:
 * 
 * Consider the following code:
 * 
 * import java.util.Scanner;
 * 
 * public class InputExample {
 *     public static void main(String[] args) {
 *         Scanner sc = new Scanner(System.in);
 *         
 *         System.out.println("Enter your age:");
 *         int age = sc.nextInt();                  // Reads an integer value
 *         
 *         System.out.println("Enter your name:");
 *         String name = sc.nextLine();             // Reads the remainder of the line (expected to be the name)
 *         
 *         System.out.println("Age: " + age);
 *         System.out.println("Name: " + name);
 *         
 *         sc.close();
 *     }
 * }
 * 
 * If the user inputs:
 * 25
 * John
 * 
 * The output will be:
 * Age: 25
 * Name: (empty line)
 * 
 * The `nextLine()` call reads the newline character left by `nextInt()` and thus returns an empty string.
 * 
 * Solution:
 * - To fix this issue, you should add an extra `nextLine()` call after `nextInt()` (or other similar methods) to 
 *   consume the remaining newline character.
 * 
 * Example:
 * 
 * import java.util.Scanner;
 * 
 * public class InputExample {
 *     public static void main(String[] args) {
 *         Scanner sc = new Scanner(System.in);
 *         
 *         System.out.println("Enter your age:");
 *         int age = sc.nextInt();                                  // Reads an integer value
 *         sc.nextLine();                                           // Consumes the leftover newline character
 *         
 *         System.out.println("Enter your name:");
 *         String name = sc.nextLine();                            // Reads the full line of input (expected to be the name)
 *         
 *         System.out.println("Age: " + age);
 *         System.out.println("Name: " + name);
 *         
 *         sc.close();
 *     }
 * }
 * 
 * With this adjustment, the output will be:
 * Age: 25
 * Name: John
 * 
 * Always ensure to consume any leftover newline characters after reading numerical inputs to avoid unexpected behavior 
 * with subsequent `nextLine()` calls.
 */

