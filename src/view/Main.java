package view;

import model.MyDate;
import service.EmployeeService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        showMenu();
    }

        static EmployeeService employeeService = new EmployeeService();
        public static void showMenu () {
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

                        employeeService.getReport();

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
}
