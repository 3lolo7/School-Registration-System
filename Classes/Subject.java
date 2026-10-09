package school.registration.system;
import java.util.ArrayList; 
import java.util.Scanner;
public class Subject {
    ArrayList<String> student = new ArrayList<String>();
    Scanner s = new Scanner(System.in);  //Command to make the user import values
    // Initialization of some Variables
    private String teacher;
    private String subject_name;
    private int student_num;

    public String getTeacher() {   
        return teacher;
    }

    public String getSubject_name() {
        return subject_name;
    }

    public int getStudent_num() {
        return student_num;
    }

// Constructor and Setters and Getters for the variables
   
    public ArrayList<String> getStudent() {
        return student;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public void setSubject_name(String subject_name) {
        this.subject_name = subject_name;
    }

    public void setStudent_num(int student_num) {
        this.student_num = student_num;
    }

    public void setStudent(ArrayList<String> student) {
        this.student = student;
    }

    public Subject(String teacher, String subject_name, int student_num) {
        this.teacher = teacher;
        this.subject_name = subject_name;
        this.student_num = student_num;
    }

    
   
        
        
    


   

   
    
    
    public void reg_students(){
    
        for (int i=0;i<student_num;i++){    
            String y=s.next();
   student.add(y);
    }
    
    }
    
    
    
    // Method to Display the information of The Subject.
    public void getinfo(){
        String y;
        
        System.out.println("Teacher name:"+teacher);
        System.out.println("Subject:"+subject_name);
        System.out.println("The registered students:");
         for (String names : student) {
    System.out.println(names);
}
    }
}
