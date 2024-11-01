import java.util.*;

public class Student {
    String name;
    String group;
    int course;
    List<Integer> subjectMarks;

    public String getName() {
        return this.name;
    }

    public String getGroup() {
        return this.group;
    }

    public int getCourse() {
        return this.course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    Student(String name, String group) {
        this.name = name;
        this.group = group;
        this.subjectMarks = new ArrayList<>(6);
        this.course = (int)(Math.random() * 3) + 1;

        for (int i = 0; i < 6; i++)
            this.subjectMarks.add((int)(Math.random() * 5) + 1);
    }

    double averageMark() {
        double avg;
        int sum = 0;

        for (Integer subjectMark : this.subjectMarks)
            sum += subjectMark;
        avg = (double)sum / subjectMarks.size();

        return avg;
    }
}
