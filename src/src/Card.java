public class Card {
}

//This is an array of all 52 possible card faces
private Card[] deck = new Card[52]
        for () {
            for () {
                deck[i] = new Card(face, suit)
                }
                }

//This is the constructor, which creates a card with a face and suit
public Card(int face, int suit) {
    this.face = face;
    this.suit = suit;
}

//A getter, it returns the cards face value (1-13)
public int getFace() {return face;}

//This is for the cards suit value (1-4), it returns it
public int getSuit() {return suit;}

//This takes the card and converts it to a readable string
public String toString() { return faces[face] + " of " + suits[suit];}