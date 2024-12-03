//This is the example of single inheritance

public class  parent{
    String name = "parent";

    void display(){
        System.out.println("This is the Parent Class");
    }
}

class child extends parent{
    
    void greet(){
        System.out.println("Hello from the child class");
    }

    public static void main(String[] args) {
        child child = new child(); //object created
        
        child.display(); //methods
        child.greet();
    }
   
}



