package day04.FinalChallengeOOP.Tax;

import day04.FinalChallengeOOP.Allowances.AllowanceService;

public interface TaxSalary extends  AllowanceService{
    public void calcPph();
    public void calcTapera();
}
