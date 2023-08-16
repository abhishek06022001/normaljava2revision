package Inheritance;

public class Child extends Parent {
   public void changeVariable() {
       // parentVariable = 20; // Changing the inherited variable
    }
   // private int id = 3;
    
    public Child(int a){
        super(a);
     System.out.println();
     
    }
    @Override
    public int getid(){
        return this.id;
    }
   
  
}
