import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindFibonacciNumber extends StringSoluation {

    public static void main(String[] args) {
        primeNumber();
        example();
        printNthFibonacciNumbers();

    }

    public static void primeNumber(){
        List<Integer> listOfPrimeNumber=new ArrayList<>();
        for (int n = 1; n<=100; n++){
            int prime = 0;
            for (int i=2;i<=n/2;i++) {
                if (n%i == 0){
                    prime = 1;
                    break;
                }
            }if (prime==0){
                listOfPrimeNumber.add(n);
            }
        }
        System.out.println(listOfPrimeNumber);

    }

    public static void example(){
        String sentence="aabbaaccdfff";
        int count=1;
        char [] characters=sentence.toCharArray();
        for (int i=0;i<characters.length;i++){
            if(i==characters.length-1){
                System.out.print(characters[i]+""+count);
                break;
            }else if(characters[i]==characters[i+1]){
                count++;
            }else {
                System.out.print(characters[i]+""+count);
                count=1;
            }
        }
    }

       public static void printNthFibonacciNumbers(){
            Scanner sc=new Scanner(System.in);
           System.out.println("Enter a positive number to see the Fibonacci series:");
           int inputNumber=sc.nextInt();//10
           int firstNumber=0;
           int secondNumber=1;
           int thirdNumber=0;
           System.out.print("Fibonacci Series of "+inputNumber+" Numbers is:: 0 1");
           for(int i=1;i<=inputNumber-2;i++){
               thirdNumber=firstNumber+secondNumber;
               firstNumber=secondNumber;
               secondNumber=thirdNumber;
               System.out.print(" "+thirdNumber);//or we can print firstNumber
           }

       }

       public static void findNumberIsFibonacciOrNot(){
           Scanner sc = new Scanner(System.in);
           System.out.println("Enter positive number :");
           int inputNumber = sc.nextInt();
           int firstTerm = 0;
           int secondTerm = 1;
           int thirdTerm = 0;
           while (thirdTerm < inputNumber) {
               thirdTerm = firstTerm + secondTerm;
               firstTerm = secondTerm;
               secondTerm = thirdTerm;
           }
           if(thirdTerm == inputNumber) {
               System.out.println("Number belongs to Fibonacci series");
           }
           else {
               System.out.println("Number doesn't belongs to Fibonacci series");
           }
       }


}



