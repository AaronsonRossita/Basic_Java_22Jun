public class Person{
    int id;
    String firstname;
    String lastname;
    private int age;

    public Person() {
    }

    public Person(int id, String firstname) {
        this.id = id;
        this.firstname = firstname;
    }

    public Person(String firstname, int id){
        this.id = id;
        this.firstname = firstname;
    }

    public Person(int id) {
        this.id = id;
    }

    public Person(String firstname) {
        this.firstname = firstname;
    }

    public Person(int id, String firstname, String lastname, int age) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        if(age < 0 || age > 130){
            this.age = 1;
        }else{
            this.age = age;
        }
    }

    public int getAge(){
        return this.age;
    }

    public void setAge(int age){
        if(age < 0 || age > 130){
            this.age = 1;
        }else{
            this.age = age;
        }
    }

    public void printName(){
        System.out.println("This person's name is " + this.firstname + " " + this.lastname);
    }

    public static void printClassInfo(){
        System.out.println("This class is called Person and it has fields : id, firstname, lastname and age");
    }

}
