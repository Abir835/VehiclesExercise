package VehiclesExercise;

class Mitsubishi extends Car{
    public Mitsubishi(String name, int cylinders){
        super(name, cylinders);
    }

    @Override
    public String startEngine(){
        return this.getClass().getSimpleName() + " ----> startEngine()";
    }
    @Override
    public String accelerate(){
        return this.getClass().getSimpleName() + " ----> accelerate()";
    }
    @Override
    public String brake(){
        return this.getClass().getSimpleName() + " ----> brake()";
    }
}