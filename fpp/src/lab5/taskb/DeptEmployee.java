package lab5.taskb;

import java.time.LocalDate;
import java.util.Comparator;

public class DeptEmployee {
    private String name;
    private final double salary;
    private LocalDate hireDate;

    public DeptEmployee(String name, double salary, LocalDate hireDate) {
        this.name = name;
        this.salary = salary;
        this.hireDate = hireDate;
    }

    private static class NameComparator implements Comparator<DeptEmployee> {
        @Override
        public int compare(DeptEmployee employee1, DeptEmployee employee2) {
            return employee1.getName().compareTo(employee2.getName());
        }
    }

    static NameComparator getComparator() {
        return new NameComparator();
    }

    //default implementation
    public double getSalary() {
        return salary;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    @Override
    public String toString() {
        return "name=" + name + ", salary=" + salary + ", hireDate=" + hireDate;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
