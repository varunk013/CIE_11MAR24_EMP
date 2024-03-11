class Employee    {
    public int salary;
    public String name;
    public int emp_id;
    private int newsalary;

    public Employee(String name, int salary, int emp_id) {
        this.name = name;
        this.salary = salary;
        this.emp_id = emp_id;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Emp_ID: " + emp_id);
    }
    public void addBonus(int newsalary) {
        this.newsalary = newsalary;
    }
  public int calculateTotalSalary() {
        return salary + newsalary;
    }
}
public class Main {
    public static void main(String[] args) {

        Employee e1 = new Employee("Varun", 60000, 001);
        e1.display();
        System.out.println("\nSalary Details\n");
        Bonus b1 = new Bonus(3000);
        b1.bonus();
        e1.addBonus(3000);
        System.out.println("Total Salary: " + e1.calculateTotalSalary());
    }
}
