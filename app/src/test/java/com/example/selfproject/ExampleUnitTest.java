package com.example.selfproject;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    int countPairs(int[] array) {
        int s = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1;  j < array.length; j++) {
                if (array[i] + array [j] == 0) {
                    s++;
                    break;
                }
                else{

                }
            }
        }
        return s;
    }

    @Test
    public void addition_isCorrect() {

        assertEquals(1, countPairs(new int[]{-1, 1, 0, 1}));
        assertEquals(1, countPairs(new int[]{1, -1}));
        assertEquals(1, countPairs(new int[]{0, 0}));
        assertEquals(2, countPairs(new int[]{-1, 1, -1, 1}));
    }
}