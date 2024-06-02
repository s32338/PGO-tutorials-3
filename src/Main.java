import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Employee> employees = new ArrayList<>();

// Creating and adding developers
        Developer dev = new Developer("John", "Doe", "NewYork", "john@doe.com", "123456789", 2020);
        Technology t=new Technology("Java", 800);
        dev.addTechnology(t);
        employees.add(dev);

// Creating and adding testers
        Tester tester = new Tester("Jane", "Smith", "LosAngeles", "jane@smith.com", "987654321", 2021);
        tester.addTestType("UI/UX");
        tester.addTestType("Automation");
        employees.add(tester);
// Creating and adding a manager
        Manager manager = new Manager("Bob", "Johnson",
                "Chicago", "bob@johnson.com", "1122334455", 2019);
        Goal g=new Goal(2024, 6, 15, "Implementing FB login",
                1000);

        manager.addGoals(g);
        manager.addGoals(new Goal(2024, 5, 15, "Implementing Google login",
                1500));
        employees.add(manager);

// Calculating total amount to be paid
        int totalAmount = 0;
        for (Employee employee : employees) {
            totalAmount += employee.calculateSalary();
        }
        System.out.println("Total amount to be paid this month:" + totalAmount + " USD");

    }
}