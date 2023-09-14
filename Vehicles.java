package VehiclesExercise;

public class Vehicles {
    public static void main(String[] args) {

        System.out.println("------------------------------");
        System.out.println("------------------------------");

        Car car = new Car("Base car", 8);
        System.out.println(car.getName());
        System.out.println(car.getCylinders());
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        System.out.println("------------------------------");
        System.out.println("------------------------------");


        Mitsubishi mitsubishi = new Mitsubishi("Out lander VRX 4WD", 6);
        System.out.println(mitsubishi.getName());
        System.out.println(mitsubishi.getCylinders());
        System.out.println(mitsubishi.startEngine());
        System.out.println(mitsubishi.accelerate());
        System.out.println(mitsubishi.brake());

        System.out.println("------------------------------");
        System.out.println("------------------------------");

        Holden holden = new Holden("VehiclesExercise.Holden Commodore", 6);
        System.out.println(holden.getName());
        System.out.println(holden.getCylinders());
        System.out.println(holden.startEngine());
        System.out.println(holden.accelerate());
        System.out.println(holden.brake());

        System.out.println("------------------------------");
        System.out.println("------------------------------");

        Ford ford = new Ford("VehiclesExercise.Ford Falcon", 6);
        System.out.println(ford.getName());
        System.out.println(ford.getCylinders());
        System.out.println(ford.startEngine());
        System.out.println(ford.accelerate());
        System.out.println(ford.brake());

        System.out.println("------------------------------");
        System.out.println("------------------------------");
    }
}
