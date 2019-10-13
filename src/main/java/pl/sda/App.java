package pl.sda;

import pl.sda.elections.ElectionFacade;
import pl.sda.elections.model.Vote;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        ElectionFacade electionFacade = new ElectionFacade();
        electionFacade.vote(new Vote(1L,1L));
    }
}
