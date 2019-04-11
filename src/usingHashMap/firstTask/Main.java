package usingHashMap.firstTask;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        /* Создать hashmap, занести в нее любые 10 пар ключ-значение (типа String);
         * - вывести на консоль значение всех ключей и значений с помощью метода entrySet();
         * - вывести на консоль значение всех ключей и значений с помощью метода keySet(). */

        Map<String, String> hashMap = new HashMap<>();
        hashMap.put("1", "January");
        hashMap.put("4", "April");
        hashMap.put("9", "September");
        hashMap.put("8", "August");
        hashMap.put("2", "February");
        hashMap.put("10", "October");
        hashMap.put("5", "May");
        hashMap.put("3", "March");
        hashMap.put("6", "June");
        hashMap.put("7", "July");

        System.out.println("Output using entrySet():\n");
        showUsingEntrySet(hashMap);

        System.out.println("\nOutput using keySet():\n");
        showUsingKeySet(hashMap);
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
