package mathOps;

//predefined class
// Executes a passed function until the desired target value is reached.
// End return: number of calls up to the target value
public class FunctionOperator {

    public int operate(IntIntFunction function, int start, int target) {
        int counter = 0;
        int value = start;
        while (value != target) {
            value = function.perform(value);
            counter++;
        }
        return counter;
    }
}