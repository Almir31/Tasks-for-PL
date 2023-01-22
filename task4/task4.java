import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class task4 {
    public static void main(String[] args) throws FileNotFoundException {
        String s1 = args[0];

        Scanner scn;
        Scanner scn2=new Scanner(new File(s1));
        Scanner scn3=new Scanner(new File(s1));

        int a=0;

        try {
            scn = new Scanner(new File(s1));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "");
        }
        int x;
        while (scn2.hasNext()) {
            x = scn2.nextInt();
            a++;
        }

        float [] nums = new float [a];

        int i = 0;

        while (scn3.hasNext()) {
            nums [i] = scn3.nextFloat();
            i++;
        }

        float S=0;
        for (int j=0; j<nums.length; j++){
            S+=nums[j];
        }

        float s = S/a;

        float [] nums2 = new float[nums.length];

        for (int j=0; j< nums.length; j++){
         float c = (s-nums[j]);
         if (c>=0) {
             nums2[j]=c;
         }
         else {
             nums2[j]=c*-1;
         }
        }

        int b = 0;
        int d=0;

        for(int j = 0; j < nums2.length; ++j) {
            for(int y = j + 1; y < nums2.length && nums2[j] < nums2[y]; b = y++) {
            }

            if (b == nums2.length - 1 | j == nums2.length - 1) {
                d=j;
                break;
            }
        }

        int f=0;
        for (int j=0; j< nums.length; j++){
            if (j!=d){
                if (nums[d]<=nums[j]){
                    f+=(nums[j]-nums[d]);
                }
                else f+= nums[d]-nums[j];
            }
        }

        System.out.println(f);
    }
}
