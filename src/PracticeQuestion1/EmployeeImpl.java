package PracticeQuestion1;

import PracticeQuestion1.Employee;

import java.util.ArrayList;

public class EmployeeImpl {
    public static void main(String[] args) {
        Employee e1= new Employee("Elon",1235467,"9th Dec","Manager",65000.00);
        Employee e2= new Employee("Musk",7654567,"21st Feb","Manager",75000.00);
        Employee e3= new Employee("Tony",5643223,"19th October","Senior-Manager",105000.00);
        Employee e4= new Employee("RIta",4576246,"29th September","Manager",65000.00);

        ArrayList<Employee> empList= new ArrayList<>();
        empList.add(e1);
        empList.add(e2);
        empList.add(e3);
        empList.add(e4);

        empList.add(new Employee("Rohan",2342454,"30th june 2009","Manager",55000.0));

        System.out.println("empList = " + empList);
    }
}
