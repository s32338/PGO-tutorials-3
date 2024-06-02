import java.util.ArrayList;

public class Manager extends Employee{
    private ArrayList<Goal> goals = new ArrayList<>();
    public Manager(String firstName, String lastName, String address, String email, String pesel, int yearOfEmployment) {
        super(firstName, lastName, address, email, pesel, yearOfEmployment);
    }

    private int calculateGoalBonuses() {
        int goalBonusesSum = 0;
        for(Goal g : goals) {
            if(g.isReachedThisMonth()){
                goalBonusesSum += g.getBonusAmount();
            }
        }
        return goalBonusesSum;
    }

    public int calculateSalary() {
        return calculateBaseSalary() + calculateGoalBonuses();
    }

    public void addGoals(Goal g) {
        goals.add(g);
    }
}
