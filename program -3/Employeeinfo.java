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
