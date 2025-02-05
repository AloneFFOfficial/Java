# Object-Oriented Programming (OOP) in Java

## Public Class
- A **public class** is the main class and serves as the entry point of our program.
- The file name should match the class name to avoid compilation errors.

### Defining a Public Class
```java
// The class name should match the file name (ClassName.java)
public class ClassName {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

## Regular Class
- A **regular class** is a normal class that we define in the program.
- It can be called from the main public class.

### Defining a Regular Class
```java
// The class name can be any valid identifier
class ClassName {
    // Class members (variables, methods) go here
}
```

## Creating and Using Classes
- Below is an example where we define a `Pen` class and call its methods from the `Main` class.
- The `this` keyword refers to the current object's instance.

### Example: Calling a Class from the Main Class
```java
class Pen {
    String color;
    String type;

    public void write() {
        System.out.println("This function writes something");
    }

    public void writeColor() {
        System.out.println("The color of the pen is: " + this.color);
    }
}

public class Main {
    public static void main(String[] args) {
        Pen pen1 = new Pen();
        pen1.color = "Blue";
        pen1.type = "Gel";

        pen1.write();
        pen1.writeColor();
    }
}
```

## Constructors
- A **constructor** is a special method used to initialize objects.
- The constructor has the same name as the class and does not have a return type.

### Example: Defining a Constructor
```java
class Student {
    String name;
    int age;

    // Constructor
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void printInfo() {
        System.out.println(this.name + " " + this.age);
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Rahul", 18);
        s1.printInfo();
    }
}
```
## Destructors
- Like constructors we also have destructors in they distrory the objects we created.
- In java we have inbuild constructors and they destroy the objects itself if it is not used anywhere else in the code.

## Polymorphism
- **Polymorphism** means "many behaviors".
- It allows methods to have the same name but different parameters (Method Overloading).

### Example: Method Overloading
```java
class Student {
    public void printInfo(String name) {
        System.out.println(name);
    }

    public void printInfo(String name, int age) {
        System.out.println(name + " " + age);
    }

    public void printInfo(int age) {
        System.out.println(age);
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.printInfo("Rahul");
        s1.printInfo("Rahul", 20);
        s1.printInfo(20);
    }
}
```
## Inheritance
- **Inheritance** in Java allows one class to acquire the properties and behaviors of another, promoting code reusability and a hierarchical class structure.
- Java supports **4 types of inheritance**, while **C++ supports 5**.
  1. **Single-Level Inheritance** - A derived class inherits from a single parent class.
  2. **Multi-Level Inheritance** - A derived class inherits from another derived class.
  3. **Hierarchical Inheritance** - Multiple derived classes inherit from a single base class.
  4. **Hybrid Inheritance** - A mix of two or more types of inheritance.
  5. **Multiple Inheritance** (Not used in Java) - Java does not support multiple inheritance with classes to avoid ambiguity ("Diamond Problem") but allows it through interfaces.

### Example of Inheritance
```java
class Shape {
    String color;
}

class Triangle extends Shape {
}

public class Main {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        t1.color = "red";
        System.out.println("Triangle color: " + t1.color);
    }
}
```

## Access Modifiers
Access modifiers define the **visibility** of classes, methods, and variables.

| Modifier  | Scope                                      |
|-----------|-------------------------------------------|
| **public**  | Accessible everywhere                  |
| **private** | Accessible only within the same class  |
| **default** | Accessible within the same package    |
| **protected** | Accessible within package & subclasses |

### Example of Getters and Setters for Private Variables
```java
class Person {
    private String name;

    // Setter method
    public void setName(String name) {
        this.name = name;
    }

    // Getter method
    public String getName() {
        return name;
    }
}
```

## Encapsulation
- **Encapsulation** is the practice of bundling data and methods within a class while restricting direct access to data members.
- Achieved using **private variables** and **public getters/setters**.

## Abstraction
- **Abstraction** hides the implementation details while exposing only the necessary functionality.
- Achieved using **abstract classes** and **interfaces**.

### Example of an Abstract Class
```java
abstract class Animal {
    abstract void walk();
}

class Horse extends Animal {
    public void walk() {
        System.out.println("Walks on 4 legs");
    }
}

class Chicken extends Animal {
    public void walk() {
        System.out.println("Walks on 2 legs");
    }
}

public class Main {
    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.walk();

        Chicken chicken = new Chicken();
        chicken.walk();
    }
}
```

## Interfaces
- **Interfaces** define a contract of methods that implementing classes must provide.
- Unlike abstract classes, interfaces **cannot have instance variables** and support **multiple inheritance**.

### Example of an Interface
```java
interface Animal {
    void makeSound();
}

class Dog implements Animal {
    public void makeSound() {
        System.out.println("Barks");
    }
}

class Cat implements Animal {
    public void makeSound() {
        System.out.println("Meows");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeSound();

        Cat cat = new Cat();
        cat.makeSound();
    }
}
```

## Method Overriding
- **Method Overriding** allows a subclass to provide a specific implementation of a method defined in its parent class.
- Used for **runtime polymorphism**.

### Example of Method Overriding
```java
class Parent {
    void show() {
        System.out.println("Parent class");
    }
}

class Child extends Parent {
    @Override
    void show() {
        System.out.println("Child class");
    }
}

public class Main {
    public static void main(String[] args) {
        Parent obj = new Child(); // Upcasting
        obj.show();
    }
}
```