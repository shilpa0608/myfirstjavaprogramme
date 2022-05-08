
public class Polymorphism {
    public static void main(String[] args) {
        System.out.println("Vehicle       6 Wheels");
        Car c= new Car();/* Bus b=new Bus;  b.noOfWheels();*/
        c.noOfWheels();
    }
}
class Vehicle{
public void noOfWheels() {
    System.out.println("Vehicle        6 wheels");
}
}

/*class Bus extends Vehicle{
 public void noOfWheels() {
 System.out.println("Bus          6 wheels");
 }
}*/

class Car extends Vehicle{
    public void noOfWheels() {
        System.out.println("Car            4 Wheels");
    }
}
