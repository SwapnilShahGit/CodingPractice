import java.util.*;

public class ReverseVowels{
    public static void main(String args[]){
        String teststr = "hello";
        System.out.println(reverseVowels(teststr));
    }
    
    public static String reverseVowels(String s){
        char[] list = s.toCharArray();
        Set<Character> set = new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        
        for (int i=0, j=list.length-1; i<j; ) {
			if (!set.contains(list[i])){
                i++;
                continue;
            }
			System.out.println("hi");
            
            if(!set.contains(list[j])){
                j--;
                continue;
            }
            
            char temp = list[i];
            list[i]=list[j];
            list[j]= temp;
            i++;
            j--;
        }
        return String.valueOf(list);
    }
}
