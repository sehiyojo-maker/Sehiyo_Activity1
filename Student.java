
public class Student {

    private String name;
    private String studentId;
    private double grade;

    // Constructor
    public Student(String name, String studentId, double grade) {
        this.name = name;
        this.studentId = studentId;
        this.grade = grade;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getStudentId() {
        return studentId;
    }

    public double getGrade() {
        return grade;
    }

    // Setter
    public void setGrade(double grade) {
        this.grade = grade;
    }

    // Display information
    public void displayInfo() {
        System.out.println("Name: " + name +
                " | ID: " + studentId +
                " | Grade: " + grade);
    }

    public static void main(String[] args) {

        Student student1 = new Student("Angel Villa", "341-35", 90.0);
        Student student2 = new Student("Jo Seo", "341-36", 88.5);

        student1.setGrade(92.0);

        student1.displayInfo();
        student2.displayInfo();
    }
}
