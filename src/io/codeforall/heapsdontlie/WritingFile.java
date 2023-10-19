package io.codeforall.heapsdontlie;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WritingFile {
    FileInputStream inputStream = new FileInputStream("resource/Sans.jpeg");
    FileOutputStream outputStream = new FileOutputStream("resource/Sans2.jpeg");

    byte[] buffer = new byte[1024];

    public WritingFile() throws FileNotFoundException {
    }

    public void readAndWrite() throws IOException {
        int num = 0;
        while (num != -1) {
            num = inputStream.read(buffer);
            if (num != -1) {
                outputStream.write(buffer, 0, num);
            }
        }
        inputStream.close();
        outputStream.close();
    }

}
