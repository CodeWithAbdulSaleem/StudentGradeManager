# Student Grade Management System (Java + CSV)

This is a simple **console-based Java application** to manage student academic records. It supports adding student details, calculating total and average marks, assigning grades, and saving/loading data from a CSV-format text file.

---

## Features

- Add new student details (Name, ID, 5 subject marks)
- Automatically calculate:
  - Total Marks
  - Average
  - Grade (A+, A, B, C, F)
- Save student records to `data/student.txt`
- Load existing records on startup
- Uses Object-Oriented Programming (OOP)

---

## Project Structure

```
StudentGradeManager/
├── src/
│   ├── Main.java
│   ├── Student.java
│   └── GradeManager.java
├── data/
│   └── student.txt       # CSV-style student data
├── README.md
├── .gitignore
```

---

## Sample `student.txt` Format

```
John,101,85,90,88,92,91
Emma,102,78,82,80,79,85
Oliver,103,92,89,95,94,90
...
```

Each line = Name, ID, 5 subject marks

---

## Grading Logic

```
if (average >= 90) return "A+";
else if (average >= 75) return "A";
else if (average >= 60) return "B";
else if (average >= 50) return "C";
else return "F";
```

---

## How to Run

```bash
cd src
javac *.java
java Main
```

---

## Author

**Abdul Saleem A**  
B.Tech in Electrical and Electronics Engineering (AI/ML)  
📎 [LinkedIn](https://www.linkedin.com/in/abdulsaleem03)  
🐙 [GitHub](https://github.com/CodeWithAbdulSaleem)

---

## License

This project is licensed under the MIT License.