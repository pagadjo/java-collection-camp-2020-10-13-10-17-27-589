package com.thoughtworks.collection;

import org.apache.commons.lang3.NotImplementedException;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Reduce {

    List<Integer> arrayList;

    public Reduce(List<Integer> arrayList) {
        this.arrayList = arrayList;
    }

    public double getAverage() {
        Double sum = Double.valueOf(arrayList.stream()
                .reduce(0, (number1, number2) -> (number1 + number2)))
                / arrayList.size();
        return sum;
//
//        return arrayList.stream().map(Integer::doubleValue).reduce(Double::sum).map(aDouble -> aDouble / arrayList.size());
    }

    public int getMaxValue() {
        return arrayList.stream().reduce(Integer.MIN_VALUE, Integer::max);
    }

    public int getLastOdd() {
        return arrayList.stream().reduce(0, (max, current) -> current % 2 == 1 ? current : max);
    }
}
