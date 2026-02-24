public class oppsbannerappuc6 {
    public static void main(String[] args) {
        int length = 21;
        String border = String.join("", java.util.Collections.nCopies(length, "#"));

        // UC6: Array initialization using method calls for modularity
        String[] banner = {
            border,
            generateLine(0),
            generateLine(1),
            generateLine(2),
            generateLine(3),
            generateLine(4),
            border
        };

        // Enhanced for loop for rendering
        for (String row : banner) {
            System.out.println(row);
        }
    }

    // Master method to compose a single row of the banner
    private static String generateLine(int row) {
        return "# " + getO(row) + " " + getP(row) + " " + getS(row) + " #";
    }

    // Modular methods for character patterns
    private static String getO(int i) {
        String[] pattern = {" @@@ ", "@   @", "@   @", "@   @", " @@@ "};
        return pattern[i];
    }

    private static String getP(int i) {
        String[] pattern = {"@@@@ ", "@   @", "@@@@ ", "@    ", "@    "};
        return pattern[i];
    }

    private static String getS(int i) {
        String[] pattern = {" @@@ ", "@    ", " @@@ ", "    @", " @@@ "};
        return pattern[i];
    }
}