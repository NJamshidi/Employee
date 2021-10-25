package view;

import model.Employee;
import model.MyDate;
import service.EmployeeService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        showMenu();
    }

    static EmployeeService employeeService = new EmployeeService();

    public static void showMenu() {
        while (true) {
            System.out.println("*** Welcome  ***");
            System.out.println("1.Add employee");
            System.out.println("2.show import from employees");
            System.out.println("3.update");
            System.out.println("4.exit");
            System.out.println("select>>");
            Scanner scanner = new Scanner(System.in);
            int input = scanner.nextInt();
            switch (input) {
                case 1:
                    System.out.println("insert your Name: ");
                    String name = scanner.next();
                    System.out.println("insert your personalCode: ");
                    int personalCode = scanner.nextInt();
                    System.out.println("insert your salary: ");
                    double salary = scanner.nextDouble();
                    System.out.println("insert your inCome Year: ");
                    int year = scanner.nextInt();


                    employeeService.addEmployee(name, personalCode, salary, year);
                    break;
                case 2:
                    System.out.println("NO | ENTRANCE YEAR | SALARY CATEGORY | PERSONAL CODE | NAME");
                    System.out.println("---+---------------+-----------------+---------------+----------------");
                    int no = 1;
                    boolean check=true;
                    boolean checkSalary=true;
                    List<Employee> employee = employeeService.getReport();
                    try {
                        for (int i = 0; i < employee.size(); i++) {
                            if (check == true && employee.get(i + 1) != null && employee.get(i + 1).getYear() == employee.get(i).getYear()){
                                System.out.print(no);
                                System.out.print("  | ");
                                System.out.print(employee.get(i).getYear());
                            check =false;
                            }
                            else if(check == false && employee.get(i + 1) != null && employee.get(i + 1).getYear() == employee.get(i).getYear() ){
                                System.out.print(" ");
                                System.out.print("  | ");
                                System.out.print("  ");
                           }
                            else if( employee.get(i + 1).getYear() != employee.get(i).getYear() ){
                                check=true;
                                System.out.print(" ");
                                System.out.print("  | ");
                                System.out.print("  ");

                            }

                            System.out.print("            | ");
                            if (checkSalary && employee.get(i + 1) != null && salaryCompare(employee.get(i + 1).getSalary()).equals(salaryCompare(employee.get(i).getSalary())))
                            {
                                System.out.print(salaryCompare(employee.get(i).getSalary()));
                                checkSalary =false;

                            }
                            else if(!checkSalary && employee.get(i + 1) != null && salaryCompare(employee.get(i + 1).getSalary()).equals(salaryCompare(employee.get(i).getSalary()))){
                          System.out.print("    ");

                            }
                            else if( !salaryCompare(employee.get(i + 1).getSalary()).equals(salaryCompare(employee.get(i).getSalary())) ){
                                checkSalary=true;
                                System.out.print("    ");


                            }
                            System.out.print("            | ");
                            System.out.print(employee.get(i).getPersonalCode());
                            System.out.print("      | ");
                            System.out.print(employee.get(i).getName());

                            System.out.println();
                            if (employee.get(i + 1) != null && employee.get(i + 1).getYear() != employee.get(i).getYear()) {
                                System.out.print("---+---------------");
                                no++;
                            } else {
                                System.out.print("                   ");
                            }
                            if (employee.get(i + 1) != null &&  !salaryCompare(employee.get(i + 1).getSalary()).equals(salaryCompare(employee.get(i).getSalary())) &&
                            checkSalary) {
                                System.out.print("+-----------------");

                            } else {
                                System.out.print("                  ");
                            }
                            System.out.print("+---------------+----------------");
                            System.out.println();

                        }

                    } catch (Exception e) {
                        e.getMessage();
                    }


                    break;
                case 3:


                    break;
                case 4:
                    return;
                default:
                    System.out.println("Invalid selection. Try again please!");
            }


        }
    }

    public static String salaryCompare(double salary) {
        if (1000000 <= salary && salary < 5000000) {
            return "1-5 ";
        } else if (5000000 <= salary && salary <= 10000000) {
            return "5-10";
        } else {
            return "10+ ";
        }

    }


}
