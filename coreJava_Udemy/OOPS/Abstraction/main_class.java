package coreJava_Udemy.OOPS.Abstraction;

public class main_class {
    public static void main(String[] args) {
        abstract_car car=new ferrari();
        car_Repair c=new car_Repair();
        c.repair_car(car);
    }
}

//encapsulation :wrapping up of code and data into single unit.