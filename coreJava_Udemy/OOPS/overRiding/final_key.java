package coreJava_Udemy.OOPS.overRiding;

public class final_key {
    final int a=10;
    int aa=10;
   final void display(int a){
       System.out.println("The final method"+a);
   }


}
class maiin{
    public static void main(String[] args) {
        final_key c=new final_key();
       // c.a=20; cant assign value to final variable
        c.display(20);
    }
}

