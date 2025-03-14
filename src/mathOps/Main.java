package mathOps;
/*
Corresponding to the programming task in my IT course of studies:
-Implementation of a class (with Gaussian Summation, for-loop, recursion) for solving the Gaussian sum -- e.g. n=3 -> sum = 1+2+3 = 6
-Implementation of anonymous classes and anonymous functions for
    -- f1(x) = x - 1; start value 10, target value -10
    -- f2(x) = Collatz -->  (f2(x) = x/2 [x is even], f2(x) = 3x + 1 [x is odd]); start value 27, target value 1
 */

public class Main {
    public static void main(String[] args) {
        System.out.println("SummingUnit demonstration:");
        SummingUnit summingUnit = new SummingUnit();
        int n = Integer.parseInt(args[0]);

        System.out.println("Result with small Gauss: " + summingUnit.smallGauss(n));
        System.out.println("Result with for-loop: " + summingUnit.forSum(n));
        System.out.println("Result with recursive calculation: " + summingUnit.recursiveSum(n));
        System.out.println();


        System.out.println("Anonymous classes with FunctionOperator demonstration:");
        FunctionOperator functionOp = new FunctionOperator();

        //a) anonymous class with perform() for f1(x) = x - 1; start value 10, target value -10
        IntIntFunction anonymMinus1 = new IntIntFunction() {
            @Override
            public int perform(int input) {
                return input - 1;
            }
        };
        int result = functionOp.operate(anonymMinus1, 10, -10);
        System.out.println("Result of the anonymous class with f1(x) = x - 1; (10,-10) = " + result);


        //b) anonymous class with perform() for Collatz problem (f2(x) = x/2 [x is even], f2(x) = 3x + 1 [x is odd]); start value 27, target value 1
        IntIntFunction anonymCollatz = new IntIntFunction() {
            @Override
            public int perform(int input) {
                return input % 2 == 0 ? input/2 : 3*input+1;
            }
        };
        result = functionOp.operate(anonymCollatz, 27, 1);
        System.out.println("Result of the anonymous class with f2(x)= Collatz (27,1)) = " + result);

        System.out.println();
        System.out.println("Anonymous functions with FunctionOperator demonstration:");

        //c) anonymous function for f1(x) = x - 1; start value 10, target value -10
        result = functionOp.operate(
                x -> x-1,
                10,
                -10
        );
        System.out.println("Result of the anonymous function f1(x)= x-1; (10,-10) = " + result);

        //d) anonymous function for Collatz problem (f2(x)= x/2 [x is even], f2(x)= 3x + 1 [x is odd]); start value 27, target value 1
        result = functionOp.operate(
                x -> (x % 2 == 0) ? x/2 : 3*x+1,
                27,
                1
        );
        System.out.println("Result of the anonymous function f2(x)= Collatz (27,1)) = " + result);
    }
}