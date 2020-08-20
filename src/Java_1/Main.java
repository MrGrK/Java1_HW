package Java_1;

import com.sun.scenario.effect.impl.state.AccessHelper;

public class Main {

    public static void main(String[] args) {
        int xInt = 10000000;
        byte xByte = 10;
        long xLong = 10000000000l;
        float xFloat = 1.999f;
        double xDouble = 1.8888232323232;
        boolean xBool = false;
        char xCh = 's';
        String xStr = "dsdasd";
        //Task3----------------------------------------------
        System.out.println(Task3(2, 3, 4, 5));
        //Task4----------------------------------------------
        System.out.println( CheckSum(6, 4));
        System.out.println(CheckSum(6, 14));
        System.out.println(CheckSum(6, 15));
        //Task5----------------------------------------------
        CheckNumber(-1);
        CheckNumber(0);
        CheckNumber(1);
        //Task6----------------------------------------------
        System.out.println(CheckNumberState(-1));
        System.out.println(CheckNumberState(0));
        System.out.println(CheckNumberState(1));
        //Task7----------------------------------------------
        SeyHello("Вася");
        //Task8----------------------------------------------
        CheckYear(0);//нет
        CheckYear(4);//да
        CheckYear(23);//нет
        CheckYear(100);//нет
        CheckYear(400);//да
        CheckYear(125);//нет
        CheckYear(492);//да
        CheckYear(600);//да
    }

    private static int Task3(int pA, int pB, int pC, int pD)
    {
        return pA*(pB+(pC/pD));
    }

    private static boolean CheckSum(int pA, int pB)
    {
        return (pA+pB>=10) && (pA +pB <=20);
    }

    private static void CheckNumber(int pA)
    {
        if (pA >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }


    private static boolean CheckNumberState(int pA)
    {
        return  pA >= 0;
    }

    private static void SeyHello(String pName)
    {
        System.out.println("Привет, "+pName+"!");
    }

    private static void CheckYear(int pA)
    {
        if(pA<0)
        {
            System.out.println("Ввели отрицательное число");
            return;
        }

        if (pA%4==0)
        {
            if(pA%100==0)
            {
                if (pA%400==0)
                {
                    System.out.println("Год високосный!");
                }
                else
                {
                    System.out.println("Год не високосный!");
                }
            }
            else
            {
                System.out.println("Год високосный!");
            }
        }
        else
        {
          System.out.println("Год не високосный!");
        }
    }
}
