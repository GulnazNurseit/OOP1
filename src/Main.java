import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        School school = new School();

        // Чтение студентов
        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\talip\\IdeaProjects\\oop1\\Students.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(" ");
                String firstName = parts[0];
                String lastName = parts[1];
                int age = Integer.parseInt(parts[2]);
                boolean gender = parts[3].equals("Male");

                Students student = new Students(firstName, lastName, age, gender);
                for (int i = 4; i < parts.length; i++) {
                    student.addGrade(Integer.parseInt(parts[i]));
                }

                school.addMember(student);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Чтение учителей
        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\talip\\IdeaProjects\\oop1\\Teachers.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(" ");
                String firstName = parts[0];
                String lastName = parts[1];
                int age = Integer.parseInt(parts[2]);
                boolean gender = parts[3].equals("Male");
                String subject = parts[4];
                int experience = Integer.parseInt(parts[5]);
                int salary = Integer.parseInt(parts[6]);

                Teachers teacher = new Teachers(firstName, lastName, age, gender, subject, experience, salary);
                school.addMember(teacher);

                // Повышение зарплаты для учителей с опытом более 10 лет
                if (experience > 10) {
                    teacher.giveRaise(10);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Вывод всех членов школы
        System.out.println("Members of the School:");
        System.out.println(school);
    }
}
