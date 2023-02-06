import java.util.Arrays;
import java.util.Objects;

public class Employee {
    private String fullName;
    private int department;
    private int salary;
    private final int id;
    private static int idGenerator = 1;

    public String getFullName() {
        return fullName;
    }

    public int getDepartment() {
        return department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Employee(String fullName, int department, int salary) {
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
        this.id = idGenerator++;
    }

    @Override
    public String toString() {
        return "Номер сотрудника: " + this.id +
                " ФИО: " + this.fullName + " ,отдел - " + this.department +
                " ,зарплата - " + this.salary;
    }
}
