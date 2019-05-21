class ValidPalindrome {
		public static void main(String args[]){
				System.out.println(validPalindrome(args[0]));
		}
		public static boolean validPalindrome(String s){
				int i = 0;
				int j = s.length()-1;

				while (i<j && s.charAt(i)==s.charAt(j)){
						i++;
						j--;
				}

				if (i>=j){
					return true;
				}
				return false;
		}
}
