package com.employeepayroll;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class FileOperationsTest {
    private static final String HOME = System.getProperty("user.home");
    private static final String FOLDER = "TestFolder";

    @Test
    public void givenPathShouldPassFileOperationTests() throws IOException {
        // Check File Exists
        Path basePath = Paths.get(HOME);
        Assertions.assertTrue(Files.exists(basePath));

        // Delete file check not exists
        Path pathVar = Paths.get(HOME + "/" + FOLDER);
        try {
            Files.deleteIfExists(pathVar);
        } catch (IOException e) {
            e.printStackTrace();
        }
        Assertions.assertTrue(Files.notExists(pathVar));

        // Create Directory
        Files.createDirectory(pathVar);
        Assertions.assertTrue(Files.exists(pathVar));

        // create empty files with .txt extension
        for (int i = 1; i <= 5; i++) {
            Path filePath = Paths.get(pathVar + "/file" + i + ".txt");
            Files.createFile(filePath);
            Assertions.assertTrue(Files.exists(filePath));
        }

        // create empty file without extension
        Path filePath = Paths.get(pathVar + "/file6");
        Files.createFile(filePath);
        Assertions.assertTrue(Files.exists(filePath));

        // Create Directory inside folder
        Path insideFolder = Paths.get(pathVar + "/InsideFolder");
        Files.createDirectory(insideFolder);
        Assertions.assertTrue(Files.exists(insideFolder));

        // create empty files in insidefolder
        for (int i = 1; i <= 3; i++) {
            Path inFilePath = Paths.get(insideFolder + "/infile" + i + ".txt");
            Files.createFile(inFilePath);
            Assertions.assertTrue(Files.exists(inFilePath));
        }

        // List files.Directories etc
        Files.list(pathVar).forEach(System.out::println);
        Files.newDirectoryStream(insideFolder).forEach(System.out::println);
    }

}