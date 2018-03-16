public class ReverseInteger
{
	public static void main(String[] args)
	{
		ReverseInteger ri = new ReverseInteger();
		int ans = ri.reverse(-321);
		System.out.println(ans);
	}
	
	private int reverse(int x){
		if(x == 0){
            return 0;
        }
        int ans = 0;
        while(x != 0){
            if(ans > 2147483647/10 || ans < -2147483648/10){
                return 0;
            }
            ans = ans * 10 + x %10;
            x = x / 10;
        }
        return ans;
	}
}