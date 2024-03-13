// An implementation of IntStack that uses fixed storage.
class FixedStack implements IntStack {
  private int stck[];
  private int tos;
  // allocate and initialize stack
  FixedStack(int size) {
    stck = new int[size];
tos = -1; }
  // Push an item onto the stack
  public void push(int item) {
    if(tos==stck.length-1) // use length member
      System.out.println("Stack is full.");
    else
      stck[++tos] = item;
}
  // Pop an item from the stack
  public int pop() {
    if(tos < 0) {
      System.out.println("Stack underflow.");
      return 0;
} else
      return stck[tos--];
  }
}


// Implement a "growable" stack.
class DynStack implements IntStack {
  private int stck[];
  private int tos;
  // allocate and initialize stack
  DynStack(int size) {
    stck = new int[size];
tos = -1; }
  // Push an item onto the stack
  public void push(int item) {
    // if stack is full, allocate a larger stack
    if(tos==stck.length-1) {
      int temp[] = new int[stck.length * 2]; // double size
      for(int i=0; i<stck.length; i++) temp[i] = stck[i];
      stck = temp;
      stck[++tos] = item;
    }
    else
      stck[++tos] = item;
}
  // Pop an item from the stack
  public int pop() {
    if(tos < 0) {
      System.out.println("Stack underflow.");
      return 0;
} else
      return stck[tos--];
  }
}


/* Create an interface variable and
   access stacks through it.
*/
class IFTest3 {
  public static void main(String args[]) {
    IntStack mystack; // create an interface reference variable
    DynStack ds = new DynStack(5);
    FixedStack fs = new FixedStack(8);
    mystack = ds; // load dynamic stack
    // push some numbers onto the stack
    for(int i=0; i<12; i++) mystack.push(i);
    
           mystack = fs; // load fixed stack
           for(int i=0; i<8; i++) mystack.push(i);
           
           mystack = ds;
           System.out.println("Values in dynamic stack:");
           for(int i=0; i<12; i++)
              System.out.println(mystack.pop());
              
           mystack = fs;
           System.out.println("Values in fixed stack:");
           for(int i=0; i<8; i++)
              System.out.println(mystack.pop());
         }
}

