package generic;

public class genericprinter<T> {
    T id ; 
    public genericprinter(T id){
     this.id = id;  
    }
    public T getid(){
        return id;
    }
}
