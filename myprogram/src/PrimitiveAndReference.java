//primitive type: int, double, ...
//reference type: Object

public class PrimitiveAndReference {

    public static void main(String[] args) {
        //Primitive type
        int a =10;
        int b=a;
        a=100;
        System.out.println(a + ", " + b);

        //Reference Type
        // Person("Alex") is object
        // alex is reference type pointing to Object Alex
        Person alex = new Person("Alex");
        Person mariam = alex;
        System.out.println(alex.name + ", " + mariam.name);
    }

    static class Person{
        String name;

        Person(String name){
            this.name = name;
        }
    }

}
