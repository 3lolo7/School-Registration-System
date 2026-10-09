package school.registration.system;

public class ReportCard {
    private Student student;//relationبين الكلاس الحالي و  Student
    private double grade;

    public ReportCard(Student student, double grade) {
        this.student = student;
        setGrade(grade);//التحقق ان الgradeمن(0:100)
    }

    
    public ReportCard() {
    } 
    
    public void setGrade(double grade) {
        if(grade<0||grade>100){
            System.out.println("Error: grade must be between 0 and 100.");
        }else{
            this.grade=grade;
        }
        
        
        
        this.grade = grade;
    }
    //التقرير النهائي
    public void displayReport(){
        System.out.println("Report card:");
        System.out.println("Student:"+student.getName()+"\nId:"+student.getId());
        System.out.println("Grade:"+grade);
        if(grade<0||grade>100){
            System.out.println("Invalid entered");
            return; //اخرج من باقي الحالات
        }
        
        if(grade>=85){
            System.out.println("Excellent");
        }else if(grade>=70){
            System.out.println("Good");
        }else if(grade>=50){
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
        }
    }

    
    
}
