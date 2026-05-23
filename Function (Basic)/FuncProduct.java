
public class FuncProduct {
    //Function Overloading
    //Function of int datatype with 2 param
    public static int Product(int a, int b){
        int prod = a * b;
        return prod;
    }
    //Function with 3 param
    public static int Product(int a, int b, int c){
        int prod = a * b * c;
        return prod;
    }
    //Function of float datatype with 2 param
    public static float Product(float a, float b){
        float prod = a * b;
        return prod;
    }
    //Function of float datatype with 2 param
    public static float Product(float a, float b, float c){
        float prod = a * b * c;
        return prod;
    }
    public static void main(String[] args) {
        int a = 5;
        int b = 4;
        int result = Product(a,b);
        System.out.println("Product of "+a+" and "+b+" is "+result);

        System.out.println("Product is "+Product(10,20));
    }
}
