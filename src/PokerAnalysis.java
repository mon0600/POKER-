import java.util.ArrayList;
import java.util.List;

/**
 * This class implements the PokerAnalyzer interface. It will analyze the List
 * of Cards it is given at construction. Most of the tests will only give 5
 * cards in the List, like real Poker, but some tests will contain more than 5
 * cards. In that case, you have a hand (say, a flush) if ANY 5 of those cards
 * have that hand (flush in this case).
 * Osaretin Osa-Edokpolor  115651098 0103
 *I pledge on my honor that I have not given or received any unauthorized assistance on this assignment/examination.
 */
public class PokerAnalysis implements PokerAnalyzer {

	private List<Card> cards;
	private int[] rankCounts;
	private int[] suitCounts;
	//	private  ArrayList<Card> list;

	/**
	 * The constructor has been partially implemented for you. cards is the
	 * ArrayList where you'll be adding all the cards you're given. In addition,
	 * there are two arrays. You don't necessarily need to use them, but using them
	 * will be extremely helpful.
	 * 
	 * The rankCounts array is of the same length as the number of Ranks. At
	 * position i of the array, keep a count of the number of cards whose
	 * rank.ordinal() equals i. Repeat the same with Suits for suitCounts. For
	 * example, if your Cards are (Clubs 4, Clubs 10, Spades 2), your suitCounts
	 * array would be {2, 0, 0, 1}.
	 * 
	 * @param cards
	 *            the list of cards to be added
	 */
	public PokerAnalysis(List<Card> cards) {
		this.cards = new ArrayList<Card>();
		this.rankCounts = new int[Rank.values().length];
		this.suitCounts = new int[Suit.values().length];
		//		list = new ArrayList<>(cards);

		for (int i = 0; i < cards.size(); i++) {
			int x = cards.get(i).getRank().ordinal();
			rankCounts[x]++;
		}
		for (int i = 0; i < cards.size(); i++) {
			int x = cards.get(i).getSuit().ordinal();
			suitCounts[x]++;
		}
	}

	@Override
	public boolean hasPair() {
		//		if (list.get(0).getRank() == list.get(1).getRank() || list.get(0).getRank() == list.get(2).getRank()
		//				|| list.get(0).getRank() == list.get(3).getRank() || list.get(0).getRank() == list.get(4).getRank()
		//				|| list.get(1).getRank() == list.get(2).getRank() || list.get(1).getRank() == list.get(3).getRank()
		//				|| list.get(1).getRank() == list.get(4).getRank() || list.get(2).getRank() == list.get(3).getRank()
		//				|| list.get(2).getRank() == list.get(4).getRank() || list.get(3).getRank() == list.get(4).getRank()) {
		//			return true;
		//		}else {
		//			return false;
		//		}
		for (int i = 0; i < rankCounts.length; i++) {
			if(rankCounts[i] >=2) {
				return true;
			}
		}
		return false;


	}

	@Override
	public boolean hasThreeOfAKind() {
		//		if (list.get(0).getRank() == list.get(1).getRank() && list.get(1).getRank() == list.get(2).getRank()) {
		//			return true;
		//		} else if (list.get(0).getRank() == list.get(1).getRank() && list.get(1).getRank() == list.get(3).getRank()) {
		//			return true;
		//		} else if (list.get(0).getRank() == list.get(1).getRank() && list.get(1).getRank() == list.get(4).getRank()) {
		//			return true;
		//		} else if (list.get(0).getRank() == list.get(2).getRank() && list.get(2).getRank() == list.get(3).getRank()) {
		//			return true;
		//		} else if (list.get(0).getRank() == list.get(2).getRank() && list.get(2).getRank() == list.get(4).getRank()) {
		//			return true;
		//		} else if (list.get(0).getRank() == list.get(3).getRank() && list.get(3).getRank() == list.get(4).getRank()) {
		//			return true;
		//		} else if (list.get(1).getRank() == list.get(2).getRank() && list.get(2).getRank() == list.get(3).getRank()) {
		//			return true;
		//		} else if (list.get(1).getRank() == list.get(2).getRank() && list.get(2).getRank() == list.get(4).getRank()) {
		//			return true;
		//		} else if (list.get(1).getRank() == list.get(3).getRank() && list.get(3).getRank() == list.get(4).getRank()) {
		//			return true;
		//		} else if (list.get(2).getRank() == list.get(3).getRank() && list.get(3).getRank() == list.get(4).getRank()) {
		//			return true;
		//		}
		//
		//		return false;
		for (int i = 0; i < rankCounts.length; i++) {
			if (rankCounts[i] >=3) {
				return true;
			}
		}
		return false;
	}


