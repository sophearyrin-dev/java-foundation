package datastructure;

import java.util.Optional;

public class UsingOptional {

    public static void main(String[] args) {
        String name = "Hello";

      String check = Optional.ofNullable(name).orElse("Pheary");
        System.out.println(check);
    }
}
