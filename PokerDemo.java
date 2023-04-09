package hw9;

public class PokerDemo {
	
	public static void main(String[] args) {
		Poker pokerGame = new Poker();
		
		pokerGame.displayDescription();
		pokerGame.shuffle();
		
		Player justin = new Player("Justin");
		System.out.println("\n" + justin.getName() + " is holding");
		justin.setCards(pokerGame.deal());
		
		// testing 'ran out of cards' error.
		//for (int i = 0; i < 10; i++) {
		//	justin.setCards(pokerGame.deal());
		//}
		
		
		Player joe = new Player ("Joe");
		System.out.println("\n" + joe.getName() + " is holding");
		joe.setCards(pokerGame.deal());
	}
}
