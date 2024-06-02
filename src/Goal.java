import java.time.*;

public class Goal {
    private String name;
    private int assignmentDay;
    private int assignmentMonth;
    private int assignmentYear;
    private int bonusAmount;

    public int getBonusAmount() {
        return bonusAmount;
    }

    public Goal(int assignmentYear, int assignmentMonth, int assignmentDay, String name, int bonusAmount) {
        this.name = name;
        this.assignmentDay = assignmentDay;
        this.assignmentMonth = assignmentMonth;
        this.assignmentYear = assignmentYear;
        this.bonusAmount = bonusAmount;
    }

    public boolean isReachedThisMonth() {
        LocalDate ref = LocalDate.now();
        return assignmentMonth == ref.getMonthValue() && assignmentYear == ref.getYear();
    }
}
