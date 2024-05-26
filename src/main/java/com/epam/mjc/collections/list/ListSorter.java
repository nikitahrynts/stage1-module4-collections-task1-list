package com.epam.mjc.collections.list;

import java.util.Comparator;
import java.util.List;

public class ListSorter {
    public void sort(List<String> sourceList) {
        sourceList.sort(new ListComparator());
    }
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        int firstNumber = Integer.parseInt(a);
        int secondNumber = Integer.parseInt(b);

        int firstFunctionVal = 5 * firstNumber * firstNumber + 3;
        int secondFunctionVal = 5 * secondNumber * secondNumber + 3;

        if (firstFunctionVal != secondFunctionVal) return Integer.compare(firstFunctionVal, secondFunctionVal);
        else return Integer.compare(firstNumber, secondNumber);
    }
}
