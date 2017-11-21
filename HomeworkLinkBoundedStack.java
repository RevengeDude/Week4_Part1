
import ch02.stacks.*;
import support.LLNode;
public class HomeworkLinkBoundedStack<T> extends LinkedStack<T> {

   public String stringSome(){
   String s = "";
   LLNode<T> currentVar = top;
   while (currentVar != null)
   {
      s = s + currentVar.getInfo().toString();
      currentVar = currentVar.getLink();
      
   }
  return s;
   }
    
      // while loop with +1 to walk through a linked list\
    
   public int itemSize(){
   int s = 0;
   LLNode<T> currentVar = top;
   while (currentVar != null)
   {
      s = s + 1;
      currentVar = currentVar.getLink();
   }
  return s;
   }
   
//Pop all units on stack
   public void popSome(int count) {
  
   LLNode currentVar = top;
  while(count > 0)
   {
  count--;
  if (top != null) {
   top = top.getLink();
   }
   }   
      }  
 
 //Pop Top item
  public T poptop(){
  LLNode<T> currentVar = top;
  T temp = null;
  
    if (top != null) {
    temp = top.getInfo();
   top = top.getLink();
   }
   else{
   }
   return temp;
   }
   
   //Swap first two items
 public boolean swapStart(){
 /*
 HomeworkLinkBoundedStack<String> myStack; 
 myStack = new HomeworkLinkBoundedStack();
 */
      if(top == null)
         return false;
         else if(top.getLink() == null){
         return false;
         }
      else {
      LLNode<T> topValue = top;
      top = top.getLink();
      LLNode<T> topValueTwo = top;
      top = top.getLink();
      push(topValue.getInfo());
      push(topValueTwo.getInfo());
      return true;
           }

   }   

 
 
 
      
      
  // pop();
  // return top.getLink;
  
      // loop through elements, count times, and remove items
      // Or, call pop() count times
            
        /*    
   public boolean swapStart(){
      if(isEmpty() || topIndex == 0)
         return false;
      else {
      // swap elements[topIndex] and elements[topIndex-1];
      T tempValue = elements[topIndex];
      elements[topIndex] = elements[topIndex - 1];
      elements[topIndex - 1] = tempValue;
      return true;
     }
   }   
   public T poptop(){
      // remove item at topIndex and reduce # of items by 1
      if(isEmpty())
         return null;
         
      T item = elements[topIndex];
      elements[topIndex] = null;
      topIndex -= 1;
      return item;
   }
   */
}