/*
 *   Created by IntelliJ IDEA.
 *   User: Tiwari
 *   Date: 5/2/2020
 *   Time: 4:12 PM
 */
package Main;

import bubbleSort.BubbleSort;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int noOfElement = scanner.nextInt();
        int[] array = new int[noOfElement];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100 );
        }
        System.out.println("Unsorted array");
        System.out.println(Arrays.toString(array));
        System.out.println("Press 1 for sort array using Bubble sort");

        int choice = scanner.nextInt();
        switch (choice){
            case 1 :
                    /*case 1 for bubble sort implementation*/
                    BubbleSort  bs = new BubbleSort();
                    bs.sort(array,(int) Math.ceil(Math.random()));

        }


    }
}
