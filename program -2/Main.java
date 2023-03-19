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


