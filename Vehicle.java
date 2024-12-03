//parent class
public class Vehicle {
    void start(){
        System.out.println("Vehicle is starting....");
    }
    void stop(){
        System.out.println("The Vehicle is Stoping....");
    }
}
//class child1.
class car extends Vehicle{
    void openTruck(){
        System.out.println("The Truck is Open.");
    }
}
//class child2.
class bike extends Vehicle{
    void kickStart(){
        System.out.println("The Bike is start.");
    }
}
//class child3
class truck extends Vehicle{
    void loadCargo(){
        System.out.println("The cargo is loading.");
    }
}

//main class
class main{
    public static void main(String[] args){
        //car object
        car car = new car();
        car.start();
        car.openTruck();
        car.stop();
        System.out.println();

        //bike object
        bike bike = new bike();
        bike.start();
        bike.kickStart();
        bike.stop();
        System.out.println();

        //truck object
        truck truck = new truck();
        truck.start();
        truck.loadCargo();
        truck.stop();
        System.out.println();
    }
}

