package org.example;

import java.util.Arrays;
import java.util.HashSet;

public class ContainerProcessor {
    public static double[] makeUnique(double[] elements) {
        return Arrays.stream(elements).distinct().toArray();
    }
}
