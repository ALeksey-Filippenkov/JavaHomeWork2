// 3.** Дана json-строка (можно сохранить в файл и читать из файла)
// [{"фамилия":"Иванов","оценка":"5","предмет":"Математика"},
// {"фамилия":"Петрова","оценка":"4","предмет":"Информатика"},
// {"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]
// Написать метод(ы), который распарсит json и, используя StringBuilder, создаст строки вида: 
// Студент [фамилия] получил [оценка] по предмету [предмет].

// Пример вывода:
// Студент Иванов получил 5 по предмету Математика.
// Студент Петрова получил 4 по предмету Информатика.
// Студент Краснов получил 5 по предмету Физика.

public class Task3 {
    public static StringBuilder ParsingString(String str) 
    {
        str = str.replace("{", "")
                .replace("}", "")
                .replaceAll("\"", "")
                .replace("[", "")
                .replace("]", "");
        String[] array = str.split(",");

        String[] list = { "Студент ", " получил ", " по предмету " };

        StringBuilder result = new StringBuilder("");
        for (int i = 0; i < array.length; i++) 
        {
            String[] arr = array[i].split(":");
            result.append(list[i]);
            result.append(arr[1]);
        }
        return result;
    }
}
