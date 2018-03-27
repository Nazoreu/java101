import com.mshemanskyi.Person;
import com.mshemanskyi.Player;
import com.mshemanskyi.PlayerForvard;

public class Main {

    public static void main(String[] args) {
        Person person = new Person(); //class instance


        person.setFirstName("Andriy");
        person.setLastName("Shevchenko");
        person.setpozition("Coach");
        person.setAge(45);
        person.setSex("Male");


        Player player = new Player();

        player.setFirstName("Vasya");
        player.setLastName("Pupkin");
        player.setklikuha("Borzuy");
        player.setpozition("Defense");
        player.setAge(30);
        player.setSex("Male");


        PlayerForvard playerForvard = new PlayerForvard();

        playerForvard.setFirstName("Senya");
        playerForvard.setLastName("Lusuy");
        playerForvard.setklikuha("Shustryak");
        playerForvard.setpozition("Attack");
        playerForvard.setAge(25);
        playerForvard.setSex("Male");

        System.out.println("--------------------");

        System.out.println("Name: " + person.getFirstName() + " " + person.getLastName());
        System.out.println("Pozition:" + " " + person.getpozition());
        System.out.println("Age: " + person.getAge());
        // TODO: print age here

        System.out.println("--------------------");

        System.out.println("Name: " + player.getFirstName() + " " + player.getLastName());
        System.out.println("Klikuha:" + " " + player.getklikuha());
        System.out.println("Pozition:" + " " + player.getpozition());
        System.out.println("Age: " + player.getAge());
        // TODO: print age here

        System.out.println("--------------------");

        System.out.println("Name: " + playerForvard.getFirstName() + " " + playerForvard.getLastName());
        System.out.println("Klikuha:" + " " + playerForvard.getklikuha());
        System.out.println("Pozition:" + " " + playerForvard.getpozition());
        System.out.println("Age: " + playerForvard.getAge());
        // TODO: print age here

        System.out.println("--------------------");
    }


}
