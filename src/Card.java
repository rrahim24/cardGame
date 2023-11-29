public class Card {
    private String suit;
    private int value;

    public Card(int value, String suit) {
        this.value = value;
        this.suit = suit;
    }

    public int getValue() {
        return value;
    }

    public String getSuit(){
        return suit;
    }
}