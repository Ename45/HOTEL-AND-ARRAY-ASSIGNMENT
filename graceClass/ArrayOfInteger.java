package graceClass;

import java.util.Arrays;

public class ArrayOfInteger {

    private final int [] numbers = {2, 4, 6, 3, 5, 1};

    public String numbersMultiplyItself() {
        int [] product = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            product[i] = numbers[i]*numbers[i];
        }
        return Arrays.toString(product);
    }

    public String ascendingOrder() {
        int ascending;
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - i - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    ascending = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = ascending;
                }
            }
        }
        return Arrays.toString(numbers);
    }

    public String descendingOrder() {
        int descending;
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - i - 1; j++) {
                if (numbers[j] < numbers[j + 1]) {
                    descending = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = descending;
                }
            }
        }
        return Arrays.toString(numbers);
    }
}


