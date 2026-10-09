
package school.registration.system;
import java.util.ArrayList;
public class Teacher extends Person {
//    data fields
    private double salary;
    private String department;
    private String rank;
//   constructor
    public Teacher(String name, int age,String rank, String department ,double salary ) {
        super(name, age);
        this.salary = salary;
        this.department = department;
        this.rank = rank;
    }
//  Setters and Getters
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }
      public String toString() {
        return name;}
//    initialized an ArrayList
      public static ArrayList<Teacher> teacherList = new ArrayList<Teacher>();
      
//      The list of Teachers
      
// Static block to initialize teachers
    static {
        teacherList.add(new Teacher("Dr. Mohamed", 40, "Professor", "CS", 10000));
        teacherList.add(new Teacher("Dr. Mahmoud", 45, "Associate Professor", "Math", 9500));
        teacherList.add(new Teacher("Dr. Ahmed", 38, "Lecturer", "IT", 8500));
        teacherList.add(new Teacher("Dr. Hussein", 50, "Professor", "Physics", 11000));
        teacherList.add(new Teacher("Dr. Waleed", 42, "Lecturer", "Engineering", 9000));
    }
//      method to add a new Teacher
   public static void addTeacher(Teacher teacher) {
        teacherList.add(teacher);
    }
        
      
//      method do display the list of Teachers    
       public void displayTeacherList() {
           System.out.println(teacherList);
       }
    
    @Override
    public void information(){
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Rank: "+getRank());
        System.out.println("department: " + getDepartment());
        System.out.println("Salary: " + getSalary());
    }
}

