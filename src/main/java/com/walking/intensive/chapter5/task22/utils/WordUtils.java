package com.walking.intensive.chapter5.task22.utils;

import java.util.List;
import java.util.Locale;

public class WordUtils {
    public List<String> collectWordList(String line) {
        String[] lineArray = line.toLowerCase(Locale.ROOT)
                .split("\\p{Punct}\s|\s|\n");

        return List.of(lineArray);
    }
}
