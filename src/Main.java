import com.mshemanskyi.Person;

public class Main {

    public static void main(String[] args) {
        Person person = new Person(); //class instance

        person.setFirstName("Andriy");
        person.setLastName("Shevchenko");
        person.setAge(45);
        person.setSex("Male");

        System.out.println("--------------------");

        System.out.println("Name: " + person.getFirstName() + " " + person.getLastName());
        System.out.println("Age: " + person.getAge());
        // TODO: print age here

        System.out.println("--------------------");



    }
}
