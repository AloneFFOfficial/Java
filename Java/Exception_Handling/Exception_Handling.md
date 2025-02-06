# **Exception Handling in Java** 🚀  

## **What is Exception Handling?**  
- An **exception** is an unexpected event that disrupts the normal flow of a program.  
- Exceptions occur due to **user input errors, invalid operations, or unexpected conditions** in the code.  
- Exception handling in Java allows us to gracefully handle runtime errors, preventing crashes.  

## **Types of Exceptions in Java**  
Java has two main types of exceptions:  

1. **Checked Exceptions**  
2. **Unchecked Exceptions**  

### **1. Checked Exceptions**  
- These exceptions occur **at compile-time** and must be handled before running the program.  
- The Java **compiler enforces** handling these exceptions using `try-catch` or `throws`.  
- Examples:  
  - `IOException` (File not found, unable to read file)  
  - `SQLException` (Errors in database operations)  

### **2. Unchecked Exceptions**  
- These exceptions occur **at runtime** due to invalid operations.  
- They are **not checked** at compile-time but can still be handled using `try-catch`.  
- Examples:  
  - `ArithmeticException` (Divide by zero)  
  - `NullPointerException` (Accessing an object reference that is `null`)  
  - `ArrayIndexOutOfBoundsException` (Accessing an invalid index in an array)  

---

## **Commonly Occurring Exceptions in Java**  

| Exception Name                    | Cause |
|------------------------------------|--------------------------------------------------------------------------------------|
| **NullPointerException**          | Accessing a null reference. |
| **ArithmeticException**           | Division by zero (`int a = 10 / 0;`). |
| **ArrayIndexOutOfBoundsException** | Accessing an invalid array index. |
| **IllegalArgumentException**       | Passing invalid arguments to a method. |
| **NumberFormatException**         | Trying to convert an invalid string into a number (`Integer.parseInt("abc");`). |

---

## **1. Arithmetic Exception Example**  
This example demonstrates an **ArithmeticException** caused by division by zero.  

### ❌ **Without Exception Handling (Error Occurs)**
```java
public class Main {
    public static void main(String[] args) {
        int a = 6000;
        int b = 0;
        int c = a / b; // This line will cause an error (ArithmeticException)
        System.out.println("The result is " + c);
    }
}
```
⛔ **Error:** `Exception in thread "main" java.lang.ArithmeticException: / by zero`  

---

### ✅ **Handling ArithmeticException Using try-catch**
```java
public class Main {
    public static void main(String[] args) {
        int a = 6000;
        int b = 0;
        try {
            int c = a / b; // Code that may cause an exception
            System.out.println("The result is " + c);
        } 
        catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero!");
        }
    }
}
```
✔️ **Output:** `Error: Cannot divide by zero!`  

---

## **2. Handling Specific Exceptions**  
- We can handle multiple exceptions by **using multiple catch blocks**.  
- This ensures each error is handled properly.  

### ✅ **Example: Handling Different Exceptions**
```java
import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            // Some risky code
            BufferedReader br = new BufferedReader(new FileReader("file.txt")); // May cause IOException
            int result = 10 / 0; // May cause ArithmeticException
        } 
        
        catch (IOException e) {
            System.out.println("File not found or cannot be read!");
        } 
        
        catch (ArithmeticException e) {
            System.out.println("Math error: Division by zero!");
        } 
        
        catch (Exception e) {
            System.out.println("Some other error occurred: " + e);
        }
    }
}
```
✔️ **Output (if file not found):** `File not found or cannot be read!`  
✔️ **Output (if division by zero):** `Math error: Division by zero!`  

---

## **3. Nested try-catch Blocks**  
- Java allows **nested try-catch** blocks, meaning a `try` block inside another `try` block.  
- This is useful when handling multiple exceptions at different levels of execution.  

### ✅ **Example: Nested try-catch**
```java
public class Main {
    public static void main(String[] args) {
        try {
            // Outer try block
            try {
                int arr[] = {1, 2, 3};
                System.out.println(arr[5]); // This will throw ArrayIndexOutOfBoundsException
            } 
            catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Array index is out of bounds!");
            }

            int result = 10 / 0; // This will throw ArithmeticException
        } 
        catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero!");
        }
    }
}
```
✔️ **Output:**  
```
Array index is out of bounds!
Cannot divide by zero!
```

---

## **Key Takeaways**
✅ **Exceptions prevent program crashes and improve robustness.**  
✅ **Checked exceptions must be handled at compile-time, whereas unchecked exceptions occur at runtime.**  
✅ **Use `try-catch` to handle exceptions gracefully.**  
✅ **Multiple catch blocks help in handling different exceptions separately.**  
✅ **Nested try-catch is useful when dealing with multiple error-prone sections.**  
