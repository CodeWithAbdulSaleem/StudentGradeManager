import java.util.*;
import java.io.*;

public class GradeManager {
    private List<Student> students = new ArrayList<>();

    public void addStudent(Student s) {
        students.add(s);
    }

    public void showAllStudents() {
        if (students.isEmpty()) {
            System.out.println("No students added yet.");
        } else {
            for (Student s : students) {
                System.out.println(s);
            }
        }
    }

    public void saveToFile(String filename) throws IOException {
        FileWriter fw = new FileWriter(filename);
        for (Student s : students) {
            fw.write(s.toDataString() + "\n");
        }
        fw.close();
    }

    public void loadFromFile(String filename) throws IOException {
        students.clear();
        File file = new File(filename);
        if (!file.exists()) return;

        Scanner sc = new Scanner(file);
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            Student s = Student.fromDataString(line);
            students.add(s);
        }
        sc.close();
    }
}