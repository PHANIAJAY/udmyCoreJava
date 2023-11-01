package coreJava_Udemy.OOPS.Encapsulation;

public class A {
    private int sa;

    public int getSa() {
        return sa;
    }

    public void setSa(int sa) {
        if(sa<1000){
            this.sa=0;
        }
        else{
        this.sa = sa;}
    }
}
