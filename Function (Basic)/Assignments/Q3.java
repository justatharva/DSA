// Question3:Write a Java program to check if a number is a palindrome in Java? (121 is a palindrome, 321 is not). A number is called a palindrome if the number is equal to the reverse of a number e.g.,121 is a palindrome because the reverse of 121 is 121 itself. On the otherhand, 321 is not a palindrome because the reverse of 321 is 123, which is not equal to 321.
public class Q3 {
    public static void palindrome(int num){
        int rev = 0;
        int rem = 0;
        int Onum = num;
        while(num>0){
            rem = num % 10;
            rev = (rev*10)+rem;
            num /= 10;
        }
        if(rev == Onum){
            System.out.println(" "+Onum+" is a palindrome number");
        }
        else{
            System.out.println(" "+Onum+" is not a palindrome number");
        }
    }
    public static void main(String[] args) {
        palindrome(112);
    }
}
