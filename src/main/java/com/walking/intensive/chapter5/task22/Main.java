package com.walking.intensive.chapter5.task22;

import com.walking.intensive.chapter5.task22.analyzer.TextAnalyzer;
import com.walking.intensive.chapter5.task22.io.reader.SimpleFileReader;
import com.walking.intensive.chapter5.task22.io.writer.SimpleFileWriter;
import com.walking.intensive.chapter5.task22.utils.WordUtils;

import java.util.*;

/**
 * Условие:
 * <a href="https://geometry-math.ru/homework/read-write.html">Чтение и запись</a>
 */
public class Main {
    private static final String INPUT_FILE_PATH =
            "src/main/resources/input.txt";
    private static final String RESULT_FILE_PATH =
            "src/main/resources/output.txt";

    public static void main(String[] args) {
        List<String> wordList =
                new WordUtils().collectWordList(new SimpleFileReader().readFile(INPUT_FILE_PATH));
        String analysisResult = new TextAnalyzer().analyzeText(wordList);
        new SimpleFileWriter().writeResult(RESULT_FILE_PATH, analysisResult);
    }
}