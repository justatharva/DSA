/*  Question 5 :Write a Java method to compute the sum of the digits in an integer.
    (Hint: Approach this question in the following way:
    a.Take a variable sum = 0
    b.Find the last digit of the number
    c.Add it to the sum
    d.Repeat a & b until the number becomes 0 ) */

public class Q5 {
    public static void SumOfDigits(int num){
        int sum = 0;
        while(num>0){
            int lastdigit = num % 10;
            sum += lastdigit;
            num /= 10;
        }
        System.out.println("Sum of Digits = "+sum);
    }
    public static void main(String[] args) {
        SumOfDigits(15248);
    }
}
