package usingLinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        /* Создать linkedhashmap, занести в нее любые 10 пар ключ-значение (типа String):
         * - вывести на консоль значение всех ключей и значений с помощью метода entrySet();
         * - вывести на консоль значение всех ключей и значений с помощью метода keySet(). */

        Map<String, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("1", "one");
        linkedHashMap.put("4", "four");
        linkedHashMap.put("9", "nine");
        linkedHashMap.put("8", "eight");
        linkedHashMap.put("2", "two");
        linkedHashMap.put("10", "ten");
        linkedHashMap.put("5", "five");
        linkedHashMap.put("3", "three");
        linkedHashMap.put("6", "six");
        linkedHashMap.put("7", "seven");

        System.out.println("Output using entrySet():\n");
        showUsingEntrySet(linkedHashMap);

        System.out.println("\nOutput using keySet():\n");
        showUsingKeySet(linkedHashMap);
    }

    private static void showUsingEntrySet(Map<String, String> map) {

        for (Map.Entry entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey());
            System.out.println("Value: " + entry.getValue() + "\n");
        }
    }

    private static void showUsingKeySet(Map<String, String> map) {

        for (String key : map.keySet()) {
            System.out.println("Key: " + key + "\nValue: " + map.get(key) + "\n");
        }
    }
}
