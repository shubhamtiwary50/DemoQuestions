package PracticeQuestion1;

import java.util.Objects;

public class Employee {
    private String name;
    private int empID;
    private String dateOfJoining;
    private String designation;
    private double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public String getDateOfJoining() {
        return dateOfJoining;
    }

    public void setDateOfJoining(String dateOfJoining) {
        this.dateOfJoining = dateOfJoining;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return getEmpID() == employee.getEmpID() && Objects.equals(getName(), employee.getName()) && Objects.equals(getDateOfJoining(), employee.getDateOfJoining()) && Objects.equals(getDesignation(), employee.getDesignation()) && Objects.equals(getSalary(), employee.getSalary());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getEmpID(), getDateOfJoining(), getDesignation(), getSalary());
    }

    @Override
    public String toString() {
        return "PracticeQuestion1.Employee{" +
                "name='" + name + '\'' +
                ", empID=" + empID +
                ", dateOfJoining='" + dateOfJoining + '\'' +
                ", designation='" + designation + '\'' +
                ", salary='" + salary + '\'' +
                '}';
    }

    public Employee(String name, int empID, String dateOfJoining, String designation, double salary) {
        this.name = name;
        this.empID = empID;
        this.dateOfJoining = dateOfJoining;
        this.designation = designation;
        this.salary = salary;
    }
}
