// Дана строка sql-запроса "select * from students where ". Сформируйте часть WHERE этого запроса, используя StringBuilder. 
// Данные для фильтрации приведены ниже в виде json-строки.
// Если значение null, то параметр не должен попадать в запрос.

// Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}

public class Task1 {

    static StringBuilder ParseString(String str)
    {
        String line = str.replace("{", "")
                         .replace("}", "")
                         .replaceAll("\"", "");
        System.out.println(line);
        StringBuilder result = new StringBuilder("select * from students where ");

        String [] arrayData = line.split(", ");
        for (int i =0; i < arrayData.length; i++) 
        {
            String[] arrData = arrayData[i].split(":");
            if(arrData[1].equals("null") == false) 
            {
                if (i != 0) 
                {
                    result.append(", ")
                            .append(arrData[0])
                            .append(" = ")
                            .append(arrData[1]);
                } 
                else 
                {
                    result.append(arrData[0])
                            .append(" = ")
                            .append(arrData[1]);
                }
            }         
        }
        return result;
    }
}
