public class Person {
    private String name;
    private String surname;
    private int age;
    private boolean gender; // true for Male, false for Female

    public Person(String name, String surname, int age, boolean gender) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public String toString() {
        String genderString = gender ? "Male" : "Female";
        return String.format("Hi, I am %s %s, a %d-year-old %s.", name, surname, age, genderString);
    }
}