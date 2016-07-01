/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package anewworld;

/**
 *
 * @author Christian Prajzner
 */
public class Area {
    
   House head;
   int size;
   
   public Area(){
       head = null;
       size = 0;
   }
   
   public void add(int x, int y) //wrapper method
   {
       if (head == null)
           head = new House(x, y);
       else{
           add(head, x, y);
       } 
       size ++;
   }
   
   // having this help method prevents us from permanently changing the head field in the public method
   private void add(House h, int x, int y){
       if (h.next == null)
           h.next = new House(x,y);
       else
           add(h.next, x, y);
   }
   
//   public House get(int index){
//       if ((index < 0) || (index >= size)){
//           throw new IndexOutOfBoundsException();
//       }
//       else if (index == 0){
//           return head;
//       }
//       else{
//           return head;//PLACEHOLDER!
//       }
//   }
   
   public House getHouse(int index){
       if ((index < 0) || (index >= size))
           throw new IndexOutOfBoundsException();
       House h = head;
       for (int i = 0; i < index; i ++)
           h = h.next;
       return h;
   }
   
   
   
   public void visitNext() // wrapper method
   {
       if (head == null)
           System.out.println("no where else to go");
       else{
           visitNext(head);
       }
   }
   
   private void visitNext (House h){
       if (h == null)
           System.out.println("end of the road");
       else{
           h = h.next;
           visitNext(h);
       }
   }
}
