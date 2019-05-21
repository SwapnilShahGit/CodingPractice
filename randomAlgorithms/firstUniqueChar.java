import java.util.*;

public class Solution{
    
    public static void main(String args[]){
        System.out.println(firstUniqueChar(args[0]));
    }
    
    public static String firstUniqueChar(String s){
        HashMap<Character, Integer> refmap = new HashMap<Character, Integer>();

        for (int x = 0; x < s.length(); x++){
            if (refmap.containsKey(s.charAt(x))){
                int count = refmap.get(s.charAt(x));
				count = count + 1;
                refmap.put(s.charAt(x), count);
            } else {
                refmap.put(s.charAt(x), 1);
            }
        }
        
        for (int y = 0; y < s.length(); y++){
            if (refmap.get(s.charAt(y)) == 1){
                String temp = Character.toString(s.charAt(y));
				return temp;
            }
        }
    
        return "DNE";
    }
}
