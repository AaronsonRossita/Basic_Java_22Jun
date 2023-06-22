import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception{

//        tryCatch();

//        try {
//            checkAge();
//        }catch (Exception e){
//            System.out.println(e.getMessage());
//            System.out.println("fail");
//        }


//        System.out.println("Pls write your age");
//        int age = scanner.nextInt();
//        if(age < 18){
//            throw new Exception("too young");
//        }else{
//            System.out.println("Welcome");
//        }
//
//        System.out.println(checkSalary("Fullstack"));
//        System.out.println(checkSalary("Frontend"));
//        System.out.println(checkSalary("Backend"));
//        System.out.println(checkSalary("qa"));
//        System.out.println("after try");

        Person person1 = new Person();
//        System.out.println(person1.firstname);
//        System.out.println(person1.id);

        Person person2 = new Person(1,"Alice");
//        System.out.println(person2.firstname);

        Person person3 = new Person(2);
        Person person4 = new Person("Marry");

        Person person5 = new Person("John",3);

        Person person6 = new Person(4,"Lara","Croft",330);
//        System.out.println(person6.getAge());
        //person6.age = 330;
//        person6.setAge(330);
//        System.out.println(person6.getAge());
//        person6.setAge(33);
//        System.out.println(person6.getAge());

//        person2.printName();
//        person4.printName();
//        person5.printName();
//        person6.printName();
//
//        Person.printClassInfo();

        Student student1 = new Student("Tom",30,"Ecom","Fullstack",100);
//        student1.printName();
//        student1.printAge();
//        student1.printSchool();
//        student1.printMajor();
//        student1.printGrade();

        Student student2 = new Student("Lara",37,"Ecom","Cyber",100);
        Student student3 = new Student("Dan",29,"Ecom","QA",90);
        Student student4 = new Student("Harry",25,"Ecom","Mobile App",80);
        Student student5 = new Student("Barry",33,"Ecom","Fullstack",70);

        Course course1 = new Course("First",4);
        course1.registerStudent(student1);
        course1.registerStudent(student2);
        course1.registerStudent(student3);
        course1.registerStudent(student4);
        course1.registerStudent(student5);

        course1.printAllStudentNames();

    }

    public static void tryCatch(){
        try{
            System.out.println("Please provide the first number");
            int x = scanner.nextInt();
            System.out.println("Please provide the second number");
            int y = scanner.nextInt();
            System.out.println("The result is " + (x/y));
        }catch (InputMismatchException e){
            System.out.println("pls provide the right input");
        }catch (ArithmeticException e){
            System.out.println("can't divide by zero");
        }catch (Exception e){
            System.out.println(e);
        }finally {
            System.out.println("Finally");
        }
    }

    public static void checkAge() throws Exception {
        System.out.println("Pls write your age");
        int age = scanner.nextInt();
        if(age < 18){
            throw new Exception("too young");
        }else{
            System.out.println("Welcome");
        }
    }

    public static int checkSalary(String job){
        switch (job){
            case "Fullstack":
                return 22000;
            case "Backend":
                return 20000;
            case "Frontend":
                return 18000;
            default:
                throw new IllegalArgumentException("The provided job title is not supported");
        }
    }


}