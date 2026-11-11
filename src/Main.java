//https://github.com/InvaderAsim/PalindromeTest


public class Main {



        //Palindrome: Reads the same from left to right
        //Example: Race car, aka


        //Input value will be String
//
        String str = "racecar";
//        IO.println(str);
//        IO.println("String Length: " + str.length());
//        IO.println("character at index 0: " + str.charAt(0));
//        IO.println("character at index 6: " + str.charAt(str.length()-1));

//        String str = "Hello World";
//        IO.println(str.substring(2));
//        IO.println(str.substring(0, 7));
//
//        String substr = str.substring(0, 6);
//        IO.println(substr.length());
//
//        substr = substr.trim();
//        IO.println(substr.length());


    //Define a recursive method that checks if a string is a palindrome string

    public static boolean CheckPalindromeString(String str){

//        Base Case
        if(str.length() <= 1){
            return true;

        }
        if(str.charAt(0) != str.charAt(str.length()-1)){
            return false;
        } else {
            return CheckPalindromeString(str.substring(1, str.length()-1));
        }
    }

    // Recursive function to reverse a number
    static int recursive_func(int n, int rev) {

        // Base condition
        if (n < 10) {
            return rev * 10 + n;
        }

        // Recursive case
        int last_digit = n % 10;
        rev = rev * 10 + last_digit;

        return recursive_func(n / 10, rev);
    }



    void main(){

        String str2 = "geeks";

        IO.println("\"" + str + "\"" + " palindrome? " + CheckPalindromeString(str));
        IO.println("\"" + str2 + "\"" + " palindrome? " + CheckPalindromeString(str2));

        int n1 = 4993;
        int n2 = 40055004;

        int rev1 = recursive_func(n1, 0);
        int rev2 = recursive_func(n2, 0);

        if (n1 == rev1)
            System.out.println("Palindrome number = Yes");
        else
            System.out.println("Palindrome number = No");

        if (n2 == rev2)
            System.out.println("Palindrome number = Yes");
        else
            System.out.println("Palindrome number = No");

    }

}



    //How can we know if a problem can be solved with recursion?

    //Looping aspect, need to break down
    //Key Idea: Observe if any repetitive nature in the input date, repetitive indicates
    //the data can be broken down into smaller data
        //Guide us on how to break the given data into a smaller size

    //Base Case: the answer for an input data is already known. Possible base cases: 1+
    //Have to have at least one base case, otherwise recursion will not stop

    //How do we aggregate the results from each recursive call?

    //Reversing a string: add the value
    //Factorial calculation: multiply
    //Sum of digits of an integer value: 123 = 6, add the value returned by the recursive call
