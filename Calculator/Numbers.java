package Calculator;

public class Numbers {
    private double n1;
    private double n2;
    private String sgn;

    // set field

    public  void setN1(double n1){
        this.n1 = n1;
    }
    public void setN2(double n2){
        this.n2 = n2;
    }

    public void setSgn(String sgn){
        this.sgn = sgn;

    }
    //get fields
    public String getSgn() {
        return sgn;
    }
    public double getN1() {
        return n1;
    }
    public double getN2() {
        return n2;
    }

    // operations
    public static double mult(double n1,double n2) {
        return n1*n2;
    }
    public static double substract(double n1,double n2) {
        return n1-n2;
    }
    public static double addition(double n1,double n2) {
        return ( n1 + n2);
    }
    public static double division(double n1,double n2) {
        return n1/n2;
    }
}
