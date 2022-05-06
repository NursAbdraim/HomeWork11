package com.company;

import java.awt.geom.Area;

public class Triangle {

    int a;
    int b;
    int c;

    public void area(){
        float p = (a+b+c)/2f;
        double areaOfTriangle = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        System.out.println("The area of a triangle is: "+areaOfTriangle);
    }
}
