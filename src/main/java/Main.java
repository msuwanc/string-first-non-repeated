import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println(findFirstNonRepeated("abcdefghija"));
        System.out.println(findFirstNonRepeated("hello"));
        System.out.println(findFirstNonRepeated("Java"));
        System.out.println(findFirstNonRepeated("simplest"));
        System.out.println(findFirstNonRepeated("aaabbbccc"));
    }

    private static char findFirstNonRepeated(String s) {
        Map<Character, Integer> charToCount = new LinkedHashMap<>();
        for (char c : s.toCharArray()) {
            charToCount.put(c, charToCount.containsKey(c) ? charToCount.get(c) + 1 : 1);
        }
        for (Map.Entry<Character, Integer> entry : charToCount.entrySet()){
            if(entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        throw new RuntimeException("No non repeated character in this string");
    }
}
