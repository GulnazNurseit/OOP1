import java.util.ArrayList;
import java.util.List;

public class Students extends Person {
    private static int studentCounter = 1;
    private int studentID;
    private List<Integer> grades;

    public Students(String name, String surname, int age, boolean gender) {
        super(name, surname, age, gender);
        this.studentID = studentCounter++;
        this.grades = new ArrayList<>();
    }

    public void addGrade(int grade) {
        grades.add(grade);
    }

    public double calculateGPA() {
        if (grades.isEmpty()) return 0.0;
        double totalPoints = 0.0;
        for (int grade : grades) {
            totalPoints += grade;
        }
        return Math.round((totalPoints / grades.size()) * 100.0) / 100.0;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" I am a student with ID %d.", studentID);
    }
}