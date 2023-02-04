import java.util.Arrays;
import java.util.Objects;

public class Employee {
    private String surname;
    private String name;
    private String patronymic;
    private  String  department;
    private  String salary;
    private int employeeId;
    static int id = 0;
    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public String getDepartment() {
        return this.department;
    }

    public void setDepartment(String department) {
        Main.employee[employeeId * 5 + 3] = department;
        this.department = department;

    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        Main.employee[employeeId * 5 + 4] = salary;
        this.salary = salary;
    }
    public Employee(String surname, String name, String patronymic,
                    String  department,String salary) {

        if (Arrays.binarySearch(new String[]{"1","2","3","4","5"}, department) == 0) {
            throw new IllegalArgumentException("Такого отдела не существует. Номера отделов: 1, 2, 3, 4, 5.");
        }
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.department = department;
        this.salary = salary;
        employeeId = id;
        Main.employee[employeeId * 5] = surname;
        Main.employee[employeeId * 5 + 1] = name;
        Main.employee[employeeId * 5 + 2] = patronymic;
        Main.employee[employeeId * 5 + 3] = department;
        Main.employee[employeeId * 5 + 4] = salary;
        id++;
    }
    @Override
    public String toString() {
        return "Фамилия - " + surname +
                " ,имя - " + name +
                " ,отчество - " + patronymic +
                " ,отдел - " + department +
                " ,зарплата - " + salary;
    }
    public static int findSalaryCostsAmount(){
        int sum = 0;
        for (int i = 0;i < id;i++){
            sum += Integer.parseInt(Main.employee[5 * i + 4]);
        }
        return sum;
    }

    public static void findMinSalaryName(){
        int minSalary = Integer.parseInt(Main.employee[4]);
        int count = - 1;
        int minSalaryId = Integer.parseInt(Main.employee[4]);
        for (int i = 4; i < Main.employee.length; i+=5 ) {
            count++;
            if (Integer.parseInt(Main.employee[i]) <= minSalary) {
                minSalary = Integer.parseInt(Main.employee[i]);
                minSalaryId = count;
            }
        }
        System.out.println("Сотрудник с самой маленькой зарплатой: " + Main.employee[minSalaryId * 5] + " " + Main.employee[minSalaryId * 5 + 1]+ " " + Main.employee[minSalaryId * 5 + 2]);
    }

    public static void findMaxSalaryName(){
        int maxSalary = Integer.parseInt(Main.employee[4]);
        int count = - 1;
        int maxSalaryId = 0;
        for (int i = 4; i < Main.employee.length; i+=5 ) {
            count++;
            if (Integer.parseInt(Main.employee[i]) >= maxSalary) {
                maxSalary = Integer.parseInt(Main.employee[i]);
                maxSalaryId = count;
            }
        }
        System.out.println("Сотрудник с самой большой зарплатой: " + Main.employee[maxSalaryId * 5] + " " + Main.employee[maxSalaryId * 5 + 1]+ " " + Main.employee[maxSalaryId * 5 + 2]);
    }

    public static int findAverageSalary(){
        int sum = findSalaryCostsAmount();
        return (int)sum / id;
    }

    public static void writeAllEmployeesNames() {
        for (int i = 0;i < id; i++){
            System.out.println(Main.employee[i * 5]
                    + " " + Main.employee[i * 5 + 1]
                    + " " + Main.employee[i * 5 + 2] );
        }
    }
}
