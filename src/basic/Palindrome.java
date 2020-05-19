package basic;

import org.w3c.dom.ls.LSOutput;

import javax.crypto.spec.PSource;
import java.lang.reflect.Array;
import java.security.spec.RSAOtherPrimeInfo;
import java.util.*;

public class Palindrome {
    int sum;
    public Palindrome(){
         sum=0;
        System.out.println(checkPalindrome("dad"));

    }

    //a=10,b=10,c=20 find out sum of a,b,c
    //  A equal to B and B equal to C is true or not print massage
    // And if A equal to C print your location if not print your name
    // last, Use for loop to print the value of a,b,c (hint by using Array to store the values then
    // print values or use ArrayList add() method to add the values then print the list)

    public static void solution(int a,int b,int c){
        boolean status = true;
        if ((a==b)&&(b==c)) {
                System.out.println(status);
            }
         else {
             status=false;
            System.out.println(status);
        }
        if (a == c ) {
            System.out.println("jamaica");
        } else {
            System.out.println("Shuvro");
        }

        int [] ar={a,b,c};
        for(int i=0;i<=ar.length-1;i++)
        System.out.print(ar[i]+ " ");

        var list=new ArrayList<Integer>();
        list.add(a);
        list.add(b);
        list.add(c);
        System.out.println("\n"+list);

        //reverse arraylist
        for (int i= list.size()-1;i>=0;i--){
            System.out.print(list.get(i)+" ");
        }
    }


    // if ((condition1==condition2) && (c1==c3)){massage}
    // int [] ar={value1,value2}  (declare Array and initial values)
    // var arList=new ArrayList <DataType> (); (declare ArrayList)
    // arList.add(value1) ; arList.add (value2) (add values in ArrayList)
    // for (int i=0;i<=ar.length;i++){massage print}





    //A word stay same in reverse order
    public  boolean checkPalindrome(String word) {
        boolean isPalindrome = true;
        String reverse = "";
        word = word.replace(" ", "").toLowerCase();
        for (int i = word.length() - 1; i >= 0; i--) {
            reverse += word.charAt(i);
        }
        if (!reverse.equals(word))
            isPalindrome = false;
        return isPalindrome;
    }


    static String recursiveMethod(String str) {
        if ((null == str) || (str.length() <= 1)) {
            return str;
        }

        return recursiveMethod(str.substring(1)) + str.charAt(0);//java
    }


    static void duplicateCharCount(String inputString) {
        //Creating a HashMap containing char as key and it's occurrences as value
        HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();
        //Converting given string to char array
        inputString = inputString.replace(" ", "");
        char[] strArray = inputString.toLowerCase().toCharArray();
        //checking each char of strArray
        for (char c : strArray)//c=j,c=a jav
        {
            if (charCountMap.containsKey(c)) {
                //If char is present in charCountMap, incrementing it's count by 1
                charCountMap.put(c, charCountMap.get(c) + 1);
            } else {
                //If char is not present in charCountMap,
                //putting this char to charCountMap with 1 as it's value
                charCountMap.put(c, 1);
            }
        }

        for (char ch : charCountMap.keySet()) {
            if (charCountMap.get(ch) > 1)
                System.out.println(ch + ": " + charCountMap.get(ch));
        }

        //  Getting a Set containing all keys of charCountMap
//        Set<Character> charsInString = charCountMap.keySet();
//        System.out.println("Duplicate Characters In "+inputString);
//        //Iterating through Set 'charsInString'
//        for (Character ch : charsInString)
//        {
//            if(charCountMap.get(ch) > 1)
//            {
//                //If any char has a count of more than 1, printing it's count
//                System.out.println(ch +" : "+ charCountMap.get(ch));
//            }
//        }
    }


    static void isAnagram(String s1, String s2) {
        //Removing all white spaces from s1 and s2
        String copyOfs1 = s1.replaceAll("\\s", "");
        String copyOfs2 = s2.replaceAll("\\s", "");
        //Initially setting status as true
        boolean status = true;
        if (copyOfs1.length() != copyOfs2.length()) {
            //Setting status as false if copyOfs1 and copyOfs2 doesn't have same length
            status = false;
        } else {
            //Changing the case of characters of both copyOfs1 and copyOfs2 and converting them to char array
            char[] s1Array = copyOfs1.toLowerCase().toCharArray();
            char[] s2Array = copyOfs2.toLowerCase().toCharArray();
            //Sorting both s1Array and s2Array
            Arrays.sort(s1Array);
            Arrays.sort(s2Array);
            //Checking whether s1Array and s2Array are equal
            status = Arrays.equals(s1Array, s2Array);
        }
        //Output
        if (status) {
            System.out.println(s1 + " and " + s2 + " are anagrams");
        } else {
            System.out.println(s1 + " and " + s2 + " are not anagrams");
        }
    }

    static void checkArmstrongNumber(int number)//153/10 3
    {
        int copyOfNumber = number;
        int noOfDigits = String.valueOf(number).length();//(1,5,3)=3
        int sum = 0;
        while (copyOfNumber != 0)//153!=0,15!=0
        {
            int lastDigit = copyOfNumber % 10;//153/10=15.3==3,
            int lastDigitToThePowerOfNoOfDigits = 1;
            for (int i = 0; i < noOfDigits; i++) {//0,1,2
                lastDigitToThePowerOfNoOfDigits = lastDigitToThePowerOfNoOfDigits * lastDigit;//27
            }
            sum = sum + lastDigitToThePowerOfNoOfDigits;//27
            copyOfNumber = copyOfNumber / 10;//153/10=15
        }
        if (sum == number) {
            System.out.println(number + " is an armstrong number");
        } else {
            System.out.println(number + " is not an armstrong number");
        }
    }


