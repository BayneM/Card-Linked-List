
public class CardList
{

  // Inner class
  // Only used by containing class
   private class CardNode
   {
   
      Card data;
      CardNode next;
   
      public CardNode(Card newCard)
      {
         data = newCard;
         next = null;
      }
   }

   // Fields
   CardNode head;
   
   // Constructors
   public CardList()
   {
      head = null;
   }

   // Methods
    public void printAllCards ()
   {
        // Start at first of list and print out each card in the list
   
    }

   public void addCardToEnd (Card c)
   {
    
   
   }
 
   public void addCardToFront (Card c)
   {
    
   
   }
   
   public void removeFirstCard()
   {
   
   }
   
   public void removeLastCard()
   {
   
   
   }
   
   



}
