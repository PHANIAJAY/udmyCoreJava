package coreJava_Udemy.OOPS.constructors;

public class constructor_Overlaoding {
    constructor_Overlaoding(){
        System.out.println("default cons");
    }
    constructor_Overlaoding(String a){
        System.out.println("cons"+a);
    }
    constructor_Overlaoding(String a,int b){
        System.out.println("cons"+a+" "+b+"two parmarter");
    }

    public static void main(String[] args) {
        new constructor_Overlaoding();
        new constructor_Overlaoding("Ram");
        new constructor_Overlaoding("Ram",8);
    }
}
//Method Overlaoding : compile time polymorhism
