package model;

public class Employee {
    private int id;
    private String name;
    private int personalCode;
    private double salary;
    private int year;

    public Employee(int id, String name, int personalCode, double salary, int year) {
        this.id = id;
        this.name = name;
        this.personalCode = personalCode;
        this.salary = salary;
        this.year = year;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPersonalCode() {
        return personalCode;
    }

    public void setPersonalCode(int personalCode) {
        this.personalCode = personalCode;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", personalCode=" + personalCode +
                ", salary=" + salary +
                ", year=" + year +
                '}';
    }
}
