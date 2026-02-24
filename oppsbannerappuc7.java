import java.util.*;

public class oppsbannerappuc7 {
    
    // UC7: Static Inner Class for Encapsulation
    static class CharacterPattern {
        private final char character;
        private final String[] pattern;

        public CharacterPattern(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public String getRow(int row) {
            return pattern[row];
        }

        public char getChar() {
            return character;
        }
    }

    public static void main(String[] args) {
        // Data Store: Mapping characters to their Pattern Objects
        Map<Character, CharacterPattern> registry = new HashMap<>();
        registry.put('O', new CharacterPattern('O', new String[]{" @@@ ", "@   @", "@   @", "@   @", " @@@ "}));
        registry.put('P', new CharacterPattern('P', new String[]{"@@@@ ", "@   @", "@@@@ ", "@    ", "@    "}));
        registry.put('S', new CharacterPattern('S', new String[]{" @@@ ", "@    ", " @@@ ", "    @", " @@@ "}));

        String input = "OOPS";
        int bannerHeight = 5;
        int totalWidth = (input.length() * 6) + 4; // Dynamic width calculation
        String border = "#".repeat(totalWidth);

        // UC7: Array initialization using StringBuilder and Object methods
        String[] banner = new String[7];
        banner[0] = border;
        banner[6] = border;

        for (int i = 0; i < bannerHeight; i++) {
            StringBuilder sb = new StringBuilder("# ");
            for (char c : input.toCharArray()) {
                sb.append(registry.get(c).getRow(i)).append(" ");
            }
            sb.append("#");
            banner[i + 1] = sb.toString();
        }

        // Final Rendering
        for (String line : banner) {
            System.out.println(line);
        }
    }
}