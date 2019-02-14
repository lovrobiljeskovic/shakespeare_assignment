/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shakespeare_assignment;

import java.util.Arrays;

/**
 *
 * @author lovro
 */
public class Algorithms {

    public String[] selectionSort(String[] array) {

        for (int i = 1; i < array.length; i++) {

            int s = i - 1;

            for (int j = i; j < array.length; j++) {
                if (array[j].compareTo(array[s]) < 0) {

                    s = j;
                }
            }

            String temp = array[i - 1];

            array[i - 1] = array[s];
            array[s] = temp;

        }
        return array;
    }

    public String[] insertionSort(String[] array) {
        int i, j;
        String key;
        for (j = 1; j < array.length; j++) { //the condition has changed
            key = array[j];
            i = j - 1;
            while (i >= 0) {
                if (key.compareTo(array[i]) > 0) {//here too
                    break;
                }
                array[i + 1] = array[i];
                i--;
            }
            array[i + 1] = key;
        }
       return array;
    }
    
    public String[] mergeSort(String[] array) {
        if (array.length >= 2) {
            String[] left = new String[array.length / 2];
            String[] right = new String[array.length - array.length / 2];

            for (int i = 0; i < left.length; i++) {
                left[i] = array[i];
            }

            for (int i = 0; i < right.length; i++) {
                right[i] = array[i + array.length / 2];
            }

            mergeSort(left);
            mergeSort(right);
            merge(array, left, right);
        }
        return array;
    }
    public static void merge(String[] array, String[] left, String[] right) {
        int a = 0;
        int b = 0;
        for (int i = 0; i < array.length; i++) {
            if (b >= right.length || (a < left.length && left[a].compareToIgnoreCase(right[b]) < 0)) {
                array[i] = left[a];
                a++;
            } else {
                array[i] = right[b];
                b++;
            }
        }
    }
    
     public void printArray(String[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print("\"" + array[i] + "\" ");
        }
    }
     
}
