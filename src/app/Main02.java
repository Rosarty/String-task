package app;

public class Main02 {

    static int count;

    public static void main(String[] args) {
        getData(provideData());
    }

    private static String[] provideData() {

        return new String[]{"orange", "plum", "tomato", "onion", "grape", "onion"};

    }

    private static void getData(String[] words) {
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            sb.append(word).append(" ");
        }

        String result = removeWord(sb.toString());

        printWords(result);
    }

    private static String removeWord(String input) {
        return input.replaceAll("\\b" + "onion" + "\\b", "").trim();
    }

    private static void printWords(String words) {
        String[] wordsArray = words.split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        for (String word : wordsArray) {
            count++;
            stringBuilder
                    .append(count)
                    .append(") ")
                    .append(word)
                    .append("\n");
        }
        System.out.println(stringBuilder);
    }

}