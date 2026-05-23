
public class FuncFact {
    public static int Fact(int n){
        int f = 1;
        for(int i=1;i<=n;i++){
            f = f * i;
        }
        return f;
    }

    public static int BinCoeff(int n, int r){
        int fact_n = Fact(n);
        int fact_r = Fact(r);
        int fact_nmr = Fact(n-r);

        int binCoeff = fact_n/(fact_r*fact_nmr);
        return binCoeff;
    }

    public static void main(String[] args) {
        //Factorial Calculations
        System.out.println(Fact(5));
        System.out.println(Fact(4));
        System.out.println(Fact(3));

        //Binomial Coefficient Calculation
        System.out.println(BinCoeff(5, 3));
    }
}
