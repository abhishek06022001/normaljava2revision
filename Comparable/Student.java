package Comparable;

public class Student implements Comparable<Student> {
    public final int id ; 
    public final String name ; 
    public Student(int id , String name){
        this.id= id;
        this.name= name;

    }
    @Override
    public int compareTo(Student o) {
      if(o.name.charAt((1)) > this.name.charAt((1))){
        return 1;
      }else{
        return -1;
      }
    }
   
    
}
