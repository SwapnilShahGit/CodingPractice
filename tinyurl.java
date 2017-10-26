import java.util.*;

public class Solution {

	static Map<Integer, String> map = new HashMap<Integer, String>();
    public static void main(String args[]){
    
        String test = encode("www.google.com");
        System.out.println(test);
        System.out.println(decode(test));
        
    }
    
    public static String encode(String longUrl){
        Integer mapCode = longUrl.hashCode();
        map.put(mapCode, longUrl);
        return "http://www.tinyurl.com/"+mapCode;
    }
    
    public static String decode(String shortUrl){
        String temp = shortUrl.replace("http://www.tinyurl.com/", "");
        Integer mapCode = Integer.parseInt(temp);
        return map.get(mapCode);
    }
}
