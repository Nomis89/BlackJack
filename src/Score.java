
public class Score {
	
//if (card.endsWith("A")) {
//	if (score + 11 > 21) {
//		score = score + 1;
//	} else {
//		score = score + 11;
//	}
//} else if (card.endsWith("K") || card.endsWith("Q") || card.endsWith("J") || card.endsWith("10")) {
//	score = score + 10;
//} else {
//	char c = card.charAt(1);
//	String s = String.valueOf(c);
//	int i = Integer.parseInt(s);
//	score = score + i;
	
	public static int checkScore(String[] cardsInHand) {
		
		int score = 0;
		int As = 0;
		for (String card : cardsInHand) {
			if (card == null) {
				break;
			} else {
				if (card.endsWith("A")) {
					As ++;
				} else if (card.endsWith("K") || card.endsWith("Q") || card.endsWith("J") || card.endsWith("10")) {
					score = score + 10;
				} else {
					char c = card.charAt(1);
					String s = String.valueOf(c);
					int i = Integer.parseInt(s);
					score = score + i;
				}
			} 
		}
		
		if (As == 1 && score + 11 > 21) {
			score = score + 1;
		} else if (As == 2 && score + 12 > 21) {
			score = score + 2;
		} else if (As == 3 && score + 13 > 21) {
			score = score + 3;
		} else if (As == 4 && score + 14 > 21) {
			score = score + 4;
		} else if (As == 0) {
			return score;
		} else {	
			score = score + 10 + As;
		}
	return score;
	}
}