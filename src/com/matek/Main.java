package com.matek;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\matew\\Desktop\\demo\\test.jpg");

        // open stream
        InputStream inputStream = new FileInputStream("C:\\Users\\matew\\Desktop\\demo\\test.jpg");
        OutputStream outputStream = new FileOutputStream("C:\\Users\\matew\\Desktop\\copyto\\testcopy.jpg");

        // file read
        byte[] buf = new byte[(int) file.length()];
        inputStream.read(buf);

        // file write
        outputStream.write(buf);
        outputStream.flush();
        inputStream.close();
    }
}
