public class Teachers extends Person {
    private String subject;
    private int yearsOfExperience;
    private int salary;

    public Teachers(String name, String surname, int age, boolean gender, String subject, int yearsOfExperience, int salary) {
        super(name, surname, age, gender);
        this.subject = subject;
        this.yearsOfExperience = yearsOfExperience;
        this.salary = salary;
    }

    public void giveRaise(int percentage) {
        salary += salary * percentage / 100;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" I teach %s.", subject);
    }
}