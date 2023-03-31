# JAVA---ASSESSMENT---2

# JAVA---ASSESSMENT---2
## REGISTER NUMBER :- 212221240029
## NAME :- MONISHA T
### 1) 1.Using inheritance, one class can acquire the properties of others. Consider the following Animal class:
class Animal{
    void walk(){
        System.out.println("I am walking");
    }
}
This class has only one method, walk. Next, we want to create a Bird class that also has a fly method. We do this using extends keyword:
class Bird extends Animal {
    void fly() {
        System.out.println("I am flying");
    }
}
Finally, we can create a Bird object that can both fly and walk.
public class Solution{
   public static void main(String[] args){
      Bird bird = new Bird();
      bird.walk();
      bird.fly();
   }
}
The above code will print:
I am walking
I am flying

### PROGRAM

```java
( Animal.java )
public class Animal {
        void walk()
        {
            System.out.println("I am walking");

        }
}

( Bird.java )
public class Bird extends Animal{
        void fly() {
            System.out.print("I am flying");
        }
        void sing()
        {
            System.out.println(" I am singing");
        }

}

Solution.java

public class Solution {
    public static void main(String[] args)
    {
        Bird bird = new Bird();
        bird.walk();
        bird.fly();
        bird.sing();

    }

}

```

### OUTPUT :-

<img width="284" alt="image" src="https://user-images.githubusercontent.com/93427240/229176578-28a8f2f7-12af-48cb-948c-36743d63a83e.png">


### 2) Create a class named 'Member' having the following members:

Data members
1 - Name
2 - Age
3 - Phone number
4 - Address
5 - Salary
It also has a method named 'printSalary' which prints the salary of the members.
Two classes 'Employee' and 'Manager' inherits the 'Member' class. The 'Employee' and 'Manager' classes have data members 'specialization' and 'department' respectively. Now, assign name, age, phone number, address and salary to an employee and a manager by making an object of both of these classes and print the same.

### PROGRAM

```java
( Employee.java )
package p2;
public class employee extends Member{
    String Specification;
    public void printSpecification()
    {
        System.out.println("Specific: " +Specification);
    }
}

( Manager.java )
package p2;
public class Manger extends Member{
    String department;
    public void printdepartment()
    {
        System.out.println("dept" +department);
    }
}

( Member.java )
package p2;
public class Member {
    String name;
    public void printname()
    {
        System.out.println("name: " +name);
    }
    int age;
    public void printage()
    {
        System.out.println("Age: " +age);
    }
    String phno;
    public void printphno()
    {
        System.out.println("PhoneNumber: " +phno);
    }
    String Add;
    public void printAdd()
    {
        System.out.println("Add: " +Add);
    }
    double salary;
    public void printsalary()
    {
        System.out.println("Salary: " + "" +salary);
    }
}

( Solution.java )
package p2;
import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        employee emp = new employee();
        emp.name="jack";
        emp.age= 25;
        emp.phno = "12345-67891";
        emp.Add = "1772 - mumbai - india";
        emp.salary = 80000;
        emp.Specification = "Software Developer";

        Manger mrg = new Manger();

        mrg.name = "Sunny";
        mrg.age = 25;
        mrg.phno = "19876-54321";
        mrg.Add = "843 - Delhi - india";
        mrg.salary = 1000000;
        mrg.department = "Engineer";

        System.out.println("Employee Details:-");
        emp.printname();
        emp.printage();
        emp.printphno();
        emp.printAdd();
        emp.printsalary();
        System.out.println("Specification: " + emp.Specification+"\n");

        System.out.println("Manager Details:-");
        mrg.printname();
        mrg.printage();
        mrg.printphno();
        mrg.printAdd();
        mrg.printsalary();
        mrg.printdepartment();
    }

}

```

### OUTPUT :-
<img width="287" alt="image" src="https://user-images.githubusercontent.com/93427240/229174828-ce0863e3-c324-4052-95b4-a8830de18f85.png">


### 3) 3.Write a program that would print the information (name, year of joining, salary, address) of three employees by creating a class named 'Employee'. The output should be as follows:

Name        Year of joining        Address

Robert            1994            64C- WallsStreat
Sam               2000            68D- WallsStreat
John              1999            26B- WallsStreat

### PROGRAM :-

```java
( Employee.java )
package p3;
public class Employee {
    String name;
    int yearOfJoining;
    int salary;
    String address;

    public Employee(String name, int yearOfJoining, int salary, String address) {
        this.name = name;
        this.yearOfJoining = yearOfJoining;
        this.salary = salary;
        this.address = address;
    }

}

( EmployeeInfo.java )
package p3;
public class Employeeinfo {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Robert", 1994, 25000, "64C- WallsStreat");
        Employee employee2 = new Employee("Sam", 2000, 30000, "68D- WallsStreat");
        Employee employee3 = new Employee("John", 1999, 28000, "26B- WallsStreat");

        System.out.println("Name\tYear of joining\t\tAddress");
        System.out.println(employee1.name + "\t" + employee1.yearOfJoining + "\t\t" + employee1.address);
        System.out.println(employee2.name + "\t\t" + employee2.yearOfJoining + "\t\t" + employee2.address);
        System.out.println(employee3.name + "\t" + employee3.yearOfJoining + "\t\t" + employee3.address);
    }
}
```

## OUTPUT :-

<img width="287" alt="image" src="https://user-images.githubusercontent.com/93427240/229173850-68dafc75-7324-47e0-ad1e-e19759383fd5.png">

### 4) Define a method to calculate power of a number raised to other i.e. ab using recursion where the numbers 'a' and 'b' are to be entered by the user

### PROGRAM :-

```java
package P4;
import java.util.Scanner;

public class power {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the base number: ");
        int base = scanner.nextInt();
        System.out.print("Enter the exponent: ");
        int exponent = scanner.nextInt();
        int result = power(base, exponent);
        System.out.println(base + " raised to the power of " + exponent + " is " + result);
    }

    public static int power(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        } else {
            return base * power(base, exponent - 1);
        }
    }
}

```

### OUTPUT :-

<img width="287" alt="image" src="https://user-images.githubusercontent.com/93427240/229176311-5999d3dc-e2d5-48ca-aaba-3069f9811d32.png">









