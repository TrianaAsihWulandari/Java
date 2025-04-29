package day04.FinalChallengeOOP;

import day04.FinalChallengeOOP.hr.Employee;
import day04.FinalChallengeOOP.hr.EmployeeType;

import java.util.List;

public interface HRService {
    List<Employee>  initEmployeeData();

    public void displayEmployee(List<Employee> emps);

    public void getTotalEmployee(List<Employee> emps);
    public void getTotalEmployeeByType(List<Employee> emps, EmployeeType empType);
}
