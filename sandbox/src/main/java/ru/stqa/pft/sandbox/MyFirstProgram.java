package ru.stqa.pft.sandbox;

public class MyFirstProgram {

  public static void main(String[] args) {
    String e = "world!"; // String  переменная для строки !
    System.out.print("Hello," + e);

    System.out.println(2 + 2);
    System.out.println(2 * 2);
    System.out.println(2 / 2);
    System.out.println(2 - 2);

    System.out.println(1.0 / 2);
    System.out.println(1 / 2.0);
    System.out.println(2.0 / 2);
    System.out.println("2" + "2");// конкотенация единственная операция для строк.

    System.out.println("2" + 2);

    System.out.println((2 + 2) * 2);

    System.out.println("2+2=" + (2 + 2));

    int l = 24; // int переменная для целых чисел!
    int s = l * l;
    System.out.println("Площадь квадрата со стороной" + l + "=" + s);

    double q = 8.0; // double  переменная для чисел с плавающей точкой .!
    double w = q * q;
    System.out.println("Площадь квадрата со стороной" + q + "=" + w);
  }
}
