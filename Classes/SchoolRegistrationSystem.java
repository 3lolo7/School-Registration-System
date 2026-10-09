package school.registration.system;
import java.util.Scanner;
public class SchoolRegistrationSystem {
 public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
       int choice =-1; // Initialize with invalid choice to turn on the loop
       while (choice !=0){   //a loop to make the user choose which class he wants to test
            System.out.println("Welcome to School Management System");
            System.out.println("Choose a class you want to test");
            System.out.println("1. Test Student Class");
            System.out.println("2. Test Teacher Class");
            System.out.println("3. Test Subject Class");
            System.out.println("4. Test Schedule Class");
            System.out.println("5. Test ReportCard Class");
            System.out.println("6. Test All Classes");
            System.out.println("0. Exit");
            choice = input.nextInt();

        switch (choice) {
        case 1 :
            testStudentClass();
            break;
        case 2 :
            testTeacherClass();
            break;
        case 3 :
            testSubjectClass();
            break;
        case 4 :
            testScheduleClass();
            break;
        case 5 :
            testReportCardClass();
            break;
        case 6 :
            testAllClasses();
            break;
        case 0:
            System.out.println("Existing now");
            break;
        default :
        System.out.println("Invalid choice .. try again choose from (0-6) ");
        }
       }
 }
        public static void testStudentClass(){ // method to test student clas
        Scanner s1 = new Scanner(System.in);
        System.out.println("---Testing student class---");
         System.out.println("Enter student name");
             String name = s1.next();
                 int age = -1; // Initialize with invalid choice to turn on the loop to put the right age (postive)
        while (age<0)
        {
             System.out.println("Enter student age :");
             age = s1.nextInt();
                 if (age<0)
                 System.out.println("Student age can not be negative .. Enter a vaild age :");
              }
             int level = -1; //Initialize with invalid choice to turn on the loop to put the right level (postive) .. did it with long so it can hold more value
        while (level <0)
        {
            System.out.println("Enter student level");
            level = s1.nextInt();
                if (level <0)
                System.out.println("level has to be with postive .. Enter a vaild level :");
        }    
             long id = -1; //Initialize with invalid choice to turn on the loop to put the right id (postive) .. did it with long so it can hold more value
        while (id<0)
        {
            System.out.println("Enter student ID :");
            id = s1.nextLong();
            if (id<0)
            System.out.println("ID with postive please .. Enter a vaild id :");
        }
        Student student = new Student (name , level , id ,age);
         System.out.println("Enter the number of subjects student has subbscribed: ");
         int num1 = s1.nextInt(); 
         for (int i =1 ; i<=num1 ; i++){  // for loop to make the user enter subbscribed subjects 
             System.out.println("Enter subject"+i +":");
            String subsubject = s1.next();
           student.addSubject(subsubject);
         }
   
        student.information();
      }
