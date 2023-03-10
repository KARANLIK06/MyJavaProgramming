package day25_CustomMethods_Overloading;

public class SumOfNumbers {
    public static void main(String[] args) {
        /*
        Task1:
    1. create a method that can find the sum of two numbers
                    method name:sumOf2Numbers
    2. create a method that can find the sum of three numbers
                    method name:sumOf3Numbers
    3. create a method that can find the sum of four numbers
                    method name:sumOf4Numbers

         */
        int sum2 = SumOf2Numbers(10,20);
        System.out.println("sum2 = " + sum2);

        int sum3 = SumOf3Numbers(10,20,30);
        System.out.println("sum3 = " + sum3);

        int sum4 = SumOf4Numbers(10,20,30,40);
        System.out.println("sum4 = " + sum4);

    }


    public static int SumOf2Numbers(int num1,int num2){
        return num1+num2;
    }

    public static int SumOf3Numbers(int num1,int num2,int num3){
        return num1+num2+num3;
    }
    public static int SumOf4Numbers(int num1,int num2,int num3,int num4){
        return num1+num2+num3+num4;
    }
}
