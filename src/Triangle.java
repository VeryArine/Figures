import java.lang.System;
import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Triangle extends Figures{

    public int a;
    public int b;
    public int c;

    ArrayList<String> array = new ArrayList<>();
    ArrayList<String> errors = new ArrayList<>();
    ArrayList<Integer> sides = new ArrayList<>();

    private ArrayList<Integer> inputNumbers () {
        Scanner scanner = new Scanner(System.in);
        do{
        System.out.println("Введите стороны треугольника через пробел");
            for (int i = 0; i < 3; i++) {
                array.add(i, scanner.next());
                }
            try{
                int a = Integer.parseInt(array.get(0));
                int b = Integer.parseInt(array.get(1));
                int c =Integer.parseInt(array.get(2));
                sides.add(a);
                sides.add(b);
                sides.add(c);
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                    errors.add(String.valueOf(array));
                    array.clear();
                }
            } while (sides.size() < 3);
        System.out.println("Ошибки ввода" + errors);
        return sides;
        }

    private void setSides() {
        this.a = sides.get(0);
        this.b = sides.get(1);
        this.c = sides.get(2);
    }

    public double planeArea () {

    inputNumbers();
    setSides();
    double p = (double) (this.a + this.b + this.c) / 2;
    super.planeArea = sqrt(p * (p - this.a) * (p - this.b) * (p - this.c));
    return planeArea;
    }

    @Override
    public void printArea () {
        System.out.println("Площадь треугольника равна " + planeArea);
    }

}

