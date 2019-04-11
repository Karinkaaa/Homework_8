package usingHashMap.secondTask;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        /* Создать класс Test:
         * - переопределить методы equals и hashCode;
         * - создать любое количество объектов класса тест;
         * - добавить их в HashMap в качестве ключей и значений;
         * - вывести на консоль значение всех ключей и значений с помощью метода entrySet();
         * - вывести на консоль значение всех ключей и значений с помощью метода keySet(). */

        Test test1 = new Test(1, "one");
        Test test2 = new Test(2, "two");
        Test test3 = new Test(3, "three");
        Test test4 = new Test(4, "four");

        Map<Test, Test> map = new HashMap<>();
        map.put(test1, test2);
        map.put(test1, test3);
        map.put(test3, test4);

        System.out.println("Output using entrySet():\n");
        showUsingEntrySet(map);

        System.out.println("\nOutput using keySet():\n");
        showUsingKeySet(map);

    }

    private static void showUsingEntrySet(Map<Test, Test> map) {

        for (Map.Entry entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey());
            System.out.println("Value: " + entry.getValue() + "\n");
        }
    }

    private static void showUsingKeySet(Map<Test, Test> map) {

        for (Test key : map.keySet()) {
            System.out.println("Key: " + key + "\nValue: " + map.get(key) + "\n");
        }
    }
}
