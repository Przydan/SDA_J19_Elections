package pl.sda;

<<<<<<< HEAD
/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("test");
=======
import pl.sda.elections.ElectionFacade;
import pl.sda.elections.model.Vote;

public class App
{
    public static void main( String[] args )
    {
        ElectionFacade facade = new ElectionFacade();
        facade.vote(new Vote(1L,1L));
        facade.vote(new Vote(2L,1L));
        facade.vote(new Vote(1L,1L));
        facade.vote(new Vote(5L,1L));
        facade.vote(new Vote(8L,1L));
>>>>>>> a1a0a4502e8e691038bd98d634564d3f4f72db02
    }
}
