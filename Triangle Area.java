// Program to calculate triangle area

import java.util.Scanner;

class TriangleArea {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter base in cm: ");
        double base = input.nextDouble();

        System.out.print("Enter height in cm: ");
        double height = input.nextDouble();

        double areaCm = 0.5 * base * height;
        double conversionFactor = 2.54;

        double areaInches = areaCm / (conversionFactor * conversionFactor);

        System.out.println("Area in sq cm = " + areaCm);
        System.out.println("Area in sq inches = " + areaInches);

        input.close();
    }
}
