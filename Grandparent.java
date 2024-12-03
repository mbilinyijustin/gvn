//This is the multilevel Inheritance:

public class Grandparent {
    void show(){
        System.out.println("This is the Grandparent class.");
    }
}

class parents extends Grandparent {
    void display(){
        System.out.println("This is the parent class.");
    }
}

class childs extends parents{
    void greet(){
        System.out.println("This is the child class.");
    }

}

class Main {
    public static void main(String[] args) {

        childs child = new childs();

        child.show();  //grandparent method
        child.display();  //parent method
        child.greet();  //child method
    }
}