public static void testTeacherClass() {
    Scanner s = new Scanner(System.in);

    
    for (;;) { // Infinite loop, exits when user chooses 0
        System.out.println("\n--- Teacher Management ---");
        System.out.println("1. Add a Teacher");
        System.out.println("2. Search for a Teacher");
        System.out.println("3. Display all Teachers");
        System.out.println("0. Back to Main Menu");
        System.out.print("Choose an option: ");
        int choice = s.nextInt();
        s.nextLine(); // Consume newline

        if (choice == 0) {
            System.out.println("Returning to main menu...");
            break;
        }

        switch (choice) {
            case 1:
                System.out.print("Enter teacher name: ");
                String name = s.nextLine();

                System.out.print("Enter teacher age: ");
                int age = s.nextInt();
                s.nextLine();

                System.out.print("Enter teacher rank: ");
                String rank = s.nextLine();

                System.out.print("Enter teacher department: ");
                String department = s.nextLine();

                System.out.print("Enter teacher salary: ");
                double salary = s.nextDouble();

                Teacher newTeacher = new Teacher(name, age, rank, department, salary);
                Teacher.teacherList.add(newTeacher);
                System.out.println("Teacher added successfully.");
                break;

            case 2:
                System.out.print("Enter the teacher name to search: ");
                String searchName = s.nextLine();
                boolean found = false;

                for (Teacher t : Teacher.teacherList) {
                    if (t.getName().equalsIgnoreCase(searchName)) {
                        t.information();
                        found = true;
                        break;
                    }
                }

                if (!found) {
                    System.out.println("Teacher not found.");
                }
                break;

            case 3:
                if (Teacher.teacherList.isEmpty()) {
                    System.out.println("No teachers to display.");
                } else {
                    for (Teacher t : Teacher.teacherList) {
                        
                        System.out.println("---------------");
                        t.information();
                    }
                }
                break;

            default:
                System.out.println("Invalid choice. Try again.");
        }
    }
}

            
        // method to test subject class
      public static void testSubjectClass(){ 
          Scanner sc = new Scanner(System.in);
          Subject r1=new Subject("a","a",0);                
          System.out.print("Enter the teacher name:");
             String k=sc.next();
            r1.setTeacher(k);
             System.out.print("Enter subject name:");
            String h=sc.next();
            r1.setSubject_name(h);
             System.out.print("Enter the number of the registered students:");
             int n=sc.nextInt();
             r1.setStudent_num(n);
             r1.reg_students();
             System.out.println("The name of registered students:");
             r1.getinfo();
         }  
         
         
         public static void testScheduleClass(){ // method to test schedule class
             Scanner s4 = new Scanner(System.in);
             System.out.println("---Testing schedule class---");
             System.out.println("Enter day of the schedule .. example : (Monday)");
             String day = s4.nextLine();
             System.out.println("Enter time of the schedule .. example : (10:00 AM)");
             String time = s4.nextLine(); //nextLine()the user can put space between 10 and AM in the example 
             System.out.println("Enter a subject in schedule :");
             String schedule_subject = s4.next();
             Schedule schedule1 = new Schedule(day, time);
             System.out.println(" before adding subject :");
             schedule1.showSchedule();
             Schedule schedule2 = new Schedule (day , time ,schedule_subject);
             System.out.println(" after adding subject :");
             schedule2.showSchedule();
             schedule2.toString();
         }
            public static void testReportCardClass(){ // method to test report card class
                Scanner s5 = new Scanner(System.in);
                System.out.println("---Testing report card class---");
                System.out.print("Enter student name for report card: \n ");
                String student1 = s5.next();
                          int age = -1; // Initialize with invalid choice to turn on the loop to put the right age (postive)
        while (age<0)
        {
             System.out.println("Enter student age :");
             age = s5.nextInt();
                 if (age<0)
                 System.out.println("Student age can not be negative .. Enter a vaild age :");
              }
             int level = -1; //Initialize with invalid choice to turn on the loop to put the right level (postive)
        while (level <0)
        {
            System.out.println("Enter student level");
            level = s5.nextInt();
                if (level <0)
                System.out.println("level has to be with postive .. Enter a vaild level :");
        }    
             long id = -1;
        while (id<0)
        {
            System.out.println("Enter student ID :");
            id = s5.nextLong();
            if (id<0)
            System.out.println("ID with postive please .. Enter a vaild id :");
        }
            Student student = new Student (student1 , level , id ,age);
               double grade = -1;
               while (grade<0||grade>100) // while loop to enter valid grade
               { 
                   System.out.println("Enter student grade (0-100)"); 
                  grade=s5.nextDouble();
                   if(grade<0||grade>100)
                      System.out.println("Invalid grade .. please enter valid grade (0-100)");
               
               }
                ReportCard reportCard = new ReportCard(student , grade); 
                reportCard.displayReport();
    
}
 public static void testAllClasses(){ // method to test all classes
        System.out.println("Testing all classes");
        testStudentClass();
        testTeacherClass();
        testSubjectClass();
        testScheduleClass();
        testReportCardClass();
    }     
    
    
}
