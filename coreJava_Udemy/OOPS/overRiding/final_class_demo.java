package coreJava_Udemy.OOPS.overRiding;

final public class final_class_demo {
    final int a = 10;
    int aa = 10;
    final void display(int a){
        System.out.println("The final method"+a);
    }
    //a=10;
    //aa = 20;
}

//cant inherit the class which is final.
//ucomment below to see..u get the red line and hover on it
//public class child extends final_class_demo{
//
//}
