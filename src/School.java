public class School {
    public static void main(String[] args) {
        Teacher nauczyciel = new Teacher("Jan", "Kowal", 123232);
        nauczyciel.showInfo();
        Student student = new Student("Farhan", "Al-abdu", 3.4, true);
        student.showInfo();
    }
}
