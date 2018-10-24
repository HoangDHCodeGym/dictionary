package Model;

import java.util.HashMap;

public class DictionaryEngine {
    private static HashMap<String, String> dict = new HashMap<>();
    public static void init() {
        dict.put("flower", "hoa");
        dict.put("chair", "ghế");
        dict.put("table", "bàn");
    }
    public static String getTranslate(String inputText) {
        return dict.get(inputText);
    }
}
