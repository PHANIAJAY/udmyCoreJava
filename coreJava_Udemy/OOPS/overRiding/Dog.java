package coreJava_Udemy.OOPS.overRiding;

public class Dog extends Aniaml{
    void display(){
        System.out.println("display of class is Dog");
    }
}
class main{
    public static void main(String[] args) {
        Aniaml A=new Aniaml();
        Dog A1=new Dog();
        A1.display();
    }
}
//control +O over ridding methods .
// overidding: the ability in java to change the defnition and implementation of parent class in  child class.
//same name differnt arguments.