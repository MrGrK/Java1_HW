package Java_1;

import com.sun.scenario.effect.impl.state.AccessHelper;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args)
    {
        //Задать целочисленный массив, состоящий из элементов 0 и 1.
        //Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
        //С помощью цикла и условия заменить 0 на 1, 1 на 0
        int[] xArr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println( Arrays.toString(xArr));
        changeArray(xArr);
        System.out.println( Arrays.toString(xArr));
        //Задать пустой целочисленный массив размером 8.
        //С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
        xArr = new int[8];
        System.out.println("\n"+ Arrays.toString(xArr));
        fillInArray(xArr);
        System.out.println( Arrays.toString(xArr));
        //Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
        //пройти по нему циклом, и числа меньшие 6 умножить на 2
        xArr = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("\n"+ Arrays.toString(xArr));
        multiplyArrElem(xArr);
        System.out.println( Arrays.toString(xArr));
        // Создать квадратный двумерный целочисленный массив
        // (количество строк и столбцов одинаковое),
        // и с помощью цикла(-ов) заполнить его диагональные элементы единицами
        int[][] xArr2 = new int[5][5];
        System.out.println();
        printArray2D(xArr2);
        fillDiagonal(xArr2);
        System.out.println();
        printArray2D(xArr2);

        // Задать одномерный массив и найти
        // в нем минимальный и максимальный элементы (без помощи интернета)
        xArr = new int[10];
        fillInArrayRandom(xArr);
        System.out.println("\n"+ Arrays.toString(xArr));
       // System.out.println(Arrays.stream(xArr).min());
       // System.out.println(Arrays.stream(xArr).max());
        System.out.println("Минимальное значение - "+getMinArrElem(xArr));
        System.out.println("Максимальное значение - "+getMaxArrElem(xArr));
        //** Написать метод, в который передается не пустой одномерный
        // целочисленный массив, метод должен вернуть true, если в массиве
        // есть место, в котором сумма левой и правой части массива равны.
        // Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true,
        // checkBalance([1, 1, 1, || 2, 1]) → true,
        // граница показана символами ||, эти символы в массив не входят.
        xArr = new int[]{1, 1, 1,  2, 1};
        System.out.println("\n"+ Arrays.toString(xArr));
        System.out.println(checkBalance(xArr));
        xArr = new int[]{2, 2, 2, 1, 2, 2, 10, 1};
        System.out.println("\n"+ Arrays.toString(xArr));
        System.out.println(checkBalance(xArr));
        xArr = new int[]{2, 2, 2, 1, 2, 2, 10, 1231};
        System.out.println("\n"+ Arrays.toString(xArr));
        System.out.println(checkBalance(xArr));
        // Написать метод, которому на вход подается одномерный массив и число n
        // (может быть положительным, или отрицательным),
        // при этом метод должен сместить все элементымассива на n позиций.
        // Для усложнения задачи нельзя пользоваться вспомогательными массивами
        //ToDo задача 7.
    }

    private static void arrBias(int[]pArr, int pN){
        int xTmp =0;
        int xTmp2 =0;
        int xTargetIndex = 0;
        int xCurIndex = 0;
        String xStr = "";
        if(pN>pArr.length)
        {
            pN = pArr.length%pN;
        }
        if(pN>=0)
        {
            for (int i =0;i< pArr.length;i++){

                xTargetIndex = i+pN;
                if(xTargetIndex >= pArr.length)
                {
                    xTargetIndex = xTargetIndex - pArr.length;
                    xTmp = pArr[xTargetIndex];
                    pArr[xTargetIndex] = pArr[i];
                    i = xTargetIndex;
                    xTargetIndex = i+pN;
                    if(xTargetIndex >= pArr.length)
                    {
                        xTargetIndex = xTargetIndex - pArr.length;
                        xTmp2 = pArr[xTargetIndex];
                        pArr[xTargetIndex] = pArr[i];
                        i = xTargetIndex;

                    }
                    else
                    {
                        xTmp2 = pArr[xTargetIndex];
                        pArr[xTargetIndex] = pArr[i];
                        i = xTargetIndex;
                    }
                }
                else
                {
                    xTmp = pArr[xTargetIndex];
                    pArr[xTargetIndex] = pArr[i];
                    i = xTargetIndex;
                }
            }
        }
        else
            for (int i =0;i< pArr.length;i++){
  //              if(i+pN >)
            }
    }

    private static boolean checkBalance(int[]pArr){
        int xRightSum = 0;
        int xLeftSum = 0;

        for (int k = 1;k < pArr.length;k++){
            xRightSum = 0;
            xLeftSum = 0;
            for (int i =0; i<k;i++) {
                xRightSum+=pArr[i];
            }
            for (int i =k; i<pArr.length;i++) {
                xLeftSum+=pArr[i];
            }
            if (xRightSum == xLeftSum)
                return true;

        }
        return false;
    }

    private static void fillDiagonal(int[][] pArr){
        for (int i =0; i<pArr.length;i++) {
            for (int j=0;j<pArr[i].length;j++)
            {
                if(i==j||j+i == pArr.length-1)
                    pArr[i][j]=1;
                else
                   continue;
            }
        }
    }

    private static void printArray2D(int[][] pArr){
        for (int i =0; i<pArr.length;i++) {
            for (int j=0;j<pArr[i].length;j++)
            {
                System.out.print(" " + pArr[i][j]);
            }
            System.out.println();
        }
    }

    private static int  getMinArrElem(int[] pArr){
        int xMin = pArr[0];
        for (int i =0; i<pArr.length;i++) {
            if(xMin > pArr[i])
                xMin = pArr[i];
        }
        return xMin;
    }


    private static int  getMaxArrElem(int[] pArr){
        int xMax = pArr[0];
        for (int i =0; i<pArr.length;i++) {
            if(xMax < pArr[i])
                xMax = pArr[i];
        }
        return xMax;
    }

    private static void  fillInArrayRandom(int[] pArr){
        Random xRand = new Random();
        for (int i =0; i<pArr.length;i++) {
            pArr[i]=xRand.nextInt(100);
        }
    }

    private static void  fillInArray(int[] pArr){
        for (int i =0; i<pArr.length;i++) {
            pArr[i]=i*3;
        }
    }

    private static void  multiplyArrElem(int[] pArr){
        for (int i =0; i<pArr.length;i++) {
            pArr[i] = pArr[i]<6?pArr[i]*2:pArr[i];
        }
    }
    private static void  changeArray(int[] pArr){
        for (int i =0; i<pArr.length;i++) {
            if(pArr[i]==0)
                pArr[i]=1;
            else
                pArr[i]=0;
        }
    }
}