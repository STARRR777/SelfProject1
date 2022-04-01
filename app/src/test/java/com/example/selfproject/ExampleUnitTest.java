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
            for (int j = 0;  j < array.length; j++) {

                s++;
                break;
            }
        }
        return s;
    }

    @Test
    public void addition_isCorrect() {

        assertEquals(1, countPairs(new int[]{-1, 1, 0, 1}));

    }
}