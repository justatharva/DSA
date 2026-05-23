
public class FuncCodeConv {
    public static void binToDec(int binNum){
        int pow = 0;
        int decNum = 0;
        int num = binNum;
        while(binNum > 0){
            int lastDigit = binNum % 10;
            decNum = decNum + (lastDigit * (int) Math.pow(2,pow));
            pow++;
            binNum = binNum / 10;
        }
        System.out.println("Decimal of "+num+" = "+decNum);
    }

    public static void decToBin(int decNum){
        int pow = 0;
        int binNum = 0;
        int num = decNum;

        while(decNum > 0){
            int rem = decNum % 2;
            binNum = binNum + (rem * (int)Math.pow(10,pow));
            pow++;
            decNum = decNum / 2;
        }
        System.out.println("Binary of "+num+" = "+binNum);
    }

    public static void main(String[] args) {
        binToDec(1101);
        decToBin(12);
    }
}
