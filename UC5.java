/**
 * OOPSBannerApp UC5 - Render OOPS as Banner using Inline Array Initialization
 */
public class UC5 {
    public static void main(String[] args) {
        
        // 1. Declare and initialize the array in a single statement
        // Each element in the array is a result of String.join()
        String[] lines = {
            String.join(" ", "  *** ", "  *** ", " ***** ", "  ***** "),
            String.join(" ", " ** ** ", "** **", " **  **", " ** "),
            String.join(" ", " ** ** ", "** **", " **  **", " ** "),
            String.join(" ", " ** ** ", "** **", " ******", "  ***** "),
            String.join(" ", " ** ** ", "** **", " ** ", "         ** "),
            String.join(" ", " ** ** ", "** **", " ** ", "         ** "),
            String.join(" ", "  *** ", "  *** ", " ** ", "   ****** ")
        };

        // 2. Use a for-each loop to iterate and print
        for (String line : lines) {
            System.out.println(line);
        }
    }
}