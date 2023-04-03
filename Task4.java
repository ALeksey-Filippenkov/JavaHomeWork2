// 4.* К калькулятору из предыдущего дз добавить логирование.

public class Task4 {
    public static int Sum (int number)
        {
            int sum = 0;
            for (int i = 1; i <= number ; i++)
                sum += i;
            return sum;
        }
    public static boolean IsPrime(int number)
    {
        for (int i = 2; i < number; i++) 
        { 
            if (number % i == 0) 
                return false; 
        } 
        return true; 
    }     
    
    public static double Operations (char operation, double number1, double number2)
    {
        switch (operation) 
        {
            case '+':
            case '1': return number1 + number2;
            case '-':
            case '2': return number1 - number2;
            case '/':
            case '3': return number1 / number2;
            case '*':
            case '4': return number1 * number2;
            default:
                System.out.print("Данная операция не предусмотрена в калькуляторе");
                return 0;

        }
    }
}
