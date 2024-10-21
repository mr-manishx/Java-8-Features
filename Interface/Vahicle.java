interface Vahicle{

    public abstract void start();

    public abstract void run();

    default void driver(){
        // if interface has default or static method so no need to Override in implements class
        System.out.println("driver method call to Car class object");
    }
    public static void clean(){
        // if interface has default or static method so no need to Override in implements class
        // and Static method call using interface class (Vahicle)

        System.out.println("This is clean method with static keyword");
    }
}

class Car implements Vahicle{

    @Override
    public void start(){
        System.out.println("Car class implements Vahicle interface with abstract start() method..");
    }
    @Override
    public void run(){
        System.out.println("run method execute in Car class");
    }
}

class Bus implements Vahicle{

    @Override
    public void start(){
        System.out.println("Bus Class implements Vahicle interface so here override start method");
    }
    @Override
    public void run(){
        System.out.println("Bus Class implements Vahicle interface so here override run method");
    }
}

class Test{
    public static void main(String[] args){

        Car car = new Car();
        Bus bus = new Bus();

        car.start();
        car.run();

        bus.start();
        bus.run();

        Vahicle.clean();

        car.driver();
    }
}