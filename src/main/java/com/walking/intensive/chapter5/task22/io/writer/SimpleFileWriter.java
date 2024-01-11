package com.walking.intensive.chapter5.task22.io.writer;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class SimpleFileWriter {

    public void writeResult(String writePath, String result) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(writePath))) {
            writer.write(result);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
