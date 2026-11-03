public class Main {


    void main() {
        //Palindrome: Reads the same from left to right
        //Example: Race car, aka


        //Input value will be String
//
//        String str = "racecar";
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

    }

    //Define a recursive method that checks if a string is a palindrome string

    public static boolean CheckPalindromeString(String str){

        //Base Case
        if(str.length() <= 1){
            return true;

        }
        if(str.charAt(0) != str.charAt(str.length()-1)){
            return false;
        } else {
            return CheckPalindromeString(str.substring(1, str.length()-1));
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
}