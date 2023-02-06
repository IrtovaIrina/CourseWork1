public class Main {
    private static  Employee[] employees = new Employee[10];;

    public static void main(String[] args) {
        employees[1] = new Employee("Иванов Иван Иванович",1,15145);
        employees[2] = new Employee("Петров Иван Иванович",2,152145);
        employees[3] = new Employee("Сидоров Иван Иванович",1,1514595);
        printEmployees();
        printSalaryCostsAmount();
        printMinSalaryName();
        printMaxSalaryName();
        printAverageSalary();
        printAllEmployeesNames();
    }
    private static void printEmployees(){
        for (Employee employee : employees) {
            if (employee != null){
                System.out.println(employee.toString());
            }
        }
    }
    private static void printSalaryCostsAmount(){
        double sum = 0;
        for (Employee employee : employees){
            if (employee != null){
                sum += employee.getSalary();
            }
        }
        System.out.println("Сумма всех зарплат сотрудников - " + sum);
    }

    private static void printMinSalaryName(){
        double min = Double.MAX_VALUE;
        Employee employeeWithMinSalary = null;
        for (Employee employee : employees){
            if (employee != null && employee.getSalary() < min){
                min = employee.getSalary();
                employeeWithMinSalary = employee;
            }
        }
        System.out.println("Сотрудник с самой маленькой зарплатой: " + employeeWithMinSalary.toString());
    }

    private static void printMaxSalaryName(){
        double max = Double.MIN_VALUE;
        Employee employeeWithMaxSalary = null;
        for (Employee employee : employees){
            if (employee != null && employee.getSalary() > max){
                max = employee.getSalary();
                employeeWithMaxSalary = employee;
            }
        }
        System.out.println("Сотрудник с самой большой зарплатой: " + employeeWithMaxSalary.toString());
    }

    private static void printAverageSalary(){
        double sum = 0;
        int count = 0;
        for (Employee employee : employees){
            if (employee != null){
                sum += employee.getSalary();
                count++;
            }
        }
        System.out.println("Средняя зарплата всех сотрудников : " + (int)sum / count);
    }

    private static void printAllEmployeesNames() {
        for (Employee employee : employees){
            if (employee != null){
                System.out.println(employee.getFullName());
            }
        }
    }
}