package pl.javastart.task;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] arrays = new double[5];

        for (int i = 0; i < arrays.length; i++) {
            System.out.println("Wprowadź " + arrays.length + " liczb");
            arrays[i] = scanner.nextDouble();
        }
        for (double element : arrays) {
            System.out.println("Suma kwadratów liczb zmiennoprzecinkowych wynosi: "
                    + (arrays[0] * arrays[0] + arrays[1] * arrays[1] + arrays[2] * arrays[2]
                            + arrays[3] * arrays[3] + arrays[4] * arrays[4]));
        }
    }
}
