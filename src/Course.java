public class Course {
    private int counter = 0;
    private String courseName;
    private int size;
    private Student[] registeredStudents;

    public Course(String courseName, int size) {
        this.courseName = courseName;
        this.size = size;
        registeredStudents = new Student[size];
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getSize() {
        return size;
    }

    public Student[] getRegisteredStudents() {
        return registeredStudents;
    }

    public void registerStudent(Student s){
        if(counter == registeredStudents.length){
            System.out.println("Sorry can't register students anymore");
        }else{
            registeredStudents[counter] = s;
            counter++;
            System.out.println("Welcome, " + s.getName());
        }
    }

    public void printAllStudentNames(){
        for(Student s : this.registeredStudents){
            System.out.println(s.getName());
        }
    }

}
