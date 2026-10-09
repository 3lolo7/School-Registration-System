
package school.registration.system;

public class Schedule {    
    String day,time,subject; // day of the schedule , time slot and subject being taught
    
    public Schedule(String day, String time)//constructor with only day and time
    {this.day=day;
    this.time=time;
    this.subject="Not Assigned"; // default subject
            
    }
public Schedule(String day ,String time, String subject ) // overloaded  constructor with all the details
{
   this.day=day;
    this.time=time;
    this.subject=subject;
}
    public void setSubject(String subject) { // setter for subject
        this.subject = subject;
    }
public void showSchedule() // display full schedule details
{ System.out.println("Schedule:");
    System.out.println("day:"+ day);
    System.out.println("Time:"+ time);
    System.out.println ("Subject:"+ subject);       
}
    @Override
    public String toString() // overriding toString method to provide a String representation  
    {
        return "Schedule{"+"day='"+ day +'\''+",time'="+ time + '\'' +", subject='" + subject+"}";
}
}
