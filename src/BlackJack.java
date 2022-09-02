import java.util.Arrays;
import java.util.Scanner;

public class BlackJack {


	public static void main(String[] args) {
		Deck deck = new Deck();
		Player player1 = new Player();
		Player dealer = new Player();
		Scanner nextTurn = new Scanner(System.in);
				
		int cardsDealt = 0;
		int cardsPlayer = 0;
		int cardsDealer = 0;
		
//		System.out.println(deck.cardList);
		
		while (player1.cardsInHand[1] == null) {

			String card = deck.cardList.get(cardsDealt);
			player1.cardsInHand[cardsPlayer] = card;
			cardsDealt ++;
			cardsPlayer ++;
			card = deck.cardList.get(cardsDealt);
			dealer.cardsInHand[cardsDealer] = card;
			cardsDealt ++;
			cardsDealer ++;
		}
		
		int playerScore = Score.checkScore(player1.cardsInHand);
		String choice = "k";
		
		System.out.println("Kaart van de dealer: " + dealer.cardsInHand[0]);
		
		while (playerScore < 21 && choice.equals("k")) {
			System.out.println("Jouw kaarten: " + Arrays.toString(player1.cardsInHand));
			System.out.println("Je score is: " + playerScore);
			
			System.out.println("wil je een extra (k)aart, wil je (p)assen, of wil je stoppen (q)?");
			choice = nextTurn.nextLine();
			
			if (choice.equals("k")) {
				String card = deck.cardList.get(cardsDealt);
				cardsDealt ++;
				player1.cardsInHand[cardsPlayer] = card;
				cardsPlayer ++;
				System.out.println(Arrays.toString(player1.cardsInHand));
				playerScore = Score.checkScore(player1.cardsInHand);
			} else if (choice.equals("p")) {  
				System.out.println(Arrays.toString(player1.cardsInHand));
				System.out.println("Je score is " + playerScore);
			} else if (choice.equals("q")) {
				System.exit(0);
			}
		}
		
		if (playerScore == 21) {
			System.out.println("Je hebt 21");
		} else if (playerScore > 21) {
			System.out.println("Te hoog");
		}
		
		System.out.println(Arrays.toString(dealer.cardsInHand));
		
		int dealerScore = Score.checkScore(dealer.cardsInHand);
		
		while(dealerScore < 17) {
			String card = deck.cardList.get(cardsDealt);
			cardsDealt ++;
			dealer.cardsInHand[cardsDealer] = card;
			cardsDealer ++;
			System.out.println("Kaarten van dealer: " + Arrays.toString(dealer.cardsInHand));
			dealerScore = Score.checkScore(dealer.cardsInHand);
			System.out.println(dealerScore);
		}
		
		if (playerScore <= 21 && playerScore > dealerScore) {
			System.out.println("You win");
		} else if (playerScore <= 21 && playerScore == dealerScore) {
			System.out.println("It's a draw");
		} else if (playerScore <= 21 && playerScore < dealerScore) {
			System.out.println("Dealer wins");
		} else if (playerScore > 21 && dealerScore > 21) {
			System.out.println("It's a draw");
		}else if (playerScore > 21 && dealerScore < 21) {
			System.out.println("Dealer wins");
		} else if (playerScore <= 21 && dealerScore > 21) {
			System.out.println("You win");
		}
	}
}
	


