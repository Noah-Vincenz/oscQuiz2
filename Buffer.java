import java.util.ArrayList;
public class Buffer {

  ArrayList<String> messages;

  public Buffer(){
    messages = new ArrayList();
    messages.add("Hello");
    messages.add("World");
  }

  public synchronized void moveFirstItemTo(Buffer other){
      if(!messages.isEmpty()){
          other.addItem(messages.remove(0));
      }
  }

  public /*synchronized*/ void addItem(String message){
    messages.add(message);
  }

}
