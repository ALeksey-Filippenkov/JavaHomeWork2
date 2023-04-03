import java.io.*;

public class lib {
    // Считывание строк с файла
    public static String[] ReadLineFromFile(String pathway) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader(pathway));
        String str;
        int size = 0;
        while ((str = br.readLine()) != null) 
            size ++;
        br.close();
        String[] listData = new String[size];

        int i = 0;
        BufferedReader br1 = new BufferedReader(new FileReader(pathway));
        while ((str = br1.readLine()) != null) {
            listData[i] = str;
            i ++;
        }
        br1.close();
        return listData;

    }

    // Печать массива чисел
    public static void printArrayInt(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) 
            System.out.printf("%d, ", arr[i]);
        System.out.print(arr[arr.length - 1]);
    }

    public static void printArraeString(String[] arr) {
        for (String string : arr) 
            System.out.println(string);
    }
}
