import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class CardPile 
{
<<<<<<< HEAD
  // coordinates of the card pile
  protected int x;
  protected int y;

  // linked list of cards
  protected LinkedList cardList;

  public CardPile (int xl, int yl) 
  {
    x = xl;
    y = yl;
    cardList = new LinkedList();
  }

  /////////////////////////////////////
  // access to cards are not overridden
  
  // true if pile is empty, false otherwise
  public final boolean empty() 
  { 
    return cardList.empty();
  }

  // inspect card at the top of pile
  public final Card top() 
  { 
    return (Card)cardList.front();
  }

  // pop card at the top of pile
  public final Card pop() 
  {
    return (Card)cardList.pop();
  }

  /////////////////////////////////////////
  // the following are sometimes overridden

  // true if point falls inside pile, false otherwise
  public boolean includes (int tx, int ty) 
  {
    return x <= tx && tx <= x + Card.width &&
           y <= ty && ty <= y + Card.height;
  }
        
  // to be overridden by descendants
  public void select (int tx, int ty) 
  {
    // do nothing
  }

  // add a card to pile
  public void addCard (Card aCard) 
  {
    cardList.add(aCard);
  }

  // draw pile
  
  {
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
=======
    // coordinates of the card pile
    protected int x;
    protected int y;

    // linked list of cards
    protected LinkedList cardList;

    public CardPile (int xl, int yl) 
    {
        x = xl;
        y = yl;
        cardList = new LinkedList();
    }

    /////////////////////////////////////
    // access to cards are not overridden

    // true if pile is empty, false otherwise
    public final boolean empty() 
    { 
        return cardList.empty();
    }

    // inspect card at the top of pile
    public final Card top() 
    { 
        return (Card)cardList.front();
    }

    // pop card at the top of pile
    public final Card pop() 
    {
        return (Card)cardList.pop();
    }

    /////////////////////////////////////////
    // the following are sometimes overridden

    // true if point falls inside pile, false otherwise
    public boolean includes (int tx, int ty) 
    {
        return x <= tx && tx <= x + Card.width &&
        y <= ty && ty <= y + Card.height;
    }

    // to be overridden by descendants
    public void select (int tx, int ty) 
    {
        // do nothing
    }

    // add a card to pile
    public void addCard (Card aCard) 
    {
        cardList.add(aCard);
    }

    // draw pile
    public void draw (Graphics g, int x, int y) {
        {
            g.setColor(Color.black);

            if (cardList.empty())
                g.drawRect(x, y, Card.width, Card.height);
            else
                top().draw(g, x, y);
        }
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
>>>>>>> eef5cb170b548c671f8d7c0dd87dfd19ab9d7e11
}
