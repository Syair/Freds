package package1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by wu on 2017-01-17.
 */
public class Fred {
    public static void main(String [] args){
        System.out.println("sssabihihuihuihuihui");
        File sourceFile = new File("cccccc.text");
        try {
            sourceFile.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try{
            Scanner scanner = new Scanner();
        }
    }
    public static void makePizzaFromeile(File file)
    {
        try {
            Scanner scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
