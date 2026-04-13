import java.util.Scanner;

class EmployeeBonus {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int size = 10;
        double[] salary = new double[size];
        double[] years = new double[size];
        double[] bonus = new double[size];
        double[] newSalary = new double[size];

        double totalBonus = 0;

        for (int i = 0; i < size; i++) {
            System.out.print("Enter salary of employee " + (i + 1) + ": ");
            salary[i] = input.nextDouble();

            System.out.print("Enter years of service: ");
            years[i] = input.nextDouble();

            if (salary[i] <= 0 || years[i] < 0) {
                System.err.println("Invalid input.");
                i--;
                continue;
            }
        }

        for (int i = 0; i < size; i++) {
            if (years[i] > 5) {
                bonus[i] = salary[i] * 0.05;
            } else {
                bonus[i] = salary[i] * 0.02;
            }

            newSalary[i] = salary[i] + bonus[i];
            totalBonus += bonus[i];
        }

        System.out.println("Total Bonus = " + totalBonus);

        input.close();
    }
}
