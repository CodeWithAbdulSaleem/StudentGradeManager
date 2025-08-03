public class Student {
    String name;
    String id;
    int[] marks = new int[5];

    public Student(String name, String id, int[] marks) {
        this.name = name;
        this.id = id;
        this.marks = marks;
    }

    public int getTotal() {
        int total = 0;
        for (int mark : marks) {
            total += mark;
        }
        return total;
    }

    public double getAverage() {
        return getTotal() / 5.0;
    }

    public String getGrade() {
        double avg = getAverage();
        if (avg >= 90) return "A+";
        else if (avg >= 75) return "A";
        else if (avg >= 60) return "B";
        else if (avg >= 50) return "C";
        else return "F";
    }

    public String toString() {
        return id + " - " + name + " | Total: " + getTotal() + " | Avg: " + getAverage() + " | Grade: " + getGrade();
    }

    public String toDataString() {
        return name + "," + id + "," + marks[0] + "," + marks[1] + "," + marks[2] + "," + marks[3] + "," + marks[4];
    }

    public static Student fromDataString(String data) {
        String[] parts = data.split(",");
        int[] marks = {
             Integer.parseInt(parts[2]), Integer.parseInt(parts[3]), Integer.parseInt(parts[4]), Integer.parseInt(parts[5]), Integer.parseInt(parts[6])};
        return new Student(parts[0], parts[1], marks);
    }
}
