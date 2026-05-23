
public class FuncSwap {
    public static void swapNum(int a, int b){
        int temp;
        temp = a;
        a = b;
        b = temp;
        System.out.println("After Swapping : ");
        System.out.println(a);
        System.out.println(b);
    }
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        System.out.println("Before Swapping : ");
        System.out.println(a);
        System.out.println(b);
        swapNum(a,b);
    }
}
