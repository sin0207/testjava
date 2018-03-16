import java.util.Arrays;
public class LongestCommonPrefix
{
	public static void main(String[] args)
	{
		LongestCommonPrefix lcp = new LongestCommonPrefix();
		String[] que = {"aa","ab"};
		String ans = lcp.longestCommonPrefix(que);
		System.out.println(ans);
	}
	
	public String longestCommonPrefix(String[] strs) {
		int index = 0;
		String key = "";
		String[] arr = new String[strs.length];
		int count[] = new int[strs.length];
		int ch_count = 0;
		for(int i = 0; i<strs.length; i++){
			boolean bol = Arrays.asList(arr).contains(strs[i]);
			if(bol){
				count[Arrays.asList(arr).indexOf(strs[i])] += 1;
			}else{
				arr[ch_count] = strs[i];				
				count[ch_count] = 1;
				ch_count += 1;
			}
		}
		
		int max = 0;
		String max_ch = "";
		for(int i = 0; i<arr.length ; i++){
			if(count[i] > max){
				if(strs.length > 1 && count[i] > 1){
					max = count[i];
					max_ch = arr[i];
				}else if(strs.length == 1){
					max = count[i];
					max_ch = arr[i];
				}
			}	
		}
		
        return max_ch;
    }
}