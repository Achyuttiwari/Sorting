/*
 *   Created by IntelliJ IDEA.
 *   User: Tiwari
 *   Date: 5/2/2020
 *   Time: 4:10 PM
 */
package bubbleSort;

import java.sql.SQLOutput;

public class BubbleSort {
    public void sort(int[] array, int choiceOfSorting) {
        System.out.println(choiceOfSorting == 1 ? "SORTED BY ASCENDING ORDER" : "SORYTED BY DESCENING ORDER");
        for (int i = 0; i < (array.length - 1); i++) {
            for (int j = 0; j < (array.length - 1); j++) {
                if (choiceOfSorting == 1) {
                    desendingOrder(array, j);
                } else ascendingOrder(array, j);
            }
        }

    }

    private void desendingOrder(int[] array, int j) {
        if (array[j] < array[j + 1]) {
            int temp = array[j];
            array[j] = array[j + 1];
            array[j + 1] = temp;
        }
    }

    private void ascendingOrder(int[] array, int j) {
        if (array[j] > array[j + 1]) {
            int temp = array[j];
            array[j] = array[j + 1];
            array[j + 1] = temp;
        }
    }
}
