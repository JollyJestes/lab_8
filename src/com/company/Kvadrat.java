package com.company;

import java.io.*;
import java.util.Scanner;

public class Kvadrat {

    public void function() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Сторона квадрата а:");
        int a = scanner.nextInt();
        //Периметр
        int P = 4 * a;
        System.out.println("Периметр:" + P);
        //Площадь
        int S = a * a;
        System.out.println("Площадь:" + S);
        //Диагональ
        double d = a * Math.sqrt(2);
        System.out.println("Диагональ:" + d);


        System.out.println("Сторона квадрата а2:");
        int a2 = scanner.nextInt();
        //Периметр
        int P2 = 4 * a2;
        System.out.println("Периметр:" + P2);
        //Площадь
        int S2 = a2 * a2;
        System.out.println("Площадь:" + S2);
        //Диагональ
        double d2 = a2 * Math.sqrt(2);
        System.out.println("Диагональ:" + d2);


        System.out.println("Сторона квадрата а3:");
        int a3 = scanner.nextInt();
        //Периметр
        int P3 = 4 * a3;
        System.out.println("Периметр:" + P3);
        //Площадь
        int S3 = a3 * a3;
        System.out.println("Площадь:" + S3);
        //Диагональ
        double d3 = a3 * Math.sqrt(2);
        System.out.println("Диагональ:" + d3);

        int A = (a * a2 * a3) / 3;
        System.out.println("Средняя площадь квадратов " + A);


        File myFile = new File("kvadrat.txt");

        try {
            PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(myFile)));
            writer.println("Сторона квадрата а:" + a + "\n" +
                    "Периметр:" + P + "\n" + "Площадь:" + S + "\n" + "Диагональ:" +
                    d + "\n" + "Сторона квадрата а2:" + a2 + "\n" + "Периметр:" + P2 + "\n" + "Площадь:" + S2
                    + "\n" + "Диагональ:" + d2 + "\n" + "Сторона квадрата а3:" + a3 + "\n" + "Периметр:" + P3 + "\n" +
                    "Площадь:" + S3 + "\n" + "Диагональ:" + d3 + "\n" + "Средняя площадь квадратов " + A);
            writer.flush();
            writer.close();
        } catch (
                IOException ex) {
            ex.printStackTrace();
        }
    }

}
