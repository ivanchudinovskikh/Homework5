import java.util.*;

public class House {
    public static void main(String[] args) {
        HashMap<Integer, String> people = new HashMap<>();
        ArrayList<String> people18plus = new ArrayList<>();
        people.put(13, "Патриарх Матье Пар");
        people.put(22, "Петрович Петя Петькович");
        people.put(55, "Анджелика Жали Ликова");
        people.put(18, "Ритм Ратт Рот");
        people.put(11, "Аааа аа ААА");
        people.put(26, "Allah Sultan Magamedovich");

        for (Map.Entry<Integer, String> entry : people.entrySet()) {
            if (entry.getKey() >= 18) {
                people18plus.add(entry.getValue());
            }
        }
        Collections.sort(people18plus);
        System.out.println(people18plus);
    }
}

