/**
	 * An object of type Hand represents a hand of cards.  The
	 * cards belong to the class Card.  A hand is empty when it
	 * is created, and any number of cards can be added to it.
	 */

	import java.util.ArrayList;

	public class Hand {

	   private Card[] hand;   // The cards in the hand.
	   private int count; 
	   
	   /**
	    * Create a hand that is initially empty.
	    */
	   public Hand() {
	      hand = new Card[5];
		  count = 0;
	   }
	   
	   /**
	    * Remove all cards from the hand, leaving it empty.
	    */
	   public void clear() {
	      for(int i=0 ; i<hand.length; i++){ hand[i] = null; }
		  count = 0;
	   }
	   
	   /**
	    * Add a card to the hand.  It is added at the end of the current hand.
	    * @param c the non-null card to be added.
	    * @throws NullPointerException if the parameter c is null.
	    */
	   public void addCard(Card c) {
	      
		  for(int i=0 ; i<hand.length; i++){ 
			if (hand[i] == null){
				hand[i] = c;
				count = count + 1;
				break;
			}
		 }

		  
	   }
	   
	   /**
	    * Remove a card from the hand, if present.
	    * @param c the card to be removed.  If c is null or if the card is not in 
	    * the hand, then nothing is done.
	    */
	   public void removeCard(Card c) {

		   for(int i=0 ; i<hand.length; i++){ 
			    if (hand[i]!=null && hand[i].equals(c)){
			      hand[i] = null;
			      count = count-1;
			    }
			  }

	   }
	   
	   /**
	    * Remove the card in a specified position from the hand.
	    * @param position the position of the card that is to be removed, where
	    * positions are starting from zero.
	    * @throws IllegalArgumentException if the position does not exist in
	    * the hand, that is if the position is less than 0 or greater than
	    * or equal to the number of cards in the hand.
	    */
	   public void removeCard(int position) {
		   if (position < 0 || position >= hand.length)
		         throw new IllegalArgumentException("Position does not exist in hand: "
		               + position);
		      hand[position] = null;
		      count --;
	   }

	   /**
	    * Returns the number of cards in the hand.
	    */
	   public int getCardCount() {
	      return count;
	   }
	   
	   /**
	    * Gets the card in a specified position in the hand.  (Note that this card
	    * is not removed from the hand!)
	    * @param position the position of the card that is to be returned
	    * @throws IllegalArgumentException if position does not exist in the hand
	    */
	   public Card getCard(int position) {
	      if (position < 0 || position >= hand.length)
	         throw new IllegalArgumentException("Position does not exist in hand: "
	               + position);
	       return hand[position];
	   }
	   
	   /**
	    * Sorts the cards in the hand so that cards of the same suit are
	    * grouped together, and within a suit the cards are sorted by value.
	    * Note that aces are considered to have the lowest value, 1.
	    */
	   public void sortBySuit() {
		  int size = count;
		  int nonnull = 0;
		  int index = 0;
		  
	      Card[] newHand = new Card[5];
	      while (size > 0) {
			 if (hand[nonnull] == null) { nonnull = nonnull+1; continue;}
	         int pos = nonnull;  // Position of minimal card.
	         Card c = hand[nonnull];  // Minimal card.
			 
	         for (int i = nonnull+1; i < hand.length; i++) {
	            Card c1 = hand[i];
				if (c1 != null){
					if ( c1.getSuit() < c.getSuit() ||
							(c1.getSuit() == c.getSuit() && c1.getValue() < c.getValue()) ) {
						pos = i;
						c = c1;
					}
				}
	         }
	         hand[pos] = null;
			 size = size - 1;
	         newHand[index++] = c;
			 nonnull = 0;
	      }
	      hand = newHand;
	   }
	   
	   /**
	    * Sorts the cards in the hand so that cards of the same value are
	    * grouped together.  Cards with the same value are sorted by suit.
	    * Note that aces are considered to have the lowest value, 1.
	    */
	   public void sortByValue() {
		  int size = count;
		  int nonnull = 0;
		  int index = 0;
		  
	      Card[] newHand = new Card[5];
	      while (size > 0) {
			 if (hand[nonnull] == null) { nonnull = nonnull+1; continue;}
	         int pos = nonnull;  // Position of minimal card.
	         Card c = hand[nonnull];  // Minimal card.
			 
	         for (int i = nonnull+1; i < hand.length; i++) {
	            
				Card c1 = hand[i];
	            if (c1 != null){
					if ( c1.getValue() < c.getValue() ||
							(c1.getValue() == c.getValue() && c1.getSuit() < c.getSuit()) ) {
						pos = i;
						c = c1;
					}
				}
	         }
	         hand[pos] = null;
			 size = size - 1;
	         newHand[index++] = c;
			 nonnull = 0;
	      }
	      hand = newHand;
	   }
	   
	   public void printHand(){
		   
		   for(int i=0; i<hand.length; i++){
			   if (hand[i] != null){
				   System.out.println(hand[i]);
			   }
		   }
		   System.out.println();
	   }
	   

	   /******************************** Implement your methods here ****************************************/
	public int numPairs(){
		sortByValue(); 
		int counter=0;
		int pairs=0;
		if(this.hasFullHouse()){
			return 2;
		}else if(this.hasFourOfAKind()){
			return 2;
		}else if(this.hasTriplet()){
			return 1;
		}for(int i=1;i<=4;i++){
			if(hand[i].getValue()==hand[i-1].getValue()){
				counter++;
				if(counter>=1){
					pairs++;
					counter=0; 
					
				}
			}
					
		
		}return pairs;

			
		}
		
	
		
		
	
	public Card secondDouble(){
		sortByValue();
		Card higher=hand[0];
		Card lower=hand[0];
		
		for(int i=0;i<=3;i++){
			if(hand[i].getValue()==hand[i+1].getValue()){
				if(hand[i].getValue()==1)
					higher=hand[i];
				if(hand[i+1].getValue()==1){
					higher=hand[i+1];
				}if(hand[i].getValue()>higher.getValue()){
					higher=hand[i];
			}if(hand[i].getValue()<higher.getValue()){
				higher=hand[i];
			}
			return hand[i]; //
		} 
			
		}
		for(int i=0;i<=3;i++){
			if(hand[i].getValue()==hand[i+1].getValue()&&hand[i]!=higher){
				lower=hand[i];
				return hand[i];
	
		}
		}
		return null; //
	}

		public boolean hasTriplet(){
			sortByValue();
			int num = 1;
			for(int i=1;i< hand.length; i++){
				if(hand[i].getValue() == hand[i-1].getValue())
				{
					num ++;
				}
				else
				{
					num = 1;
				}
				if(num >= 3)
				{
					return true;
				}
			}
			return false;
		}
	public int tripValue(){
		int triplets;
		if(hand[0]==hand[1]&&hand[2]==hand[3]&&hand[2]==hand[4]){
			triplets=hand[2].getValue(); 
			return triplets;
		}if(hand[0]==hand[1]&&hand[0]==hand[2]&&hand[3]==hand[4]){
			triplets=hand[0].getValue(); 
			return triplets;
		}
		return 0;
		
	}
		
		
		public boolean hasFlush(){
			int suit=hand[0].getSuit(); 
			for(int i= 1;i<=4;i++){
				if(suit!=hand[i].getSuit()){
					return false;
				}
			}
			return true;
			
		}
public boolean hasStraight(){
sortByValue();
	if (hand[0].getValue() == 1 && hand[1].getValue() == 10 && hand[2].getValue() == 11 && hand[3].getValue() == 12 && hand[4].getValue() == 13) {
		return true;
	} 
	
	if (hand[0].getValue()+4 == hand[4].getValue() && hand[1].getValue()+3 == hand[4].getValue() && hand[2].getValue()+2 == hand[4].getValue() && hand[3].getValue()+1 == hand[4].getValue()) {
		return true;
	}
	
	return false;
	
}
//HAS FULL HOUSE 
public boolean hasFullHouse(){
	sortByValue();
	if (hand[0].getValue() == hand[1].getValue() && hand[0].getValue() == hand[2].getValue() && hand[3].getValue() == hand[4].getValue()) {
		return true;
	} if (hand[0].getValue() == hand[1].getValue() && hand[2].getValue() == hand[3].getValue() && hand[2].getValue() == hand[4].getValue()) {
		return true;
	}
	
	return false;
	
	
}
public boolean hasFourOfAKind(){
	int counter=0;
	sortByValue();
	for(int i=0;i<=4;i++){
		for(int j=1; j<=4;j++){
			if(hand[i].getValue()==hand[j].getValue()){
				counter ++;
				if(counter==4){
					return true; 
				} else {
					return false;
				}
			}  
		}
		
	}
	return false;
}
public int fours(){
	sortByValue(); 
	int value= 0; 
	if(hand[0]==hand[1]&&hand[0]==hand[2]&&hand[0]==hand[3]){
		value=hand[0].getValue(); 
		return value;
	}if(hand[1]==hand[2]&&hand[1]==hand[3]&&hand[1]==hand[4]){
		value=hand[4].getValue();
		return value;

	
	}
	return 0;
}
	public Card highestValue(){
		sortByValue(); 
		if(hand[0].getValue()==1){
			return hand[0];
			}else return (hand[4]); 
		}


public Card highestDuplicate(){	
	sortByValue();
	int p = 0;
	int num = 0;
	Card temp = new Card();
	Card temp2 = new Card();
	for(int i = 1; i < hand.length; i ++)
	{
		if(hand[i-1].getValue() == hand[i].getValue())
		{
		p ++;
		temp2 = hand[i-1];
		}
	if(temp2.getValue() == 1 && p > 0)
	{
		return temp2;
	}
	if(p >= num)
	{
		if(temp2.getValue() > temp.getValue())
		{
			temp = hand[i-1];
		}
		p = 0;
		num = p;
	}
	}
	if(num == 0)
	{
		return null;
	}
	return temp;
}
	public boolean royalFlush(){
		sortByValue(); 
		if(hand[0].getValue()==1&&hand[1].getValue()==10&&hand[2].getValue()==11&&hand[3].getValue()==12&&hand[4].getValue()==13&&hand[0].getSuit()==hand[1].getSuit()&&hand[0].getSuit()==hand[2].getSuit()&&hand[0].getSuit()==hand[3].getSuit()&&hand[0].getValue()==hand[4].getValue()){
			return true; 	
		}return false;
	}
	public boolean straightFlush(){
		if(hasStraight()&&hasFlush()){
			return true;
		}	return false; 
		
	}
	public int compareTo(Hand h){
		this.sortByValue();
		h.sortByValue();
		if(this.hasStraight() && this.hasFlush() && h.hasStraight() && this.hasFlush() && hand[0].getValue() == 1 && h.hand[0].getValue() == 1 && hand[1].getValue() == 10 && h.hand[1].getValue() == 10)
		{
			return 0;
		}
		else if(h.hasStraight() && h.hand[0].getValue() == 1 && h.hand[1].getValue() == 10)
		{
			return -1;
		}
		else if(this.hasStraight() && this.hand[0].getValue() == 1 && hand[1].getValue() == 10)
			return 1;
		else if(this.hasStraight() && this.hasFlush() && h.hasStraight() && h.hasFlush())
				{
			for(int i = hand.length-1; i > -1; i--)
			{
				if(hand[i].getValue() > h.hand[i].getValue())
				{
					return 1;
				}
				else if(hand[i].getValue() < h.hand[i].getValue())
				{
					return -1;
				}
			}
			return 0;
				}
		else if(this.hasStraight() && this.hasFlush())
		{
			return 1;
		}
		else if(h.hasStraight() && h.hasFlush())
		{
			return -1;
		}
		
		//STRAIGHT FLUSH 
		if(this.straightFlush()&&h.straightFlush()){
			
			if(this.highestValue().getValue()==1&&h.highestValue().getValue()!=1){
				return 1;
		}else if(this.hand[4].getValue()>h.hand[4].getValue()){
			return 1;
		}else if(h.hand[4].getValue()>this.hand[4].getValue()){
			return -1; 
		}else if(this.hand[4].getValue() == h.hand[4].getValue()) {
			return 0;
		}
//FOUR OF A KIND 
			
		}
		else if(this.straightFlush())
		{
			return 1;
		}
		else if(h.straightFlush())
		{
			return -1;
		}
		if(this.hasFourOfAKind() && h.hasFourOfAKind())
		{
		if(this.hand[0].getValue() == 1 && h.hand[0].getValue() == 1)
		{
			if(hand[hand.length-1].getValue() > h.hand[hand.length-1].getValue())
			{
				return 1;
			}
			else if(hand[hand.length-1].getValue() < h.hand[hand.length-1].getValue())
			{
				return -1;
			}
			return 0;
		}
		else if(this.hand[0].getValue() == 1)
		{
			return 1;
		}
		else if(h.hand[0].getValue() == 1)
		{
			return -1;
		}
		}
	    if(this.fours()>h.fours()){
			return 1; 
		}else if(h.fours()>this.fours()){
			return -1;
		}else if(this.fours()==h.fours() && this.fours() != 0){
			return 0;
		}
		
	//FULL HOUSE 
			if(this.hasFullHouse()&&h.hasFullHouse()){
		 if(this.tripValue()==h.tripValue()){
			if(this.tripValue()==1){
				return 1;
			}if(h.tripValue()==1){
				return 1;
			}else if(this.tripValue()>h.tripValue()){
				return 1;
			}else if(h.tripValue()>this.tripValue()){
				return -1;
			}
		 }
			}
	//FLUSH
				if(this.hasFlush()&&h.hasFlush()){
			if(highestValue().getValue()==1&&h.highestValue().getValue()!=1){
				return 1;
			}else if(h.highestValue().getValue()==1&&this.highestValue().getValue()!=1){
				return -1;
			}
			else
			{
				for(int i = hand.length-1; i > -1; i--)
				{
					if(hand[i].getValue() > h.hand[i].getValue())
					{
						return 1;
					}
					else if(hand[i].getValue() < h.hand[i].getValue())
					{
						return -1;
					}
				}
				return 0;
			}
		}
//STRAIGHT 
		if(this.hasStraight()&&h.hasStraight()){
			if(hand[0].getValue() == 1 && h.hand[0].getValue() == 1)
			{
				for(int i = hand.length-1; i > -1; i--)
				{
					if(hand[i].getValue() > h.hand[i].getValue())
					{
						return 1;
					}
					else if(hand[i].getValue() < h.hand[i].getValue())
					{
						return -1;
					}
				}
				return 0;
			}
		}
		else if(this.hasStraight())
		{
			return 1;
		}
		else if(h.hasStraight())
		{
			return -1;
		}
		
		//3 OF A KIND 
		if(this.hasTriplet()&&h.hasTriplet()){
			if(this.hasTriplet() && h.hasTriplet())
			{
				if(hand[0].getValue() == 1 && h.hand[0].getValue() == 1)
				{
					for(int i = hand.length-1;i > -1; i--)
					{
						if(hand[i].getValue() > h.hand[i].getValue())
						{
							return 1;
						}
						else if(hand[i].getValue() < h.hand[i].getValue())
						{
							return -1;
						}
					}
				}
				else if(hand[0].getValue() == 1)
				{
					return 1;
				}
				else if(h.hand[0].getValue() == 1)
				{
					return -1;
				}
				else
				{
					for(int i = hand.length-1;i > -1; i--)
					{
						if(hand[i].getValue() > h.hand[i].getValue())
						{
							return 1;
						}
						else if(hand[i].getValue() < h.hand[i].getValue())
						{
							return -1;
						}
					}
				}
				
				return 0;
			}
			else if(this.hasTriplet())
			{
				return 1;
			}
			else if(h.hasTriplet())
			{
				return -1;
			}
			//2 PAIRS 
		}
		if(this.numPairs() == h.numPairs() && this.numPairs() != 0)
		{
			if(hand[0].getValue() == 1 && h.hand[0].getValue() == 1)
			{
				for(int i = hand.length-1;i>-1;i--)
				{
					if(hand[i].getValue() > h.hand[i].getValue())
					{
						return 1;
					}
					else if(hand[i].getValue() < h.hand[i].getValue())
					{
						return -1;
					}
				}
				return 0;
			}
			else if(hand[0].getValue() == 1)
			{
				return 1;
			}
			else if(h.hand[0].getValue() == 1)
			{
				return -1;
			}
			if(this.highestDuplicate().getValue() > h.highestDuplicate().getValue())
			{
				return 1;
			}
			else if(this.highestDuplicate().getValue() > h.highestDuplicate().getValue())
			{
				return -1;
			}
			else
			{
				
				for(int i = hand.length-1;i>-1;i--)
				{
					if(hand[i].getValue() > h.hand[i].getValue())
					{
						return 1;
					}
					else if(hand[i].getValue() < h.hand[i].getValue())
					{
						return -1;
					}
				}
				return 0;
						
			}
			
			
		}
		else if(this.highestValue().getValue()>h.highestValue().getValue()){
			return 1;
		}else if(h.highestValue().getValue()>this.highestValue().getValue()){
			return -1; 
		}
		else
			{
			for(int i = hand.length-1;i>-1;i--)
			{
				if(hand[i].getValue() > h.hand[i].getValue())
				{
					return 1;
				}
				else if(hand[i].getValue() < h.hand[i].getValue())
				{
					return -1;
				}
			}
			return 7;
			}
	}
	}
	
