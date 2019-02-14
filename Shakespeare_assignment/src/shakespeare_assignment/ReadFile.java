/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shakespeare_assignment;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author lovro
 */
public class ReadFile {
    String[] simpleArray;
  
    public String[] readFromFile(File file) throws FileNotFoundException {
        Scanner scan = new Scanner(file);
        ArrayList<String> data = new ArrayList<String>();
        while (scan.hasNextLine()) {
            data.add(scan.nextLine().toLowerCase().replaceAll("\\p{Punct}", ""));
        }
        simpleArray = data.toArray(new String[]{});
        System.out.println("DATA ---->" + data);
        return simpleArray;
    }
}
