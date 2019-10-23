package edu.cscc;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Census class that will process file
 * @author Brian Pawletzki
 * @version 20201022_2037
 */
public class Census {
    private static int line = 0; // Keep track of lines of file we've read
    private static Surname[] namelist = new Surname[100];
    private static File file;

    /**
     * Process the file
     * @param fname A file that contains CSV data in approved format
     * @return namelist An array of Surname
     */
    public static Surname[] loadCensusData(String fname) {
        try {
            file = new File(fname);
            Scanner input = new Scanner(file);
            // Skip the first line
            if (input.hasNext()) {
                input.nextLine();
            }
            // If there's a line send to Surname to parse
            while (input.hasNext() && line < 100) {
                namelist[line] = new Surname(input.nextLine());
                line++;
            }
            input.close();
        } catch (FileNotFoundException e) {
            System.out.println("The file was not found: " + file.getName());
            System.exit(500);
        }

        return namelist;
    }

}