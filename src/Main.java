import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] weight = new int[3];
        weight[0] = 1;
        weight[1] = 2;
        weight[2] = 3;
        {
            System.out.println();
        }
        double[] numbers = {1.57, 7.654, 9.986};
        {
            System.out.println();
        }
        int[] dayTemperature = {3, 5, 7, 8, 6, 4};
        System.out.println();

        int sugarWeight = weight[0];
        {
            System.out.print(" " + weight[0] + ",");
            System.out.print(" " + weight[1] + ",");
            System.out.print(" " + weight[2]);
        }

        System.out.println();
        for (int i = 0; i < 3; i++) {
            System.out.print(numbers[i]);
            if (i != numbers.length - 1)
                System.out.print(", ");
        }
        System.out.println();

        for (int a = 0; a < 6; a++) {
            System.out.print(" " + dayTemperature[a]);
            if (a != dayTemperature.length - 1)
                System.out.print(", ");
        }
        {
            System.out.println();
        }
        {
            System.out.print(" " + weight[2] + ",");
            System.out.print(" " + weight[1] + ",");
            System.out.print(" " + weight[0]);
        }
        {
            System.out.println();
        }
        for (int i = 2; i >= 0; i--) {
            System.out.print(numbers[i]);
            if (i != numbers.length - 3)
                System.out.print(", ");}{
        System.out.println();}

        for (int a = 5; a >= 0; a--) {
            System.out.print(" " + dayTemperature[a]);
            if (a != dayTemperature.length - 6)
                System.out.print(", ");}

        {System.out.println();}
        for (int a = 0; a < 6; a++)
            if (dayTemperature[a] % 2 != 0){
                dayTemperature [a] = dayTemperature [a] + 1;
                System.out.print(Arrays.toString(dayTemperature));
            }



    }
}















