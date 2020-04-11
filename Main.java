package com.codewithme;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your width:");
        double width=scanner.nextDouble();
        System.out.println("Enter your height:");
        double height=scanner.nextDouble();

        Retacgle retacgle=new Retacgle(width,height);
        System.out.println("Your Retacgle "+retacgle.display());
        System.out.println("Perimeter is "+retacgle.getPerimeter());
        System.out.println("Area is "+ retacgle.getArea());


    }

}

