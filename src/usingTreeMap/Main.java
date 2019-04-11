package usingTreeMap;

import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {

        /* Создать класс Test2:
         * - сделать чтобы этот класс implements Comparable;
         * - создать TreeMap;
         * - создать любое количество объектов класса Test2 и добавить их в TreeMap;
         * - вывести на консоль значение всех ключей и значений с помощью метода entrySet();
         * - вывести на консоль значение всех ключей и значений с помощью метода keySet(). */

        Test test1 = new Test(22, "Karina");
        Test test2 = new Test(27, "Vika");
        Test test3 = new Test(19, "Dasha");
        Test test4 = new Test(25, "Anna");

        Map<Test, Test> treeMap = new TreeMap<>();
        treeMap.put(test1, test2);
        treeMap.put(test2, test4);
        treeMap.put(test3, test1);

        System.out.println("Output using entrySet():\n");
        showUsingEntrySet(treeMap);

        System.out.println("\nOutput using keySet():\n");
        showUsingKeySet(treeMap);

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
