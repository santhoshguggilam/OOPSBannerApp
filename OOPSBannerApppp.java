import java.util.HashMap;
import java.util.Map;

class BannerCharacterArray {
    String[] pattern;

    BannerCharacterArray(String[] pattern) {
        this.pattern = pattern;
    }

    public String[] getPattern() {
        return pattern;
    }
}

public class OOPSBannerApppp {

    // Utility Method to build character patterns
    public static Map<Character, BannerCharacterArray> buildCharacterMap() {

        Map<Character, BannerCharacterArray> map = new HashMap<>();

        // Pattern for O
        map.put('O', new BannerCharacterArray(new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        }));

        // Pattern for P
        map.put('P', new BannerCharacterArray(new String[]{
                "****** ",
                "*     *",
                "*     *",
                "****** ",
                "*      ",
                "*      ",
                "*      "
        }));

        // Pattern for S
        map.put('S', new BannerCharacterArray(new String[]{
                " ***** ",
                "*     *",
                "*      ",
                " ***** ",
                "      *",
                "*     *",
                " ***** "
        }));

        return map;
    }

    // Method to display banner
    public static void displayBanner(String message, Map<Character, BannerCharacterArray> map) {

        int rows = 7;

        for (int i = 0; i < rows; i++) {

            StringBuilder line = new StringBuilder();

            for (char ch : message.toCharArray()) {

                BannerCharacterArray charArray = map.get(ch);

                if (charArray != null) {
                    line.append(charArray.getPattern()[i]).append("  ");
                }
            }

            System.out.println(line);
        }
    }

    // Main Method
    public static void main(String[] args) {

        Map<Character, BannerCharacterArray> characterMap = buildCharacterMap();

        String word = "OOPS";

        displayBanner(word, characterMap);
    }
}