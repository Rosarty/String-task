package app;

import java.util.Scanner;

public class Main03 {

    static int count;

    public static void main(String[] args) {
        getData(provideData());
    }

    private static String[] provideData() {
        return new String[]{"Bob", "Alice", "Tom", "Lucy", "Bob", "Lisa"};

    }

    private static void getData(String[] names) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a name to search:");
        String searchName = scanner.nextLine();

        count = countOccurrences(names, searchName);

        StringBuilder result = new StringBuilder();
        if (count > 0) {
            result.append("The name ").append(searchName)
                    .append(" appears ").append(count)
                    .append(" times in the list.");
        } else {
            result.append("The name ").append(searchName)
                    .append(" does not appear in the list.");
        }

        System.out.println(result);
    }

    private static int countOccurrences(String[] names, String searchName) {
        int count = 0;
        for (String name : names) {
            if (name.equals(searchName)) {
                count++;
            }
        }
        return count;
    }


}