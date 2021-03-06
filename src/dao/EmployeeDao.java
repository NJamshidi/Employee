package dao;

import model.Employee;
import model.MyDate;

import java.sql.*;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeDao extends BaseDao {
    private static class SqlStatement {
        static final String INSERT_EMPLOYEE = "INSERT INTO employees (name ,personalCode ,salary ,inComeYear)  VALUES (?,?,?,?) ";
        static final String REPORT_FROM_EMPLOYEE = "SELECT * FROM employees where inComeYear in (99,98,97,96,95) and ((salary between 1000000 and 5000000) or (salary between 5000000 and 10000000) or (salary >= 10000000) ) ORDER BY inComeYear DESC, salary ASC";

    }

    public void insertEmployee(String name, int personalCode, double salary, int year) throws SQLException{
            Connection connection = getConnection();
            if (connection != null) {
                PreparedStatement statement = connection.prepareStatement(SqlStatement.INSERT_EMPLOYEE);
                statement.setString(1, name);
                statement.setInt(2, personalCode);
                statement.setDouble(3, salary);
                statement.setInt(4, year);

                statement.executeUpdate();
            }
        }

    public List<Employee> getReportFromEmployees() throws SQLException {
        Connection connection = getConnection();
        if (connection != null) {
            List<Employee> shoes = new ArrayList<>();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(SqlStatement.REPORT_FROM_EMPLOYEE);
            while (resultSet.next()) {
                Employee employee = new Employee(resultSet.getInt(1), resultSet.getString(2), resultSet.getInt(3), resultSet.getDouble(4), resultSet.getInt(5));
                shoes.add(employee);
            }
            return shoes;
        } else {
            return Collections.emptyList();
        }
    }

    }

