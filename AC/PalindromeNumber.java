public class PalindromeNumber
{
	public static void main(String[] args)
	{
		PalindromeNumber pn = new PalindromeNumber();
		boolean ans = pn.isPalindrome(1);
		System.out.println(ans);
	}
	
	 public boolean isPalindrome(int x) {
        if(x == 0){
            return true;
        }else if(x< 0){
            return false;
        }
        int ans = 0;
		int que = x;
        while(x != 0){
			System.out.println(x);
            ans = ans * 10 + x % 10;
			x = x/10;
			System.out.println(ans);
        }
		if(que == ans){
			return true;
		}else{
			return false;
		}
    }
}