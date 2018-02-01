package ps2.pkg1;

interface CardDeckInterface
{
    //return the top card of the deck
    public Card draw();
        
    //shuffle the deck
    public void shuffle();
    
    //the number of cards remaining in the deck
    public int  size();
}
