/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shakespeare_assignment;

import java.io.File;
import java.io.FileNotFoundException;

/**
 *
 * @author lovro
 */
public class Shakespeare_assignment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("/home/lovro/Desktop/dummy.txt");
        ReadFile reader = new ReadFile();
        Algorithms algorithms = new Algorithms();
        reader.readFromFile(file);
        long startTimeSelection = System.nanoTime();
        algorithms.selectionSort(reader.simpleArray);
        long endTimeSelection = System.nanoTime();
        long durationSelection = (endTimeSelection - startTimeSelection);
        System.out.println("DURATION SELECTION:" + durationSelection);
        algorithms.printArray(reader.simpleArray);
        long startTimeInsertion = System.nanoTime();
        algorithms.insertionSort(reader.simpleArray);
        long endTimeInsertion = System.nanoTime();
        long durationInsertion = (endTimeInsertion - startTimeInsertion);
        System.out.println("DURATION INSERTION:" + durationInsertion);
        algorithms.printArray(reader.simpleArray);
        long startTimeMerge = System.nanoTime();
        algorithms.mergeSort(reader.simpleArray);
        long endTimeMerge = System.nanoTime();
        long durationMerge = (endTimeMerge - startTimeMerge);
        System.out.println("DURATION MERGE:" + durationMerge);
        algorithms.printArray(reader.simpleArray);
    }

}