    static void findDuplicatesUsingHashMap(int[] inputArray) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int element : inputArray) {
            if (map.get(element) == null) {
                map.put(element, 1);
            } else {
                map.put(element, map.get(element) + 1);
            }
        }
        Set<Map.Entry<Integer, Integer>> entrySet = map.entrySet();
        for (Map.Entry<Integer, Integer> entry : entrySet) {
            if (entry.getValue() > 1) {
                System.out.println("Duplicate Element : " + entry.getKey() + " - found " + entry.getValue() + " times.");
            }
        }
    }

    private static void findDuplicatesUsingSorting(int[] inputArray) {
        Arrays.sort(inputArray);
        for (int i = 0; i < inputArray.length - 1; i++) {
            if (inputArray[i] == inputArray[i + 1]) {
                System.out.println("Duplicate Element : " + inputArray[i]);
            }
        }
    }

    static void ara(int[] a) {
        Arrays.sort(a);
        for (int i = 0; i <= a.length - 1; i++) {
            if (a[i] >= 100)
                System.out.println(a[i] + "  ");
        }
    }


    public static void reverseString(String st) {
        String[] word = st.split(" ");
        for (int i = -0; i <= word.length - 1; i++) {
            char[] ch = word[i].toCharArray();
            for (int j = ch.length - 1; j >= 0; j--) {
                System.out.print(ch[j]);
            }
            System.out.print(" ");
        }
    }


    public static void pyramid() {
        //pyramid Ascending
        for (int i = 5; i >= 1; i--) {
            for (int j = i; j <= 5; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
        //pyramid descending
        for (int i = 1; i <= 5; i++) {
            for (int j = i; j <= 5; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    public static void matrix(){
        var sc=new Scanner(System.in);
        System.out.println("Enter number of Rows");
        int row=sc.nextInt();
        System.out.println("Enter the Number of Columns");
        int cloumn=sc.nextInt();
        int [][]matrix1=new int[row][cloumn];
        int [][]matrix2=new int[row][cloumn];
        int [][]result=new int[row][cloumn];
        System.out.println("Enter the values of matrix1");
        for (int i=0;i<row;i++) {
            for (int j = 0; j < cloumn; j++)
                matrix1[i][j] = sc.nextInt();
        }
        System.out.println("Enter the values of matrix2");
        for (int i=0;i<row;i++) {
            for (int j = 0; j < cloumn; j++)
                matrix2[i][j] = sc.nextInt();
        }
        System.out.println("First matrix");
        for (int i=0;i<row;i++) {
            for (int j = 0; j < cloumn; j++)
            System.out.print(matrix1[i][j]+"   ");
            System.out.println();
        }
        System.out.println("2nd matrix");
        for (int i=0;i<row;i++) {
            for (int j = 0; j < cloumn; j++)
            System.out.print(matrix2[i][j]+"   ");
            System.out.println();
        }

    }

    public static void map(){
//        var hashMap=new HashMap<Integer,String>();
//        hashMap.put(101,"Shuvro");
//        hashMap.put(102,"Abir");
//        System.out.println(hashMap.entrySet());
        String st="java class";
        String st1="class prac";
        String result=st+" "+st1;
        System.out.println(result);
        String [] re =result.split(" ");
        System.out.println(Arrays.toString(re));
        var list=Arrays.asList(re);
        var set=new TreeSet<String>(list);
        System.out.println(set);


    }
    public static void main(String[] args) {
        //System.out.print(checkPalindrome("Nurses run"));
        // System.out.println(recursiveMethod("Myjava"));
        //duplicateCharCount("Better Butter");
//        int [] array={23,5,77,554,323,5756767};//1,3,3,3,4,4,4,5,5,
//        ara(array);
//        findDuplicatesUsingSorting(array);
//        findDuplicatesUsingHashMap(array);
//        reverseString("java prac");
//        pyramid();
//        matrix();
    //    solution(10,10,20);


        // Array
        Scanner sc=new Scanner(System.in);
//        for (int i=0;i <ar.length;i++)
//            ar[i]=sc.nextInt();
//
//        System.out.println(Arrays.toString(ar));
//        String [] st={"a","abc"};
//        System.out.println(Arrays.toString(st));

//        System.out.println("Enter the String");
//        String word=sc.nextLine();
//        System.out.println("Output");
//        char [] ch=word.toCharArray();
//        for(int i=0;i<ch.length;i++){
//            System.out.println(ch[i]);
//        }
//        String na="Good";
//        char [] ch=na.toCharArray();
//        for(int i=0;i<=ch.length-1;i++) {
//            System.out.print(ch[i]);//dooG
//        }

        String sent="We love New York";
        String [] word=sent.split(" ");//0=We,1="love",2="new",3="york"
        for(int j=0;j<word.length;j++){
//            System.out.println(ew);word[0]
//            System.out.println(evol);word[1]
//            System.out.println(wen);word[2]
//            System.out.println(kroy);word[3]
            //word[o]=we>>ew
            //name="shaon"
            char [] ch=word[j].toCharArray();//we [w,e]//love=[l,o,v,e]
            for (int i=ch.length-1;i>=0;i--){
                System.out.print(ch[i]);//ew evol
            }

            System.out.print(" ");

        }


    }
    //COVID-19
    //C
    //O
    //V
    //I
    //D
    //-
    //1
    //9



}
