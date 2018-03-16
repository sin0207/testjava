public class RomantoInteger
{
	public static void main(String[] args)
	{
		RomantoInteger ri = new RomantoInteger();
		int ans = ri.romanToInt("MCMXCVI");
		System.out.println(ans);
	}
	
	public int romanToInt(String s) {
        String[] roman = {"I", "V", "X", "L", "C", "D", "M"};
		int[] numeral = {1, 5, 10, 50, 100, 500, 1000};
		
		int ans = 0;
		int last_val = 0;
		for(int i = s.length()-1;i>=0;i--){
			for(int j = 0;j<7; j++){
				if(roman[j].equals(s.substring(i,i+1))){
					if(numeral[j] < last_val){
						ans -= numeral[j];
					}else{
						ans += numeral[j];
					}
					
					last_val = numeral[j];
					break;
				}
			}
		}

		return ans;
    }
}