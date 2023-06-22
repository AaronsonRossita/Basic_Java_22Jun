public class Student {

    private String name;
    private int age;
    private String school;
    private String major;
    private int grade;

    public Student() {
    }

    public Student(String name, int age, String school, String major, int grade) {
        this.name = name;
        this.age = age;
        this.school = school;
        this.major = major;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void printName(){
        System.out.println("This student's name is " + this.name);
    }

    public void printAge(){
        System.out.println("This student's age is " + this.age);
    }

    public void printSchool(){
        System.out.println(this.name + " is a student at " + this.school);
    }

    public void printMajor(){
        System.out.println(this.name + "'s major is " + this.major);
    }

    public void printGrade(){
        System.out.println(this.name + " grade is " + this.grade);
    }
}
