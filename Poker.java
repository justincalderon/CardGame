package hw9;

/**
 * Class that represents a poker game, an extension of CardGame.
 * Copied from lecture.
 *
 */
public class Poker extends CardGame {
	
	// marker to not take the same card twice.
	int currentCardIdx = 0;
	
	// constructor
	public Poker() {
		super();
		cardsDealt = 5;
		currentCardIdx = 0;
	}
	
	public void displayDescription() {
		System.out.println("In poker, players bet on hands.");
		System.out.println("Winner can bluff or must have highest hand if called.");
	}
	
	// limit card hand to 5 cards only. Utilize for loop to check each card for doubles.
	// if cardHand index matches currentCard index, display card.
	public Card[] deal() {
		Card[] cardHand = new Card[cardsDealt];
		
		for (int idx = 0; idx < cardsDealt; idx++) {
			if (currentCardIdx >= 52) {
				System.out.println("ran out of cards in my deck!");
				
				return null;
				
			} 
			else {
			cardHand[idx] = this.getDeck()[currentCardIdx];
			currentCardIdx++;
			System.out.println(cardHand[idx]);
			
			}
		}
		return cardHand;
	}
}
