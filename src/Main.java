import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Deck deck = new Deck();
        Random rand = new Random();
        //  kommentar til andras
        System.out.println("The card you picked is: " + deck.getCard(rand.nextInt(51))) ;
    }
}
