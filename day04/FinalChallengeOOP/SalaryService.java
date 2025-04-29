package day04.FinalChallengeOOP;

import day04.FinalChallengeOOP.hr.Employee;
import day04.FinalChallengeOOP.hr.EmployeeType;

import java.util.List;

public interface SalaryService {

    public void generateOvertime(List<Employee> emps);
    public void generateInsurance(List<Employee> emps);
    public void generateOperational(List<Employee> emps);
    public void generateTax(List<Employee> emps);


    public void generateSalary(List<Employee> emps);
    public void getTotalAllowances(List<Employee> emps);
    public void getTotalSalaryByType(List<Employee> emps, EmployeeType empType);
}
