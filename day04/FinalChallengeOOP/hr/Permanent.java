package day04.FinalChallengeOOP.hr;

import day04.FinalChallengeOOP.Tax.Tax;
import day04.FinalChallengeOOP.Tax.TaxSalary;
import day04.FinalChallengeOOP.Allowances.Insurance;
import day04.FinalChallengeOOP.Allowances.Operational;
import day04.FinalChallengeOOP.Allowances.Overtime;

import java.time.LocalDate;

public class Permanent extends Employee implements TaxSalary {
    private Insurance insurance;
    private Overtime overtime;
    private Operational operational;
    private Tax tax;

    public Permanent(int empNo, String fullName, LocalDate hireDate, double salary, Insurance insurance, Overtime overtime, Operational operational, Tax tax) {
        super(empNo, fullName, hireDate, EmployeeType.PERMANENT, salary);
        this.insurance = insurance;
        this.overtime = overtime;
        this.operational = operational;
        this.tax = tax;
    }

    public Insurance getInsurance() {
        return insurance;
    }

    public void setInsurance(Insurance insurance) {
        this.insurance = insurance;
    }

    public Overtime getOvertime() {
        return overtime;
    }

    public void setOvertime(Overtime overtime) {
        this.overtime = overtime;
    }

    public Operational getOperational() {
        return operational;
    }

    public void setOperational(Operational operational) {
        this.operational = operational;
    }

    @Override
    public void calcTotalOvertime() {
        setTotalOvertime(overtime.getHours() * overtime.getOvertime());
    }

    @Override
    public void calcTotalOperational() {
        setTotalOperational((operational.getLunch() + operational.getTransport()) * operational.getDays());
    }

    @Override
    public void calcTotalInsurance() {
        setTotalInsurance((getSalary() * insurance.getMedical()) * (insurance.getSelf() + insurance.getDependent()));
    }

    @Override
    public void calcTotalTax() {
        setTotalTax((getSalary() * tax.getPph()) + (getSalary() * tax.getTapera()));
    }

    @Override
    public void calcTotalSalary() {
        setTotalSalary((getSalary() + getTotalOvertime() + getTotalOperational()) - (getTotalInsurance() + getTotalTax()));
    }

    @Override
    public void calcPph() {

    }

    @Override
    public void calcTapera() {

    }

    @Override
    public String toString() {
        return super.toString() +
                 insurance +
                " totalIns= " + getTotalInsurance() +
                overtime +
                " totalOvr= " + getTotalOvertime() +
                operational +
                " totalOpr= " + getTotalOperational() +
                tax +
                " totalTax= " + getTotalTax() +
                '}';
    }
}
