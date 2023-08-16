package Lambda;

import Inheritance.Child;
import Inheritance.Parent;

public class Main {
    public static void main(String[] args) {
        Parent dad =  new Child(9);
        System.out.println( "i expect parent id 9= "+dad.id );
        System.out.println("i expect child id which is 9="+ dad.getid());
      
      

        
    }
    
}
