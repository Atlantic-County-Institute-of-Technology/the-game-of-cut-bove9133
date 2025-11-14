import java.util.Random;

public class deck {
    Card[] deck = new Card[52];
}

public void newDeck() {
    int index = 0;
    for(int x = 1; x < 14; x++){
        for(int y = 1; y < 5; y++){
            Card card = new Card(x,y)
            deck[index] = card; index++;
        }
    }
}

public void shuffleDeck() {
    Random rand = new Random();
    Card temp;
    for(int x = 0; x < 52; x++){
        for(int y = 0; y < 5; y++)
        }
    }
}