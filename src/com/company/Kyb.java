package com.company;

import java.io.*;
import java.util.Scanner;

public class Kyb {
    public void function() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("___________________");
        System.out.println("Сторона куба а:");
        int a = scanner.nextInt();
        int V = a * a * a;
        System.out.println("Объем:" + V);
        double S = 6 * Math.pow(a, 2);
        System.out.println("Площадь Куба:" + S);


        System.out.println("Сторона куба а2:");
        int a2 = scanner.nextInt();
        int V2 = a2 * a2 * a2;
        System.out.println("Объем:" + V2);
        double S2 = 6 * Math.pow(a2, 2);
        System.out.println("Площадь Куба:" + S2);


        System.out.println("Сторона куба а3:");
        int a3 = scanner.nextInt();
        int V3 = a3 * a3 * a3;
        System.out.println("Объем:" + V3);
        double S3 = 6 * Math.pow(a3, 2);
        System.out.println("Площадь Куба:" + S3);

        if (S > S2) {
            if (S > S3) {
                System.out.println(" Наибольшая Площадь Куба:" + S);
            }
        }

        if (S2 > S) {
            if (S2 > S3) {
                System.out.println("Наибольшая Площадь Куба:" + S2);
            }
        }

        if (S3 > S) {


            if (S3 > S2) {
                System.out.println("Наибольшая Площадь Куба:" + S3);
            }
        }

        File myFile = new File("Kyb.txt");

        try {
            PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(myFile)));
            writer.println("Сторона куба а:" + a + "\n" + "Объем:" + V + "\n" + "Площадь Куба:" + S + "\n"
                    + "Сторона куба а2:" + a2 + "\n" + "Объем:" + V2 + "\n" + "Площадь Куба:" + S2
                    + "\n" + "Сторона куба а3:" + a3 + "\n" + "Объем:" + V3 + "\n" + "Площадь Куба:" + S3);
            writer.flush();
            writer.close();
        } catch (
                IOException ex) {
            ex.printStackTrace();
        }
    }
}
