package hw9;

/**
 * Represents a simple playing card either a spade (s), diamond (d), heart (h),
 * or club (c) and numbered between 1 and 13.
 *
 */
public class Card {
	/* Data fields - char for suit and int for value */
	private char suit;
	private int value;
	private String rank;

	/**
	 * Creates a new Card object with a random suit and random value
	 * 
	 */
	public Card() {
		final int NUMBER_OF_SUITS = 4;
		int mySuitNum = ((int) (Math.random() * 100) % NUMBER_OF_SUITS + 1);

		/* assign card to h, s, d, or c based on mySuitNum value */
		if (mySuitNum == 1) {
			this.suit = 'h';
		} else if (mySuitNum == 2) {
			this.suit = 's';
		} else if (mySuitNum == 3) {
			this.suit = 'd';
		} else {
			this.suit = 'c';
		}

		// To generate a random number between 1 and 13 for the card value
		final int CARDS_IN_SUITE = 13;
		this.value = ((int) (Math.random() * 100) % CARDS_IN_SUITE + 1);

		// set the rank based on its value
		// rank is ace,k jack, queen, or king, or just its value as a string

		if (this.value == 1) {
			rank = "Ace";
		} else if (this.value == 11) {
			rank = "Jack";
		} else if (this.value == 12) {
			rank = "Queen";
		} else if (this.value == 13) {
			rank = "King";
		} else {
			rank = Integer.toString(value);
		}
	}

	/**
	 * Returns the Card suit
	 * 
	 * @return Char representing Card suit.
	 */
	public char getSuit() {
		return this.suit;
	}

	/**
	 * Returns the Card value
	 * 
	 * @return Int representing card value (between 1 and 13)
	 */
	public int getValue() {
		return this.value;
	}

	/**
	 * return the card rank (String)
	 * 
	 * @return String string representing rank (ace, jack, king, queen, or value as
	 *         a string
	 */
	public String getRank() {
		return this.rank;
	}

	/**
	 * Sets the Card suit
	 * 
	 * @param s Char representing the suit (s, d, h, c)
	 */
	public void setSuit(char s) {
		this.suit = s;
	}

	/**
	 * Sets the Card value and the rank (ace, jack, queen, or king, or just a string
	 * if its between 1 and 10).
	 * 
	 * 
	 * @param v Int for Card value
	 * 
	 */
	public void setValue(int v) {

		if (v >= 1 && v <= 13) {
			this.value = v;
		}

		if (value == 1) {
			rank = "Ace";
		} else if (value == 11) {
			rank = "Jack";
		} else if (value == 12) {
			rank = "Queen";
		} else if (value == 13) {
			rank = "King";
		} else {
			rank = Integer.toString(value);
		}
	}

	/**
	 * Returns String of Card info
	 * 
	 */
	@Override
	public String toString() {
		String suitName;
		if (this.suit == 's') {
			suitName = "Spades";
		} else if (this.suit == 'd') {
			suitName = "Diamonds";
		} else if (this.suit == 'c') {
			suitName = "Clubs";
		} else {
			suitName = "Hearts";
		}
		return (this.rank + " of " + suitName);
	}
}
