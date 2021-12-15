package level7;

import java.util.Arrays;

interface Scale {
    static String scale(String strng, int k, int v) {
        return strng.replaceAll("(\\w)", "$1".repeat(k))
                .replaceAll("(\\w+\\n)", "$1".repeat(v))
                .replaceAll("(\\n\\w+$)", "$1".repeat(v));
    }
}
