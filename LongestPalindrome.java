import java.util.*;

public class longestPalindrome {
    public static void main(String args[]){
		System.out.println(longestPalindrome(args[0]));
	}

	public static int longestPalindrome(String s) {
        if (s==null || s.length()==0) return 0;

        HashSet<Character> map = new HashSet<Character>();
        int count = 0;
        for (int i=0; i<s.length(); i++){
            char letter = s.charAt(i);
            if (map.contains(letter)){
                map.remove(letter);
                count += 2;
            } else {
                map.add(letter);
            }
        }

        if (! map.isEmpty()){
            return count+1;
        } else {
            return count;
        }
    }

}
