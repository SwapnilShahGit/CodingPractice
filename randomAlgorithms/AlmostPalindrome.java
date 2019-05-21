class AlmostPalindrome {
    public static void main(String args[]){
		System.out.println(almostPalindrome(args[0]));
	}

    public static boolean almostPalindrome(String s){
        int i = 0;
        int j = s.length() - 1;

        while (i < j && s.charAt(i)==s.charAt(j)){
            i++; j--;
        }

        if (i >= j){
            return true;
        }

		if (helper(s, i+1, j) || helper(s, i, j-1)){
				return true;
		}
		return false;
    }

    public static boolean helper(String s, int i, int j){
        while (i<j){
            if (s.charAt(i)==s.charAt(j)){
                i++; j--;
            } else {
                return false;
            }
        }

        return true;
    }
}
