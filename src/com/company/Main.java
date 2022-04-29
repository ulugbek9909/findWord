package com.company;

import java.io.*;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        findWord(str);


    }

    public static Map<String, String> textMap() {
        Map<String, String> wordMap = new HashMap<>();
        File file = new File("oxford.txt");
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            try {
                String line = reader.readLine();

                while (line != null) {
                    String str = line;
                    String[] strings = line.split(" ");
                    if (strings.length > 0) {
                        wordMap.put(strings[0], str);
                    }
                    line = reader.readLine();
                }
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return wordMap;
    }

    public static void findWord(String word) {

        System.out.println(textMap().get(word));

    }
}
/*Berilgan fayldagi barcha lug’at so’zlaridan map yarating va mapni ichidan so’z qidiradigan dastur tuzing.*/
