package exceptionss;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class A {
    public static void main(String[] args) {
        String name = null;
        try{
            System.out.println(name.length());
        }catch (NullPointerException e){
            System.out.println(e);
        }

        //Checked Exception
        try {
            FileInputStream file = new FileInputStream("/Users/sophearyrin/Documents/Pheary_MIU/Spring/java-foundation/myprogram/src/exceptionss/myfile.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        //Unchecked Exception
        try{
            int a = 10/0;
            System.out.println(a);
        }catch (ArithmeticException e){
            System.out.println(e);
        }


    }
}
