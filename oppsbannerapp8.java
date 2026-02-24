import java.util.HashMap;
import java.util.Map;

public class oppsbannerapp8 {
    
   
    static class CharacterPattern {
        private final String[] rows;

        public CharacterPattern(String[] rows) {
            this.rows = rows;
        }

        public String getRow(int index) {
            return rows[index];
        }
    }

    public static void main(String[] args) {
       
        Map<Character, CharacterPattern> patternRegistry = new HashMap<>();
        
      
        patternRegistry.put('O', new CharacterPattern(new String[]{" @@@ ", "@   @", "@   @", "@   @", " @@@ "}));
        patternRegistry.put('P', new CharacterPattern(new String[]{"@@@@ ", "@   @", "@@@@ ", "@    ", "@    "}));
        patternRegistry.put('S', new CharacterPattern(new String[]{" @@@ ", "@    ", " @@@ ", "    @", " @@@ "}));

        String word = "OOPS";
        int height = 5;
        
        
        printBanner(word, height, patternRegistry);
    }

    private static void printBanner(String word, int height, Map<Character, CharacterPattern> registry) {
       
        int lineLength = (word.length() * 6) + 3;
        String border = "#".repeat(lineLength);

        System.out.println(border);

        for (int i = 0; i < height; i++) {
            StringBuilder sb = new StringBuilder("# ");
            for (char c : word.toCharArray()) {
                if (registry.containsKey(c)) {
                    sb.append(registry.get(c).getRow(i)).append(" ");
                }
            }
            sb.append("#");
            System.out.println(sb.toString());
        }

        System.out.println(border);
    }
}