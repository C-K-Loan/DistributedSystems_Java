package FiddlingAround.Java.Nio.Examples;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.*;

public class WritingStuff {

    public static void main(String[] args) {
        // Prints "Hello, World" in the terminal window.
        new File("C:\\Directory1").mkdir();



/*
        //Creating a File
        Charset charset = Charset.forName("US-ASCII");
        String s = "BLA";

        try (BufferedWriter writer = Files.newBufferedWriter(file, charset)) {
            writer.write(s, 0, s.length());
        } catch (IOException x) {
            System.err.format("IOException: %s%n", x);
        }
*/
    }
}
