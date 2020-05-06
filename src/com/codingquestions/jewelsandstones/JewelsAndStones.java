package com.codingquestions.jewelsandstones;

import java.util.HashSet;

public class JewelsAndStones {
    public static void main(String[] args) {
        //You're given string J representing the types of stones that are jewels, and S representing the stones you have....

        System.out.println(numJewelsInStones("aA", "AaaABBBB"));
    }

    private static int numJewelsInStones(String J, String S) {
        HashSet<Character> j = new HashSet<>();
        for (char c : J.toCharArray()) {
            j.add(c);
        }
        int total = 0;
        for (char c : S.toCharArray()) {
            if (j.contains(c)) {
                total++;
            }
        }
        return total;
    }
}
