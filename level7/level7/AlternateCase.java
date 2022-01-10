package level7;/*
Alternate case
https://www.codewars.com/kata/57a62154cf1fa5b25200031e/java
 */

public class AlternateCase {
    static String alternateCase(final String string) {
        // Empty strings should be returned as-is.
        char[] chars = string.toCharArray();
        for (int i = 0; i < chars.length; i++)
        {
            char c = chars[i];
            if (Character.isUpperCase(c))
            {
                chars[i] = Character.toLowerCase(c);
            }
            else if (Character.isLowerCase(c))
            {
                chars[i] = Character.toUpperCase(c);
            }
        }
        return new String(chars);
    }
}
