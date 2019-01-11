
public class Player {
	private Hand hand = new Hand(); 
	private double balance; 
	
public Player(double balance){
	 this.balance=balance;

}
public void deal(Card c){
	hand.addCard(c);
		
}public Card[]discard(){
	System.out.println("How many cards would you like to discard?");
	int amountRemoved=0;
	int position=0;
	Card[]discard=new Card[amountRemoved];
if(amountRemoved==0){
	return discard; 
}
	for(int i=0;i< amountRemoved;i++){
position=0;
	
	
	discard[i]=hand.getCard(position);
	hand.removeCard(position);
}return discard; 
}
	
	
	public double wager(double min){ 
	return -1; 
		}
	

	public Hand showHand(){
		return hand; 
	

}public double getBalance(){
	return balance; 
	
}public void winnings(double amount){
	balance+=amount; 
	hand.clear();
}

}


