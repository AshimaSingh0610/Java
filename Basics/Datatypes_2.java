package Basics;
//! Notes at the end
//! Use This => cd "e:\PROGRAMS\Java\" && javac -encoding UTF-8 Datatypes_2.java && java Datatypes_2 
//! as UTf 8 encoding avoids error due to  ✅ n ❌

public class Datatypes_2 {
    public static void main (String [] args)
    {
        int x = 123;
        long y = 132L;          //Need L
        double z = 32.4;
        float w = 33.4f;        //Need f
        boolean c = true;       //boolean c = pizza  ❌  can only hold true or false  
        char symbol ='@';
        
        String name = "Ash";   //Ref dataty beigns with capital letters as String ✅ string ❌

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(w);
        System.out.println(c);
        System.out.println(symbol);
        System.out.println("My name is "+name);

    }
/*
 * Java Data Types
 * 
 * 1. Primitive Data Types:
 *    - These are the most basic data types built into the language.
 *    - They hold simple values and are not objects.
 *    - Java has 8 primitive data types:
 * 
 * | Data Type | Size (Bits) | Size (Bytes) | Description                             | Example                  |
 * |-----------|-------------|--------------|-----------------------------------------|--------------------------|
 * | byte      | 8           | 1            | Whole numbers from -128 to 127          | byte age = 30;           |
 * | short     | 16          | 2            | Whole numbers from -32,768 to 32,767    | short temperature = -200;|
 * | int       | 32          | 4            | Whole numbers from -2^31 to 2^31-1      | int count = 1000;        |
 * | long      | 64          | 8            | Whole numbers from -2^63 to 2^63-1      | long population = 7896541230L;|
 * | float     | 32          | 4            | Fractional numbers, end with 'f'        | float pi = 3.14f;        |
 * | double    | 64          | 8            | Fractional numbers                      | double price = 99.99;    |
 * | char      | 16          | 2            | Single character or Unicode             | char grade = 'A';        |
 * | boolean   | 1           | -            | true or false values                    | boolean isJavaFun = true;|
 * 
 * =======================================
 * 
* 2. Reference Data Types:
 *    - These are complex data types that reference objects.
 *    - Unlike primitive types, reference types store addresses of objects they refer to.
 *    - Examples include classes, interfaces, arrays, and enumerations.
 * 
 * =========================================
 * 
 * 3. Autoboxing and Unboxing:
 *    - Autoboxing: Automatic conversion of primitive types to their corresponding wrapper classes (e.g., int to Integer).
 *    - Unboxing: Automatic conversion of wrapper classes to their corresponding primitive types (e.g., Integer to int).
 * 
 * =========================================
 * 
 * 4. Advanced Concepts:
 *    - Memory Management: 
 *      a. Primitive types are stored in the stack memory.
 *      b. Reference types are stored in the heap memory, and their references are stored in the stack memory.
 *    - Passing Parameters:
 *      a. Primitive types are passed by value.
 *      b. Reference types are also passed by value, but the value is the reference to the object.
 *    - Immutable Objects:
 *      a. Some classes (e.g., String) are immutable, meaning their instances cannot be modified after creation.
 *    - Wrapper Classes:
 *      a. Each primitive type has a corresponding wrapper class in java.lang package (e.g., int -> Integer, char -> Character).
 *      b. These classes provide methods to convert between types, compare values, etc.
 * 
 * ================================================
 * 
 * Exercise:
 * Imagine you are designing a system to store employee records. Decide which data types (primitive or reference) would be suitable for the following attributes:
 * 
 * Attribute         | Data Type          
 * ----------------- | ------------------ 
 * Employee ID       | int                
 * Employee Name     | String             
 * Date of Joining   | LocalDate (from java.time package) 
 * Department        | String             
 * Salary            | double             
 * Manager           | Employee (custom class representing an employee) 
 * Is Active         | boolean            
 * 
 * ===============================================================
 * 
 * Difference between Primitive and Reference Data Types in Java
 * 
 * | Feature                | Primitive Data Types                                      | Reference Data Types                           |
 * |------------------------|-----------------------------------------------------------|------------------------------------------------|
 * | Definition             | Simple, built-in data types.                              | Complex types, referring to objects.           |
 * | Examples               | byte, short, int, long, float, double, char, boolean.     | String, Arrays, Classes, Interfaces.           |
 * | Memory Location        | Stored in stack memory.                                   | Reference stored in stack, object in heap.     |
 * | Size                   | Fixed size (e.g., int is 32-bit).                         | Size depends on object.                        |
 * | Value Representation   | Direct value.                                             | Memory address (reference to object).          |
 * | Default Values         | 0 (numeric), false (boolean), '\u0000' (char).            | null.                                          |
 * | Passing to Methods     | Passed by value.                                          | Passed by value (reference is copied).         |
 * | Wrapper Classes        | Each has a corresponding wrapper class (e.g., int -> Integer). | No wrappers, they are inherently objects. |
 * | Mutability             | Immutable (e.g., int value can't change itself).          | Mutable or immutable (depends on object).      |
 * | Performance            | Generally faster, less memory overhead.                   | Slower, more memory overhead.                  |
 * | Usage                  | Simple operations and arithmetic.                         | Complex data structures and objects.           |
 * | Autoboxing/Unboxing    | Supports autoboxing and unboxing.                         | Not applicable.                                |
 * 
 * //!============================================================
 */
    
    
}
