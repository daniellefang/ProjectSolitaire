import java.awt.*;
import java.awt.event.*;
import java.applet.*;

class Link
{
  private Object valueField;
  private Link   nextLink;

  public Link (Object newValue, Link next)
  {
    valueField = newValue;
    nextLink   = next;
  }
  
  // get Object part of link
  public Object value()
  {
    return valueField;
  }

  // get Link part of link
  public Link next()
  {
    return nextLink;
  }
}
