package service;

import dao.EmployeeDao;
import model.Employee;
import model.MyDate;

import java.sql.SQLException;
import java.util.List;

public class EmployeeService {
    EmployeeDao employeeDao = new EmployeeDao();

    public void addEmployee(String name, int personalCode, double salary, int year) {
        try {
            employeeDao.insertEmployee(name, personalCode, salary, year);
        } catch (SQLException e) {
            System.out.println("can not insert employee to database:" + e.getMessage());
        }
    }

    public List<Employee> getReport() {

        try {
            return employeeDao.getReportFromEmployees();
        } catch (SQLException e) {
            System.out.println("can not show shoe products :" + e.getMessage());
        }
        return null;

    }
}
