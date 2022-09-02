import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Deck {
	
	public List<String> cardList;

	public Deck() {
	
	String spades = "\u2660";
	String heart = "\u2661";
	String diamond = "\u2662";
	String club = "\u2663";
	
	String[] cards = {heart+"A", heart+"2", heart+"3", heart+"4", heart+"5", heart+"6", heart+"7", heart+"8", heart+"9", heart+"10", heart+"J", heart+"Q", heart+"K" ,
			spades+"A", spades+"2", spades+"3", spades+"4", spades+"5", spades+"6", spades+"7", spades+"8", spades+"9", spades+"10", spades+"J", spades+"Q", spades+"K" ,
			diamond+"A", diamond+"2", diamond+"3", diamond+"4", diamond+"5", diamond+"6", diamond+"7", diamond+"8", diamond+"9", diamond+"10", diamond+"J", diamond+"Q", diamond+"K" ,
			club+"A", club+"2", club+"3", club+"4", club+"5", club+"6", club+"7", club+"8", club+"9", club+"10", club+"J", club+"Q", club+"K"};
	
	this.cardList = Arrays.asList(cards);
	Collections.shuffle(cardList);

	}
	
	public String newCard(int a) {
		String card = cardList.get(a); 
		return card;
	}
}
