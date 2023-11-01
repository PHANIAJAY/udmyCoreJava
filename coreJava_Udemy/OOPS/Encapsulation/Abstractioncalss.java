package coreJava_Udemy.OOPS.Encapsulation;

public class Abstractioncalss {
    public static void main(String[] args) {
        A a = new A();
        System.out.println("value in var is "+a.getSa());
        a.setSa(100);
        System.out.println("value in var is "+a.getSa());
        a.setSa(1001);
        System.out.println("value in var is "+a.getSa());
    }
}
//encapsulation:feature which wrapps up data and code in single unit