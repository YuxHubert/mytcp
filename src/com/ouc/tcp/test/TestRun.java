package com.ouc.tcp.test;

import com.ouc.tcp.app.SystemStart;

import java.io.*;

public class TestRun {
    public static void main(String[] args) throws InterruptedException, IOException {
        // 重定向文件流到文件中
//        File f = new File("console out.txt");
//        boolean isFileCreated = f.createNewFile();
//        if (isFileCreated) {
//            FileOutputStream fileOutputStream = new FileOutputStream(f);
//            PrintStream printStream = new PrintStream(fileOutputStream);
//            System.setOut(printStream);
//        } else {
//            // 文件创建失败时的处理代码
//            System.out.println("Failed to create the file.");
//        }
        SystemStart.main(null);
    }
}
