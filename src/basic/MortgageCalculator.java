package basic;

import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator  {

    public static final String userName = "Shuvro";

    public static void main(String[] args) {

        Palindrome pa=new Palindrome();
        System.out.println(pa);
//        int principal=(int)readData("Principal: ",1000,1_000_000);
//        int period=(int)readData("Period (Years): ",1,30);
//        double interest=readData("Annual interest: ",0,10);
//        double mortgage=calculateMortgage(principal,interest,period);
//        System.out.print("Mortgage: " + NumberFormat.getCurrencyInstance().format(mortgage));
    }
    public static double readData(String prompt,double min,double max){
        Scanner sc=new Scanner(System.in);
        double value;
        while (true) {
            System.out.print(prompt);
            value= sc.nextDouble();
            if ( value>= min && value <= max)
                break;
            System.out.println("Enter a number between "+min+" and "+max);
        }
    return value;
    }
    public static double calculateMortgage(int principal, double interest, int period) {
        double r = 0;
        double n = 0;
        r = (interest / 100) / 12;
        n = period * 12;
        double mortgage = (double) principal * ((r * (Math.pow((1 + r), n))) / (Math.pow((1 + r), n) - 1));
        return mortgage;
    }
//        boolean is=true;
//        System.out.println(!is);
//
//        String []fruits={"Apple","Mango","Banana"};
//        for(String f:fruits){
//            System.out.println(f);
//        }

}
