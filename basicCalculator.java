package Calculator;

import java.util.Scanner;

public class basicCalculator {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        double answere;
        System.out.println("********************* # WELCOME # *********************\n\n\n\n\n");
        System.out.println("ENTER YOUR FIRST OPERANT-->\t");
        double firstNumber=sc.nextDouble();
        String option=optionsCal();
            answere=sol(firstNumber,option);

        System.out.println(answere);
        System.out.println("\n\n\n\n\n********************* # THANK YOU # *********************");
    }

    public static double sol(double firstNumber,String option){
        switch (option){
            case "sin" : return Math.sin(firstNumber);
            case "cos" : return Math.cos(firstNumber);
            case "tan" : return Math.tan(firstNumber);
            case "sqrt" : return Math.sqrt(firstNumber);
            case "cbrt" : return Math.cbrt(firstNumber);

        }
        System.out.println("ENTER YOUR SECOND OPERANT-->\t");
        double secondNumber= sc.nextDouble();
        switch (option){
            case "+" : return firstNumber+secondNumber;
            case "-" : return firstNumber-secondNumber;
            case "*" : return firstNumber*secondNumber;
            case "/" :if(secondNumber!=0) return firstNumber+secondNumber;
            else return 0;
            case "pow" : return Math.pow(firstNumber,secondNumber);
            default:
                System.out.println("INVALID");
        }
        return 0;
    }


    public static String optionsCal() {
        System.out.println("(+)-->ADDITION\n(-)-->SUBTRACTION\n(*)-->MULTIPLICATION\n(/)-->DIVIDED\n(pow)--> POWER OF\n(sin)-->SIN()\n(cos)-->COS()\n(tan)-->TAN()\n(sqr)-->SQUARE ROOT\n(cbrt)-->CUBE ROOT");
        return sc.next();
    }


}
