import java.util.LinkedList;
import java.util.List;

/**
 * OPTIONAL extra credit class.
 * For up to 10 points extra credit, you can write your own poker analysis.
 * See the Extra Credit section of the P7 PDF for more details.
 * Osaretin Osa-Edokpolor 115651098 0103
 * I pledge on my honor that I have not given or received any unauthorized assistance on this assignment/examination.
 */
public class MyPokerAnalysis implements PokerAnalyzer {

	private List<Card> cards;
	
	public MyPokerAnalysis(List<Card> cards) {
		cards = new LinkedList<Card>(cards);
	}
	/**
	 * HAS PAIR method uses suit instead of Rank.
	 */
	@Override
	public boolean hasPair() {
		
		if (cards.get(0).getSuit() == cards.get(1).getSuit() || cards.get(0).getSuit() == cards.get(2).getSuit()
				|| cards.get(0).getSuit() == cards.get(3).getSuit() || cards.get(0).getSuit() == cards.get(4).getSuit()
				|| cards.get(1).getSuit() == cards.get(2).getSuit() || cards.get(1).getSuit() == cards.get(3).getSuit()
				|| cards.get(1).getSuit() == cards.get(4).getSuit() || cards.get(2).getSuit() == cards.get(3).getSuit()
				|| cards.get(2).getSuit() == cards.get(4).getSuit() || cards.get(3).getSuit() == cards.get(4).getSuit()) {
			return true;
		}else {
			return false;
		}
	}

	@Override
	public boolean hasThreeOfAKind() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean hasTwoPair() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean hasFourOfAKind() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean hasFullHouse() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean hasStraight() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean hasFlush() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean hasStraightFlush() {
		// TODO Auto-generated method stub
		return false;
	}

}
