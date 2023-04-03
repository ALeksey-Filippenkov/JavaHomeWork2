    // 2. Реализуйте алгоритм сортировки пузырьком числового массива, результат после
    // каждой итерации запишите в лог-файл.

import java.io.*;
import java.util.Arrays;
import java.util.Random;
import java.io.FileOutputStream;
import java.io.IOException;

public class Task2 {

    static int[] CreatArray(int size) throws IOException 
    {
        Random random = new Random();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) 
        {
            array[i] = random.nextInt(100);
        }
        return array;
    }

    static void BubbleSorting(int[] arr) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new OutputStreamWriter
        (new FileOutputStream("C:\\Users\\fil_a\\Desktop\\Учеба\\Java\\HomeWork2\\BubbleSorting.txt")))) {
        }
        for (int i = 0; i < arr.length; i++) 
        {
            for (int j = i + 1; j < arr.length; j++) 
            {
                if (arr[i] > arr[j]) 
                {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;   
                    Writer(arr);                 
                }
            }
        }
    }

    static void Writer(int[] arr) throws IOException {
         BufferedWriter writer = new BufferedWriter(new OutputStreamWriter
        (new FileOutputStream("C:\\Users\\fil_a\\Desktop\\Учеба\\Java\\HomeWork2\\BubbleSorting.txt", true), 
        "UTF-8"));
  
        writer.write(Arrays.toString(arr));
        writer.newLine();
        writer.close();
    }
}










    //     try 
    //     {
    //         File file = new File("BubbleSorting.txt");
    //         if (!file.exists()) 
    //         {
    //             file.createNewFile();
    //         }
    //         FileWriter fw = new FileWriter(file);
    //         BufferedWriter bw = new BufferedWriter(fw);
    //         for (int i = 0; i < arr.length; i++) 
    //         {
    //             bw.write(arr[i]);
    //         }
    //         bw.close();

    //     } 
    //     catch (IOException e) 
    //     {
    //         System.out.println("Error" + e);

    //     }

        // FileOutputStream fos = new
        // FileOutputStream("C:\\Users\\toshqaaa\\Desktop\\BubbleSorting.txt");
        // fos.write(toString().getBytes());
        // fos.close();
    // }

