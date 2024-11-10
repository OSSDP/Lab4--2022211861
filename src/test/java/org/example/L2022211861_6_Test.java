package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;


public  class L2022211861_6_Test {



    @Test
    public void testExample1() {
        L2022211861_6_ solution = new L2022211861_6_();
        List<List<String>> favoriteCompanies = Arrays.asList(
                Arrays.asList("leetcode", "google", "facebook"),
                Arrays.asList("google", "microsoft"),
                Arrays.asList("google", "facebook"),
                Arrays.asList("google"),
                Arrays.asList("amazon")
        );
        List<Integer> expected = Arrays.asList(0, 1, 3);// 修改期望值，使其与实际结果不匹配
        assertEquals(expected, solution.peopleIndexes(favoriteCompanies));
    }

    @Test
    public void testExample2() {
        L2022211861_6_ solution = new L2022211861_6_();
        List<List<String>> favoriteCompanies = Arrays.asList(
                Arrays.asList("leetcode", "google", "facebook"),
                Arrays.asList("leetcode", "amazon"),
                Arrays.asList("facebook", "google")
        );
        List<Integer> expected = Arrays.asList(0, 1);
        assertEquals(expected, solution.peopleIndexes(favoriteCompanies));
    }

    @Test
    public void testExample3() {
        L2022211861_6_ solution = new L2022211861_6_();
        List<List<String>> favoriteCompanies = Arrays.asList(
                Arrays.asList("leetcode"),
                Arrays.asList("google"),
                Arrays.asList("facebook"),
                Arrays.asList("amazon")
        );
        List<Integer> expected = Arrays.asList(0, 1, 2, 3);
        assertEquals(expected, solution.peopleIndexes(favoriteCompanies));
    }

    @Test
    public void testEmptyList() {
        L2022211861_6_ solution = new L2022211861_6_();
        List<List<String>> favoriteCompanies = Arrays.asList();
        List<Integer> expected = Arrays.asList();
        assertEquals(expected, solution.peopleIndexes(favoriteCompanies));
    }

    @Test
    public void testSinglePerson() {
        L2022211861_6_ solution = new L2022211861_6_();
        List<List<String>> favoriteCompanies = Arrays.asList(
                Arrays.asList("leetcode", "google")
        );
        List<Integer> expected = Arrays.asList(0);
        assertEquals(expected, solution.peopleIndexes(favoriteCompanies));
    }

    @Test
    public void testAllSubsets() {
        L2022211861_6_ solution = new L2022211861_6_();
        List<List<String>> favoriteCompanies = Arrays.asList(
                Arrays.asList("a"),
                Arrays.asList("a", "b"),
                Arrays.asList("a", "b", "c")
        );
        List<Integer> expected = Arrays.asList(2);
        assertEquals(expected, solution.peopleIndexes(favoriteCompanies));
    }

    @Test
    public void testNoCommonElements() {
        L2022211861_6_ solution = new L2022211861_6_();
        List<List<String>> favoriteCompanies = Arrays.asList(
                Arrays.asList("leetcode"),
                Arrays.asList("microsoft"),
                Arrays.asList("facebook")
        );
        List<Integer> expected = Arrays.asList(0, 1, 2);
        assertEquals(expected, solution.peopleIndexes(favoriteCompanies));
    }

}
