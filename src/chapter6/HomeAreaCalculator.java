package chapter6;

import org.w3c.dom.css.Rect;

public class HomeAreaCalculator {

    public static void main(String args[]){

        /*
        Rectangle 1
         */

        //Create instance of rectangle class

        Rectangle room1 = new Rectangle();
        room1.setWidth(25);
        room1.setLength(50);
        double areaOfRoom1 = room1.calculateArea();

         /*
        Rectangle 2
         */

        Rectangle room2 = new Rectangle(30,75);
        double areaOfRoom2 = room2.calculateArea();

        double totalArea = areaOfRoom1+areaOfRoom2;
        System.out.println("Area of both rooms: "+ totalArea);
    }
}
