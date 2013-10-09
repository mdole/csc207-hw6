/**
 * @author Matt Dole
 * @author Tim Youtz
 *
 * Note: Help received from Mira Hall regarding syntax for testing arrays
 */

package edu.grinnell.CSC207.dolematt.hw6;

public class DutchFlagSorter {
    public static void sort(String[] flag) throws Exception {
        if (flag.length == 0) {
            throw new Exception("Sort cannot be applied to an empty array");
        }
        if (flag.length == 1)
            return;
        int white = 0;
        int red = 0;
        int blue = flag.length - 1;
        String temp1 = "";
        String temp2 = "";
        while (flag[blue].compareToIgnoreCase("blue") == 0 && blue > 0) {
            blue--;
        }
        while (white <= blue) {
            if (flag[white].compareToIgnoreCase("red") == 0) {
                temp1 = flag[white];
                temp2 = flag[red];
                flag[red] = temp1;
                flag[white] = temp2;
                red++;
            } else if (flag[white].compareToIgnoreCase("blue") == 0) {
                temp1 = flag[white];
                temp2 = flag[blue];
                flag[blue] = temp1;
                flag[white] = temp2;
                blue--;
            } else if (flag[white].compareToIgnoreCase("white") != 0) {
                throw new Exception(
                        "Array contains values other than \"white\", \"red\", and \"blue\"");
            }
            white++;
        }
    }
}