	@Override
	public boolean hasTwoPair() {

		//		if (list.get(1).getRank() == list.get(0).getRank()) {
		//			if (list.get(2).getRank() == list.get(3).getRank() ||list.get(2).getRank() == list.get(4).getRank()
		//					|| list.get(3).getRank() == list.get(4).getRank()) {
		//				return true;
		//			}
		//		} else if (list.get(2).getRank() == list.get(0).getRank()) {
		//			if (list.get(1).getRank() == list.get(3).getRank() || list.get(1).getRank() == list.get(4).getRank()
		//					|| list.get(3).getRank() == list.get(4).getRank()) {
		//				return true;
		//			}
		//		} else if (list.get(3).getRank() == list.get(0).getRank()) {
		//			if (list.get(1).getRank() == list.get(2).getRank() || list.get(2).getRank() == list.get(4).getRank()
		//					|| list.get(1).getRank() == list.get(4).getRank()) {
		//				return true;
		//			}
		//		} else if (list.get(4).getRank() == list.get(0).getRank()) {
		//			if (list.get(1).getRank() == list.get(2).getRank() || list.get(1).getRank() == list.get(3).getRank()
		//					|| list.get(2).getRank() == list.get(3).getRank()) {
		//				return true;
		//			}
		//		} else if (list.get(2).getRank() == list.get(1).getRank()) {
		//			if (list.get(0).getRank() == list.get(3).getRank() || list.get(0).getRank() == list.get(4).getRank()
		//					|| list.get(3).getRank() == list.get(4).getRank()) {
		//				return true;
		//			}
		//		} else if (list.get(1).getRank() == list.get(3).getRank()) {
		//			if (list.get(0).getRank() ==list.get(2).getRank() ||list.get(0).getRank() == list.get(4).getRank()
		//					|| list.get(2).getRank() == list.get(4).getRank()) {
		//				return true;
		//			}
		//		} else if (list.get(1).getRank() == list.get(4).getRank()) {
		//			if (list.get(0).getRank() == list.get(2).getRank() || list.get(0).getRank()== list.get(3).getRank()
		//					|| list.get(2).getRank() == list.get(3).getRank()) {
		//				return true;
		//			}
		//		} else if (list.get(2).getRank() == list.get(3).getRank()) {
		//			if (list.get(0).getRank() == list.get(1).getRank() || list.get(0).getRank() == list.get(4).getRank()
		//					|| list.get(1).getRank() == list.get(4).getRank()) {
		//				return true;
		//			}
		//		} else if (list.get(2).getRank() == list.get(4).getRank()) {
		//			if (list.get(0).getRank() == list.get(1).getRank() || list.get(0).getRank() == list.get(3).getRank()
		//					|| list.get(1).getRank() == list.get(3).getRank()) {
		//				return true;
		//			}
		//		} else if (list.get(3).getRank() == list.get(4).getRank()) {
		//			if (list.get(0).getRank() == list.get(1).getRank() || list.get(0).getRank() == list.get(2).getRank()
		//					|| list.get(1).getRank() == list.get(2).getRank()) {
		//				return true;
		//			}
		//		}
		//		return false;
		int count = 0;
		for (int i = 0; i < rankCounts.length; i++) {
			if(rankCounts[i] >=2) {
				count ++;
			}
		}
		if (count >=2) {
			return true;
		}
		return false;
	}


	@Override
	public boolean hasFourOfAKind() {
		//		for (int i = 0; i < list.size()-3 ; ++i) {
		//			if (list.get(i).getRank() == list.get(i+1).getRank()
		//					&& list.get(i).getRank() == list.get(i+2).getRank()
		//					&& (list.get(i).getRank() == list.get(i+3).getRank() || list.get(i).getRank() == list.get(i+4).getRank())
		//					)
		//				return true;
		//		}
		//		return false;
		for (int i = 0; i < rankCounts.length; i++) {
			if (rankCounts[i] >=4) {
				return true;
			}
		}
		return false;

	}

	@Override
	public boolean hasFullHouse() {
		int count =  0;
		int count2 =0;
		for (int i = 0; i < rankCounts.length; i++) {
			if (rankCounts[i] >=2) {
				count++;
			}
			if (rankCounts[i] >=3) {
				count2++;
			}
		}

		if (count >=2  && count2 >=1) {
			return true;
		}
		return false;

	}

	/**
	 * You don't need to implement this, but it will be helpful. This method returns
	 * true if there is a straight hand starting with the Rank r and false
	 * otherwise. As the Wikipedia page says, no straight hand can start with a
	 * Jack, Queen or King. Also look into the nextRank() method of the Rank enum.
	 */
	private boolean hasStraight(Rank r) {
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean hasStraight() {

		int count = 0;
		for (int i = 0; i < rankCounts.length; i++) {
			if (rankCounts[i] >= 1) {
				count++;
			}else {
				count=0;
			}
			if(count>=5) {
				return true;
			}
		}
		return false;
	}


	@Override
	public boolean hasFlush() {
		for (int i = 0; i < suitCounts.length; i++) {
			if(suitCounts[i] >=5) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Private helper similar to hasStraight(Rank r), but this time you consider
	 * suit also. Optional, but very helpful to write.
	 */
	private boolean hasStraightFlush(Rank r, Suit s) {
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean hasStraightFlush() {
		if(hasFlush() && hasStraight()) {
			return true;
		}
		return false;
	}

}
