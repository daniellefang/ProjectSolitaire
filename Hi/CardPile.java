import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class CardPile 
{
  private int x;
  private int y;
  
  private LinkedList cardList;

  public CardPile (int xl, int yl) 
  {
    x = xl;
    y = yl;
    cardList = new LinkedList();
  }

  public final boolean empty() 
  { 
    return cardList.empty();
  }

  public final Card top() 
  { 
    return (Card)cardList.front();
  }

  // pop card at the top of pile
  public final Card pop() 
  {
    return (Card)cardList.pop();
  }

  // If the point is inside pile, it is true
  public boolean includes (int tx, int ty) 
  {
    return x <= tx && tx <= x + Card.width &&
           y <= ty && ty <= y + Card.height;
  }
        
  // it will be used by child class
  public void select (int tx, int ty) 
  {
    // do nothing
  }

  public void addCard (Card aCard) 
  {
    cardList.add(aCard);
  }

  // draws pile
  public void draw (Graphics g, int x, int y){
    g.setColor(Color.black);

    if (cardList.empty())
      g.drawRect(x, y, Card.width, Card.height);
    else
      top().draw(g, x, y);
  }

  // to be overridden by descendants
  public boolean canTake (Card aCard) 
  {
    return false; 
  }

  // get number of cards in pile
  public int getNoCards()
  {
    int count = 0;
    ListIterator iterator = cardList.iterator();

    while (!iterator.atEnd())
      {
	count++;
	iterator.next();
      }

    return count;
  }

}
