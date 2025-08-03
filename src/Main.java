import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GradeManager gm = new GradeManager();
        Scanner sc = new Scanner(System.in);
        String FILE = "D:/New folder (2)/StudentGradeManager/data/student.txt";

        try { 
            gm.loadFromFile(FILE);
             } 
             catch (Exception e) {
                System.out.println(e);
             }

        while (true) {
            System.out.println("\n--- Student Grade Management ---");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Save and Exit");
            System.out.print("Enter your choice: ");
            int ch = sc.nextInt();

            if (ch == 1) {
                sc.nextLine(); 
                System.out.print("Enter name: ");
                String name = sc.nextLine();
                System.out.print("Enter ID: ");
                String id = sc.nextLine();
                int[] marks = new int[5];
                for (int i = 0; i < 5; i++) {
                    System.out.print("Enter mark for subject " + (i+1) + ": ");
                    marks[i] = sc.nextInt();
                }
                gm.addStudent(new Student(name, id, marks));
            } else if (ch == 2) {
                gm.showAllStudents();
            } else if (ch == 3) {
                try {
                    gm.saveToFile(FILE);
                    System.out.println("Data saved. Exiting...");
                } catch (Exception e) {
                    System.out.println("Error saving file.");
                }
                break;
            } else {
                System.out.println("Invalid choice.");
            }
        }

        sc.close();
    }
}