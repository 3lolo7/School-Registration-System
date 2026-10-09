
package school.registration.system;
import java.util.ArrayList;
public class Student extends Person {


private int level;
private long id;


    
    public ArrayList<String> SubbedSubjects = new ArrayList<String>(); 
    public Student(String name, int level, long id, int age){ 
        super (name, age);//(Super Class's Constructor)
        this.id=id;
        this.level=level;
    }

    public void setId(long id) {
        this.id = id;
    }
    public void addSubject(String subject){ //Adding method of the arraylist (Setter)
        SubbedSubjects.add(subject);
       
    }

    public long getId() {
        return id;
    }

    public void setLevel(int level){
        this.level=level;
    }
    public int getLevel(){
        return level;
    }
    
    @Override
    public void information(){ //The person's abstract method
        
    String info = " Student name  : "+getName()+"  Student's ID  : "+getId()+" Student's level :  "+getLevel();
    info+="  SubbedSubjects : \n";
        
    
        for (int i=0;i<SubbedSubjects.size();i++){
            info+= "- "+SubbedSubjects.get(i);}
        
        
        
        System.out.println(info);}}
