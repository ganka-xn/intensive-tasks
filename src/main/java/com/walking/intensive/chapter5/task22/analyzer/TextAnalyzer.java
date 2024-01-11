package com.walking.intensive.chapter5.task22.analyzer;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TextAnalyzer {

    public String analyzeText(List<String> words) {
        Map<String, Integer> wordsMap = new HashMap<>();
        words.forEach(word -> wordsMap.compute(word, (key, value) -> value == null ? 1 : value + 1));

        return getMostFrequentWords(wordsMap);
    }

    private String getMostFrequentWords(Map<String, Integer> wordsMap) {
        int maxFrequency = Collections.max(wordsMap.values());
        StringBuilder mostFrequentWords = new StringBuilder();

        for (Map.Entry<String, Integer> entry: wordsMap.entrySet()) {
            if (entry.getValue().equals(maxFrequency)) {
                mostFrequentWords.append(entry.getKey())
                        .append(" ")
                        .append(entry.getValue())
                        .append("\n");
            }
        }

        return mostFrequentWords.toString();
    }
}