package edu.cscc;

/**
 * Surname class parses a line of text that is in the approved CSV format
 * @author Brian Pawletzki
 * @version 20191022_2040
 */
public class Surname {
    private String name;
    private int rank;
    private int count;
    private double proportion;

    /**
     * Parse one line
     * @param line One CSV line
     */
    public Surname(String line) {
        String[] namePart = line.split(",");
        try {
            this.name = namePart[0];
            this.rank = Integer.parseInt(namePart[1]);
            this.count = Integer.parseInt(namePart[2]);
            this.proportion = Double.parseDouble(namePart[3]);
        } catch (NumberFormatException e) {
            System.out.println("There was an issue parsing the line:  " + line);
            System.exit(501);
        }
    }

    /**
     * Return the Name
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Return the Rank
     * @return rank
     */
    public String getRank() {
        return String.valueOf(rank);
    }

    /**
     * Return the count
     * @return count
     */
    public int getCount() {
        return count;
    }

    /**
     * Return the Proportion
     * @return proportion
     */
    public double getProportion() {
        return proportion;
    }
}