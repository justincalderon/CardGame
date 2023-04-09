package hw9;

/** Player class. Has a name and a deck of cards.
 * 
 *
 */
public class Player {

	private Card[] cards;
	private String name;

	/** Set the player's name
	 * 
	 * @param name String for name.
	 */
	public void setName(String name) {
		this.name = name;
	}

	/** Sets the player's cards
	 * 
	 * @param cards Array of cards;
	 */
	public void setCards(Card [] cards) {
		this.cards = cards;
	}

	/** Returns player's name
	 * 
	 * @return String player's name.
	 */
	public String getName() {
		return this.name;
	}


	/** Returns player's cards array
	 * 
	 * @return Card[] cards array.
	 */
	public Card [] getCards() {
		return this.cards;
	}
	
	/** Return the player's name
	 * 
	 * @param name String representing Player's name.
	 */

	public Player(String name) {
		this.name = name;
	}

}
