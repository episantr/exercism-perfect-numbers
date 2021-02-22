import java.util.ArrayList;
import java.util.List;

class NaturalNumber {

    private final int number;

    public Classification getClassification() {

        int sumOfFactors = getSumOfFactors();

        if (sumOfFactors < number) {
            return Classification.DEFICIENT;
        } else if (sumOfFactors > number) {
            return Classification.ABUNDANT;
        } else {
            return Classification.PERFECT;
        }
    }

    private int getSumOfFactors() {
        int sumOfFactors = 0;

        for (Integer factor : getFactors(number)) {
            sumOfFactors += factor;
        }
        return sumOfFactors;
    }

    public NaturalNumber(int number) {
        if (number > 0) {
            this.number = number;
        } else {
            throw new IllegalArgumentException("You must supply a natural number (positive integer)");
        }
    }

    private List<Integer> getFactors(int number) {
        List<Integer> factors = new ArrayList<>();

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                factors.add(i);
            }
        }
        return factors;
    }
}
