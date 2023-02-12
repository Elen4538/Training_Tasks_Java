package MyExamples;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Numbers n1 = new Numbers();
        Numbers n2 = new Numbers();
        Numbers n3 = new Numbers();
        boolean flag = true;
        Scanner sc = new Scanner(System.in);

        while(flag) {
            // enter number
            System.out.println("Enter first number:");
            n1.setN1(sc.nextDouble());

            //enter sign
            System.out.println("Enter operation sign '*' or '/' or '+' or '-' ");
            n3.setSgn(sc.next());

            //enter num
            System.out.println("Enter second number:");
            n2.setN2(sc.nextDouble());

            System.out.println("Output:");

            switch (n3.getSgn()) {
                case "+":
                    System.out.println(Numbers.addition(n1.getN1(), n2.getN2()));
                    break;
                case "-":
                    System.out.println(Numbers.substract(n1.getN1(), n2.getN2()));
                    break;
                case "*":
                    System.out.println(Numbers.mult(n1.getN1(), n2.getN2()));
                    break;
                case "/":
                    System.out.println(Numbers.division(n1.getN1(), n2.getN2()));
                    break;
            }
            System.out.println("Do you want to do more operations? \n Answer Y or N");
            String answer = sc.next();

            if(answer.equals("Y")){}
            else {flag = false;}

        }
        
        sc.close();

    }


}
