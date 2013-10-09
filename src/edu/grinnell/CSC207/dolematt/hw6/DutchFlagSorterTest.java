package edu.grinnell.CSC207.dolematt.hw6;

import static org.junit.Assert.*;

import org.junit.Test;
import edu.grinnell.CSC207.dolematt.hw6.DutchFlagSorter;

public class DutchFlagSorterTest {

    @Test
    public void testSort() throws Exception {
        String[] case1 = { "red" };
        DutchFlagSorter.sort(case1);
        String[] case1Sorted = { "red" };

        String[] case2 = { "white" };
        DutchFlagSorter.sort(case2);
        String[] case2Sorted = { "white" };

        String[] case3 = { "blue" };
        DutchFlagSorter.sort(case3);
        String[] case3Sorted = { "blue" };

        String[] case4 = { "red", "red", "red" };
        DutchFlagSorter.sort(case4);
        String[] case4Sorted = { "red", "red", "red" };

        String[] case5 = { "white", "white", "white" };
        DutchFlagSorter.sort(case5);
        String[] case5Sorted = { "white", "white", "white" };

        String[] case6 = { "blue", "blue", "blue" };
        DutchFlagSorter.sort(case6);
        String[] case6Sorted = { "blue", "blue", "blue" };

        String[] case7 = { "blue", "white", "red" };
        DutchFlagSorter.sort(case7);
        String[] case7Sorted = { "red", "white", "blue" };

        String[] case8 = { "red", "blue", "white" };
        DutchFlagSorter.sort(case8);
        String[] case8Sorted = { "red", "white", "blue" };

        String[] case9 = { "white", "blue", "blue" };
        DutchFlagSorter.sort(case9);
        String[] case9Sorted = { "white", "blue", "blue" };

        String[] case10 = { "blue", "red", "white", "red", "blue", "red" };
        DutchFlagSorter.sort(case10);
        String[] case10Sorted = { "red", "red", "red", "white", "blue", "blue" };
       
        String[] case11 = { "red", "red", "red", "white", "blue", "blue" };
        DutchFlagSorter.sort(case10);
        String[] case11Sorted = { "red", "red", "red", "white", "blue", "blue" };

        assertArrayEquals("single red", case1Sorted, case1);
        assertArrayEquals("single white", case2Sorted, case2);
        assertArrayEquals("single blue", case3Sorted, case3);
        assertArrayEquals("all red", case4Sorted, case4);
        assertArrayEquals("all white", case5Sorted, case5);
        assertArrayEquals("all blue", case6Sorted, case6);
        assertArrayEquals("original begins blue, ends red", case7Sorted, case7);
        assertArrayEquals("original begins red, ends white", case8Sorted, case8);
        assertArrayEquals("original begins white, ends blue", case9Sorted, case9);
        assertArrayEquals("longer list, out of order", case10Sorted, case10);
        assertArrayEquals("longer list, in order", case11Sorted, case11);
    }
}