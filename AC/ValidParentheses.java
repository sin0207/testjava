import java.util.Arrays;
public class ValidParentheses
{
	public static void main(String[] args)
	{
		ValidParentheses lcp = new ValidParentheses();
		boolean ans = lcp.isValid("}[");
		System.out.println(ans);
	}
	
	public boolean isValid(String s) {
		if(s.length() % 2 != 0 || s.length() == 0){
			return false;
		}
        String[] parent = {"(", ")", "[", "]", "{", "}"};
		String[] left = new String[s.length()];
		int index = 0;		
		
		for(int i=0; i<s.length();i++){
			int match = Arrays.asList(parent).indexOf(s.substring(i,i+1));
		
			if(match % 2 != 0 && index == 0){
				return false;
			}

			if(match % 2 == 1){
				if(index == 0){
					return false;
				}
				
				if(parent[match -1].equals(left[index-1])){
					left[index-1] = "";
					index -= 1;
				}
			}else{								
				left[index] = s.substring(i,i+1);
				index ++;
			}
		}
		if(index > 0){
			return false;
		}
		
		return true;
    }
}