package org.example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class L2022211861_6_ {
    public List<Integer> peopleIndexes(List<List<String>> favoriteCompanies) {
        int n = favoriteCompanies.size();
        Set<String>[] sets = new HashSet[n];
        List<Integer> ans = new ArrayList<>();

        // Initialize sets for each person
        for (int i = 0; i < n; i++) {
            sets[i] = new HashSet<>(favoriteCompanies.get(i));
        }

        // Check each person's list against others
        for (int i = 0; i < n; i++) {
            boolean isSubset = false;
            for (int j = 0; j < n; j++) {
                if (i != j && isSubsetOf(sets[i], sets[j])) {
                    isSubset = true;
                    break;
                }
            }
            if (!isSubset) {
                ans.add(i);
            }
        }

        return ans;
    }

    private boolean isSubsetOf(Set<String> subset, Set<String> superset) {
        for (String s : subset) {
            if (!superset.contains(s)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        L2022211861_6_ solution = new L2022211861_6_();
        List<List<String>> favoriteCompanies = List.of(
                List.of("leetcode", "google", "facebook"),
                List.of("google", "microsoft"),
                List.of("google", "facebook"),
                List.of("google"),
                List.of("amazon")
        );

        System.out.println(solution.peopleIndexes(favoriteCompanies)); // 输出: [0, 1, 4]
    }

}





