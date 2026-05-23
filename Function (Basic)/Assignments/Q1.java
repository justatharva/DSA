//Question 1 :Write a Java method to compute the average of three numbers
public class Q1 {
    public static void Avg(int a, int b, int c){
        float avg =(float) ( a + b + c )/ 3;
        System.out.println("Average of numbers = "+avg);
    }
    public static void main(String[] args) {
        Avg(3,4,5);
        Avg(1,2,3);
    }
}
