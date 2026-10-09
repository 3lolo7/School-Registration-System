package school.registration.system;


// Abstract class Person to be inherited by Student and Teacher
public abstract class Person {

    // Name of the person (common attribute for all people in school)
    protected String name;

    // Age of the person (common attribute for all people in school)
    protected int age;

   
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
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

    // Setter for age - allows updating the age
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Abstract method to be implemented in subclasses (e.g. Student, Teacher)
     * Used to display specific information about the person depending on their role.
     */
    public abstract void information();
}
   