package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/*

0701 Массивный максимум

1. В методе initializeArray():
1.1. Создайте массив на 20 чисел
1.2. Считайте с консоли 20 чисел и заполните ими массив
2. Метод max(int[] array) должен находить максимальное число из элементов массива

Требования:
1.Метод initializeArray должен создавать массив из 20 целых чисел.
2.Метод initializeArray должен считать 20 чисел и вернуть их в виде массива.
3.Метод max должен возвращать максимальный элемент из переданного массива.
4.Метод main изменять нельзя.

*/

// public class Solution
public class Main {

    public static void main(String[] args) throws IOException {
        int[] array = initializeArray();
        int max = max(array);
        System.out.println(max);
    }

    public static int[] initializeArray() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int [] res = new int[20];

        for (int i=0; i < res.length; i++) {
            res[i] = Integer.parseInt(br.readLine());
        }
        return res;
    }
    public static int max(int[] array) {
        int res=array[0];
        for(int i=0; i < array.length; i++) {
            if(res<array[i])
                res=array[i];
        }
        return res;
    }
}











