package telran;

//Напишите программу, которая обходит папку и находит все файлы с расширением java и печатает
//
//Например
//folder1/
//    File1.java
//    File2.txt
//    File3.java
//    File4.jpg
//    File5.java
//
//Вывод
//File1.java
//File3.java
//File5.java
//
//public static void traverseFolder(String rootFolderPath) {
//
//}

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileReadingDemo {

    public static void main(String[] args) throws IOException {

       String rootFolderPath = "C:\\Javaprojekt\\lesson 17\\src\\forder1";

       traverseFolder(rootFolderPath);
    }

    public static void traverseFolder(String rootFolderPath){

        File directory = new File(rootFolderPath);
        String type = "java";
        File[] files = directory.listFiles();
        for(int i = 0; i < files.length; i++){
            String end = files[i].getName().substring((int) 6);
            if(end.equals(type)){
                System.out.println(files[i].getName());
            }
        }
    }
}
// почему не работает: files[i].getName().substring(files[i]length()-5)) я с джавой на вы...