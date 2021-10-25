package model;

public class Employee {
    private String name;
    private int personalCode;
    private double salary;
    private MyDate date;

    public Employee(String name, int personalCode, double salary, MyDate date) {
        this.name = name;
        this.personalCode = personalCode;
        this.salary = salary;
        this.date = date;
    }

    public Employee() {

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

    public MyDate getDate() {
        return date;
    }

    public void setDate(MyDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", personalCode=" + personalCode +
                ", salary=" + salary +
                ", date=" + date +
                '}';
    }
}
