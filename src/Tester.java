import java.util.ArrayList;

public class Tester extends Employee{
    private ArrayList<String> tests = new ArrayList<>();

    public Tester(String firstName, String lastName, String address, String email, String pesel, int yearOfEmployment) {
        super(firstName, lastName, address, email, pesel, yearOfEmployment);
    }

    public void addTestType(String newType) {
        tests.add(newType);
    }

    public int calculateSalary() {
        return calculateBaseSalary() + tests.size()*300;
    }
}
