//import JavaHomework.Week3Part2.attempt1.*;
public class TheStackDriverLink {
  public static void main(String[] args) {
   HomeworkLinkBoundedStack<Integer> stackdriver = new HomeworkLinkBoundedStack<>();
 
    stackdriver.push(1);
    stackdriver.push(2);
    stackdriver.push(3);    
    stackdriver.push(4);
    stackdriver.push(5);
    stackdriver.push(6);

    System.out.println("Original Items");
    System.out.print("Item Size: ");
    System.out.println( stackdriver.itemSize() );
    System.out.print("String Numbers: ");
    System.out.println( stackdriver.stringSome() );
    stackdriver.popSome(2);

    System.out.println("");
    System.out.println("After Pop");
    System.out.print("String Numbers: ");
    System.out.println( stackdriver.stringSome() );
    System.out.print("Item Size: ");
    System.out.println( stackdriver.itemSize() );
    
    System.out.println("");
    System.out.println("After Pop Top: ");
    System.out.print("Top Item Deleted: ");
    System.out.println( stackdriver.poptop().toString() );
    System.out.print("Item Size: ");
    System.out.println( stackdriver.itemSize() );
    System.out.print("String Numbers: ");
    System.out.println( stackdriver.stringSome() );

    System.out.println("");
    System.out.println( stackdriver.swapStart());
    System.out.print("Item Size: ");
    System.out.println( stackdriver.itemSize() );
    System.out.print("String Numbers: ");
    System.out.println( stackdriver.stringSome() );

          /*
    System.out.println( stackdriver.swapStart() );
    */
  }
}
