import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.*;
import java.util.stream.Collectors;

class MyTask implements Runnable{
    @Override
    public void run(){
        for (int i=0;i<15;i++)
        System.out.println("how are you ");
    }
}

public class StringSoluation {
    static Scanner sc=new Scanner(System.in);

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter a Integer number to see it's Factorial value");
        int number=input.nextInt();
        int fact=1;
        for (int i=1;i<=number;i++){
            fact=fact*i;
        }
        System.out.print("Anwser is:: "+fact);

        int [] numbers={1,2,3,2,4,5,1};
        Set<Integer>numberSet=new HashSet<Integer>();
        for(int i :numbers){
            numberSet.add(i);
        }
        System.out.println(numberSet);




//        Thread task=new Thread(new MyTask());
//        System.out.println("1st print");
//        task.start();
//        for (int a=0;a<15;a++)
//        System.out.println("111111");
        //reverseStringForLoop();
        //reverseStringSringBuffer();
        //reverseWordsOfSentence();
        //checkAnagarm();
        //findCharPercentInString();
        //findSameCharInString();
    }

    public static void reverseStringSringBuffer(){
        System.out.println("Enter String to reverse");
        String input=sc.nextLine();
        StringBuffer sb=new StringBuffer(input);
        System.out.println(sb.reverse());
    }

    public static void reverseStringForLoop (){
        System.out.println("Enter the String to reverse");
        String input=sc.nextLine();
        char [] ch=input.toCharArray();
        for (int i=ch.length-1;i>=0;i--){
            System.out.print(ch[i]);
        }
    }

    public static void reverseWordsOfSentence(){
        System.out.println("Enter the sentence ot reverse the words");
        String input=sc.nextLine();
        String [] splitInput=input.split(" ");
        for(int i=0;i<splitInput.length;i++){
            char [] ch=splitInput[i].toCharArray();
            for (int j=ch.length-1;j>=0;j--){
                System.out.print(ch[j]);
            }
            System.out.print(" ");
        }
    }
    //My name is Shuvro &  10/3=3.33333 3.33
    public static  void findCharPercentInString(){
        double a=10.55555555;
        System.out.format("%.2f",a);
        String st=sc.nextLine();
        st=st.replace(" ","");
        int totalChar=st.length();
        int upperCaseLetters= 0;
        int lowerCaseLetters=0;
        int digits=0;
        int others=0;
        for (int i=0;i<st.length();i++){
            if (Character.isUpperCase(st.charAt(i))){
                upperCaseLetters++;
            }
            else if (Character.isLowerCase(st.charAt(i))){
                lowerCaseLetters++;
            }
            else if (Character.isDigit(st.charAt(i))){
                digits++;
            }
            else {
                others++;
            }
        }
        System.out.println("Total Character in the String is:: "+totalChar);
        System.out.println("Total Uppercase Letters:: "+upperCaseLetters);
        System.out.println("Total Lowercase Letters:: "+lowerCaseLetters);
        System.out.println("Total Digits Letters:: "+digits);
        System.out.println("Total Special Letters:: "+others);

    }

    public static void checkAnagarm(){
        System.out.print("Enter the First word:: ");
        String firstWord=sc.nextLine().toLowerCase();
        System.out.print("Enter the Second word:: ");
        String secondWord=sc.nextLine().toLowerCase();
        char [] fW=firstWord.toCharArray();
        char [] sW=secondWord.toCharArray();
        Arrays.sort(fW);
        Arrays.sort(sW);
        if (fW.length!=sW.length){
            System.out.println("not anagram");
        }else {
            for (int i = 0; i < fW.length; i++) {
                if (fW[i] != sW[i]) {
                    System.out.println("not Anagram");
                }
            }
            System.out.println("anagram");
        }
        }//Arrays.equals(fW,sW);

    public static void findSameCharInString(){
        System.out.println("Enter the Sentence to find out character repeation ::: ");
        String st=sc.nextLine().toLowerCase();
        int count=0;
        st=st.replace(" ","");
        HashMap<Character,Integer> hashMap=new HashMap<>();
        char [] ch=st.toCharArray();
        Arrays.sort(ch);
        for (int i=0;i<ch.length;i++){
            if(hashMap.containsKey(ch[i]))
            hashMap.put(ch[i],hashMap.get(ch[i])+1);
            else
                hashMap.put(ch[i],1);
        }
        System.out.println(hashMap);
        }

 }






