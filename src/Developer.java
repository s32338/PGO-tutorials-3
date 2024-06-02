import java.util.ArrayList;

public class Developer extends Employee {
    private ArrayList<Technology> technologies = new ArrayList<>();

    public Developer(String firstName, String lastName, String address, String email, String pesel, int yearOfEmployment) {
        super(firstName, lastName, address, email, pesel, yearOfEmployment);
    }

    public void addTechnology(Technology technology) {
        technologies.add(technology);
    }

    private int getTechnologyBonus() {
        int techBonusSum = 0;
        for(Technology tech : technologies) {
            techBonusSum += tech.worth;
        }
        return techBonusSum;
    }

    public int calculateSalary() {
        return calculateBaseSalary() + getTechnologyBonus();
    }
}
