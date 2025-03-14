package mathOps;

public class SummingUnit {

    int smallGauss(int n) { // a) Gaussian summation formula
        return n*(n+1)/2;
    }

    int forSum(int n) { // b) for-loop
        int summe = 0;
        for (int i = 1; i <= n; i++) {
            summe += i;
        }
        return summe;
    }

    int recursiveSum(int n) { //c) Recursion
        if (n > 0) {
            return recursiveSum(n-1)+n;
        }else {
            return 0;
        }
    }

}
