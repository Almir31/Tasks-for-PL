import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class task2 {

    public static void main(String[] args) throws FileNotFoundException {

        String s1 = args[0];
        String s2 = args[1];

        Scanner scn;
        Scanner scn2 = new Scanner(new File(s1));
        Scanner scn3 = new Scanner(new File(s2));


        float x0;
        float y0;
        float radius0;
        float x1;
        float y1;
        float radius1;


        try {
            scn = new Scanner(new File(s1));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Файл не найден");
        }

        x0 = scn2.nextFloat();
        y0 = scn2.nextFloat();
        radius0 = scn2.nextFloat();

        try {
            scn = new Scanner(new File(s2));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Файл не найден");
        }


        float a, b;
        while (scn3.hasNext()) {
            x1 = scn3.nextFloat();
            y1 = scn3.nextFloat();

            if (x0 >= 0) {
                a = x0 - x1;
            } else {
                a = -1 * x0 + x1;
            }

            if (y0 >= 0) {
                b = y0 - y1;
            } else {
                b = -1 * y0 + y1;
            }

            radius1 = (float) Math.sqrt(a * a + b * b);

            if (radius1 < radius0) {
                System.out.print("1\n");
            } else if (radius1 > radius0) {
                System.out.print("2\n");
            } else if (radius1 == radius0) {
                System.out.print("0\n");
            }
        }
    }
}
