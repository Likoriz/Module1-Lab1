import java.util.*;

public class Main {
    static void printStudents(List<Student> students, int course) {
        for (Student student : students)
            if (student.getCourse() == course) {
                System.out.print("Курс " + student.getCourse() + " " + student.getName() + " " + student.getGroup() + " " + student.averageMark());
                System.out.println();
            }
    }

    static void session(List<Student> students) {
        for (int i = students.size() - 1; i >= 0; i--) {
            if (students.get(i).averageMark() < 3)
                students.remove(i);
            else
                students.get(i).setCourse(students.get(i).getCourse() + 1);
        }
    }

    public static void main(String[] args) {
        int AMOUNT = 10;
        List<Student> students = new ArrayList<>(AMOUNT);

        students.add(new Student("Алексей", "ИВТ1"));
        students.add(new Student("Иван", "ИВТ1"));
        students.add(new Student("Федор", "ИВТ1"));
        students.add(new Student("Дарья", "ИВТ2"));
        students.add(new Student("Анастасия", "ИВТ1"));
        students.add(new Student("Андрей", "ИВТ2"));
        students.add(new Student("София", "ИВТ2"));
        students.add(new Student("Петр", "ИВТ1"));
        students.add(new Student("Николай", "ИВТ2"));
        students.add(new Student("Даниил", "ИВТ2"));

        System.out.println("Студенты в начале года");
        for(int i = 1; i < 4; i++)
            printStudents(students, i);
        System.out.println();

        session(students);

        System.out.println("Студенты в конце года");
        for(int i = 1; i < 5; i++)
            printStudents(students, i);
    }
}
