package hw9;

/**
 * Class that represents an abstract card game Holds a deck of 52 Card objects
 * and a number of cards to be dealt to each player.
 *
 */

public abstract class CardGame {

	// The card array will hold 52 cards.
	protected Card[] deck = new Card[52];
	int cardsDealt;

	/**
	 * Return the games deck of cards
	 * 
	 * @return Card[] array of 52 cards
	 */
	public Card[] getDeck() {
		return this.deck;
	}

	/**
	 * Create a CardGame
	 * 
	 */
	public CardGame() {

		// instantiate 52 cards of a deck
		// 1 of each for 4 suits

		int suit = 1;
		int value = 1;

		for (int idx = 0; idx < 52; idx++) {

			deck[idx] = new Card();
			if (suit == 1)
				deck[idx].setSuit('s');
			else if (suit == 2)
				deck[idx].setSuit('h');
			else if (suit == 3)
				deck[idx].setSuit('d');
			else
				deck[idx].setSuit('c');
			deck[idx].setValue(value);
			++value;

			// move on to next suit if we already
			// created all 13 cards of this suit
			// start at value = 1 for the next suit
			if (value > 13) {
				++suit;
				value = 1;
			}
		}
	}

	/**
	 * Shuffle the deck of cards
	 * 
	 */
	public void shuffle() {
		Card tmp = new Card();
		int x;
		for (x = 0; x < 100; ++x) {
			// pick to random positions and switch their cards
			int pos1 = ((int) (Math.random() * 100) % 52);
			int pos2 = ((int) (Math.random() * 100) % 52);
			tmp = deck[pos1];
			deck[pos1] = deck[pos2];
			deck[pos2] = tmp;
		}
	}

	public abstract void displayDescription();

	public abstract Card[] deal();
}
