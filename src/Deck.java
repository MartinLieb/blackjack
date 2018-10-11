public class Deck {

    Card[] deck = new Card[52];
    public Deck(){

        deck[0] = new Card("ace", "hearts",1);
        deck[1] = new Card("2", "hearts",2);
        deck[2] = new Card("3", "hearts",3);
        deck[3] = new Card("4", "hearts",4);
        deck[4] = new Card("5", "hearts",5);
        deck[5] = new Card("6", "hearts",6);
        deck[6] = new Card("7", "hearts",7);
        deck[7] = new Card("8", "hearts",8);
        deck[8] = new Card("9", "hearts",9);
        deck[9] = new Card("10", "hearts",10);
        deck[10] = new Card("jack", "hearts",10);
        deck[11] = new Card("queen", "hearts",10);
        deck[12] = new Card("king", "hearts",10);
        deck[13] = new Card("ace", "spades",1);
        deck[14] = new Card("2", "spades",2);
        deck[15] = new Card("3", "spades",3);
        deck[16] = new Card("4", "spades",4);
        deck[17] = new Card("5", "spades",5);
        deck[18] = new Card("6", "spades",6);
        deck[19] = new Card("7", "spades",7);
        deck[20] = new Card("8", "spades",8);
        deck[21] = new Card("9", "spades",9);
        deck[22] = new Card("10", "spades",10);
        deck[23] = new Card("jack", "spades",10);
        deck[24] = new Card("queen", "spades",10);
        deck[25] = new Card("king", "spades",10);
        deck[26] = new Card("ace", "diamonds",1);
        deck[27] = new Card("2", "diamonds",2);
        deck[28] = new Card("3", "diamonds",3);
        deck[29] = new Card("4", "diamonds",4);
        deck[30] = new Card("5", "diamonds",5);
        deck[31] = new Card("6", "diamonds",6);
        deck[32] = new Card("7", "diamonds",7);
        deck[33] = new Card("8", "diamonds",8);
        deck[34] = new Card("9", "diamonds",9);
        deck[35] = new Card("10", "diamonds",10);
        deck[36] = new Card("jack", "diamonds",10);
        deck[37] = new Card("queen", "diamonds",10);
        deck[38] = new Card("king", "diamonds",10);
        deck[39] = new Card("ace", "clubs",1);
        deck[40] = new Card("2", "clubs",2);
        deck[41] = new Card("3", "clubs",3);
        deck[42] = new Card("4", "clubs",4);
        deck[43] = new Card("5", "clubs",5);
        deck[44] = new Card("6", "clubs",6);
        deck[45] = new Card("7", "clubs",7);
        deck[46] = new Card("8", "clubs",8);
        deck[47] = new Card("9", "clubs",9);
        deck[48] = new Card("10", "clubs",10);
        deck[49] = new Card("jack", "clubs",10);
        deck[50] = new Card("queen", "clubs",10);
        deck[51] = new Card("king", "clubs",10);
    }

    public String getCard(int card){
        return deck[card].getCard();
    }
}
