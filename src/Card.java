public class Card {

    String rank;
    String color;
    int value;

    public Card(String rank, String color, int value){
        this.rank = rank;
        this.color = color;
        this.value = value;
    }

    public String getCard(){
        return rank + " of " + color;

    }
    public int getCardValue(){
       return value;
    }
}
