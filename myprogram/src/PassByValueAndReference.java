public class PassByValueAndReference {

    public static void main(String[] args) {

        int x = 0;
        incrementValue(x);
        System.out.println("x=" + x); //output x =0


        //pass by reference: change the value
        Point point = new Point(100,200);
        changePoint1(point);
        changePoint2(point);
        System.out.println("x = " + point.x + ", y=" + point.y);

    }

    //pass by value: pass a copy of actual value of x, so it does not change the value of x
    //becasue we create another variable vallue in our memory
    static void incrementValue(int value){
        value ++;
    }


    //reference: muttating
    static void changePoint1(Point point1){
        point1.x = 1;
        point1.y=1;
    }

    static void changePoint2(Point point2){
        point2.x = 2;
        point2.y=2;
    }

    static class Point{
        int x;
        int y;
        Point(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
}
