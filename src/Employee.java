import java.time.Year;

public class Employee {
    private final int baseSalary = 3000;
    private final int annualBonus = 1000;
    private String firstName;
    private String lastName;
    private String address;
    private String email;
    private String pesel;
    private int yearOfEmployment;

    public Employee(String firstName, String lastName, String address, String email, String pesel, int yearOfEmployment) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.email = email;
        this.pesel = pesel;
        this.yearOfEmployment = yearOfEmployment;
    }

    public int calculateSalary() {
        return calculateBaseSalary();
    }

    protected int calculateBaseSalary() {
        return baseSalary + (Year.now().getValue() - yearOfEmployment) * annualBonus;
    }
}
