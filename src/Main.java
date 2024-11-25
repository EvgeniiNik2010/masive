import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 1");
        int[] num = {1,2,3};
        double[] num1 = {1.57, 7.654, 9.986};
        long[] num3 = {5, 0, 96, 33, 89, 77, 100};
        System.out.println();

        System.out.println("Задача 2");
        for (int i = 0; i < num.length; i++) {
            if (i == num.length - 1) {
                System.out.println(num[i]);
                break;
            }
            System.out.print(num[i] + ",");
        }
        for (int i = 0; i < num1.length; i++) {
        if (i == num1.length - 1) {
            System.out.println(num1[i]);
            break;
        }
        System.out.print(num1[i] + ",");
    }
        for (int i = 0; i < num3.length; i++) {
            if (i == num3.length - 1) {
                System.out.println(num3[i]);
                break;
            }
            System.out.print(num3[i] + ",");
        }
        System.out.println("Задача 3");

        for (int i = num.length-1; i >=0; i=i-1) {
            if (i == 0) {
                System.out.println(num[i]);
                break;
            }
            System.out.print(num[i] + ",");
        }
        for (int i = num1.length-1; i >=0; i=i-1) {
            if (i == 0) {
                System.out.println(num1[i]);
                break;
            }
            System.out.print(num1[i] + ",");
        }
        for (int i = num3.length-1; i >=0; i=i-1) {
            if (i == 0) {
                System.out.println(num3[i]);
                break;
            }
            System.out.print(num3[i] + ",");
        }
        System.out.println("Задача 4");
        for (int i = 0; i < num.length; i++){
            if (num[i]%2 != 0){
                num[i]+=1;
            }
        }
        System.out.println(Arrays.toString(num));

    }
}