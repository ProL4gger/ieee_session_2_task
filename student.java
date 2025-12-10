import java.util.Scanner;
public class student{
    String Name;
    int Age;
    String Grade;
    String StudentID;
    String Major;
    double GPA;

    public student(String Name, int Age, String StudentID, String Major, String Grade, double GPA){
        this.Name = Name;
        this.Age = Age;
        this.Grade = Grade;
        this.StudentID = StudentID;
        this.Major = Major;
        this.GPA = GPA;

    }

    public void setName(String Name){
        this.Name = Name;
    }
    public String getName(){
        return this.Name;
    }
    
    public void setAge(int Age){
        this.Age = Age;
    }
    public int getAge(){
        return this.Age;
    }

    public void setGrade(String Grade){
        this.Grade = Grade;
    }
    public String getGrade(){
        return this.Grade;
    }

    public void setID(String ID){
        this.StudentID = ID;
    }
    public String getID(){
        return this.StudentID;
    }

    public void setMajor(String Major){
        this.Major = Major;
    }
    public String getMajor(){
        return this.Major;
    }

    public void setGPA(double GPA){
        this.GPA = GPA;
    }
    public double getGPA(){
        return this.GPA;
    }

    public void displayInfo(){
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Student ID: " + getID());
        System.out.println("Major: " + getMajor());
        System.out.println("Grade: " + getGrade());
        System.out.println("GPA: " + getGPA());
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = sc.nextLine();

        System.out.println("Enter your Age: ");
        int age =  Integer.parseInt(sc.nextLine());

        System.out.println("Enter your Student ID: ");
        String ID =  sc.nextLine();

        System.out.println("Enter your Major: ");
        String major = sc.nextLine();

        System.out.println("Enter your Grade: ");
        String grade = sc.nextLine();

        System.out.println("Enter your GPA: ");
        double gpa = sc.nextDouble();

        student S =  new student(name, age, ID, major, grade, gpa);
        S.displayInfo();
        
        sc.close();
    }


}


/* implement a student class here 
it should have the following properties:
- name 
- age
- grade
- studentID
- major
- gpa
it should also have the following methods:
- a constructor to initialize all properties
- a method to display student information
- a getter and setter for each property
- main method to create a student object (with your information) and display its information
*/ 
