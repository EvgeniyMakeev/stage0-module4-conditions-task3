package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {
        if (salary < 0) {
            System.out.println("wrong input!");
        } else {
            double result = salary;
            if (salary > 20000) {
                result = salary * 0.8;
            } else if (salary > 10000 && salary <= 20000) {
                result = salary * 0.82;
            } else if (salary <= 10000) {
                result = salary * 0.85;
            }
            System.out.println(result);
        }
    }
}
