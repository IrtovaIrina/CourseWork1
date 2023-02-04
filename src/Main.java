public class Main {
    public static String[] employee = new String[10];
    ;

    public static void main(String[] args) {
        int id = Employee.id;
        Employee one = new Employee("Иванов", "Иван", "Иванович", "2", "6759");
        Employee one1 = new Employee("Петров", "Иван", "Иванович", "2", "675285");
        Employee.findMinSalaryName();
        Employee.findMaxSalaryName();
        Employee.writeAllEmployeesNames();
    }
}