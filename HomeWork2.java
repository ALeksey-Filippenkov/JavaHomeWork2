import java.util.Scanner;

/**
 * HomeWork2
 */
public class HomeWork2 {
    public static void main(String[] args) throws Exception {

        String [] list = lib.ReadLineFromFile("dataForSelect.txt"); 
        System.out.println(list[0]); 

        StringBuilder resultSelect =  Task1.ParseString(list[0]);
        System.out.println(resultSelect);

        Scanner in = new Scanner(System.in);
        System.out.println("Введите длинну массива");
        int size = in.nextInt();
        int[] array = Task2.CreatArray(size);
        Task2.BubbleSorting(array);     
        in.close();

        String [] arrayData =  lib.ReadLineFromFile("dataForSelect2.txt");
        for(int i = 0; i < arrayData.length; i++) 
            System.out.println(Task3.ParsingString(arrayData[i]));


        System.out.print("\nPlease enter the operation I remind you that: \n1. Addition is (+) \n2. Subtraction is (-) \n3. Multiplication is (/) \n4. Division is (*) \nEnter the operation: "); 
        char operation = in.nextLine().charAt(0);
        System.out.print("Please enter the first number: ");         
        double number1 = in.nextDouble(); 
        System.out.print("Please enter the second number: "); 
        double number2 = in.nextDouble(); 
        double result = Task4.Operations (operation, number1, number2);
        System.out.printf("%f ", result);

        
    }
}



