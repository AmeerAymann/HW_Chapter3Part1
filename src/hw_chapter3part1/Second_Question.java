/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw_chapter3part1;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author ameer
 */
public class Second_Question {

    public static void main(String[] args) throws IOException {
        File file = new File("SmallSizeText.txt");
        if (!file.exists()) {
            file.createNewFile();
        }
        Scanner input = new Scanner(file);

        ArrayList<String> arrayList = new ArrayList<>();

        while (input.hasNextLine()) {
            String[] smallSizeTextArray = input.nextLine().split(" ");
            arrayList.addAll(Arrays.asList(smallSizeTextArray));
        }

        StringBuilder buffer = new StringBuilder();
        for (int i = 0; i < arrayList.size(); i++) {
            buffer.append(arrayList.get(i) + " ");
        }

        String append = buffer.toString();

        System.out.println("Text in File : \n" + append);
        System.out.println("\nRepetition Character in File \n");
        chara(append);
        System.out.println("\nRepetition Words in File \n");
        word(append);
    }

    private static void chara(String s) {
        char[] c = s.toCharArray();
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for (char d : c) {
            if (map.containsKey(d)) {
                map.put(d, map.get(d) + 1);
            } else {
                map.put(d, 1);
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

    private static void word(String s) {
        String[] c = s.split(" ");
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        for (String d : c) {
            if (map.containsKey(d)) {
                map.put(d, map.get(d) + 1);
            } else {
                map.put(d, 1);
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

}
