package app;

public class Main01 {
    static int count;

    public static void main(String[] args) {

        String[] correctedWords = correctWords(provideData());
        getOutput(printWords(correctedWords));
    }

    private static String[] provideData() {
        return new String[]{"brange", "plum", "tomato", "onibn", "grape"};
    }

    private static String[] correctWords(String[] words) {

        switch (words[count]) {
            case "brange":
                words[count] = "orange";
            case "onibn":
                words[count + 3] = "onion";
                break;
        }

        return words;
    }

    private static String printWords(String[] words) {
        StringBuilder stringBuilder = new StringBuilder();

        for (String name : words) {
            count++;
            stringBuilder
                    .append(count)
                    .append(") ")
                    .append(name)
                    .append("\n");
        }

        return stringBuilder.toString();
    }

    private static void getOutput(String output) {
        System.out.println(output);
    }
}