import java.util.Arrays;
public class TwoSum
{
	public static void main(String[] args)
	{
		TwoSum t1 = new TwoSum();
		int[] nums = {2,7,11,15};
		int[] val = t1.twoSum(nums, 9);
		System.out.println(Arrays.toString(val));
	}
	
	private int[] twoSum(int[] nums, int target) {
		int[] ans = new int[2];
        for(int i = 0; i<=nums.length; i++){
			for(int j = i + 1; j<=nums.length -1; j++){
				if(nums[i]+nums[j] == target){
					ans[0] = i;
					ans[1] = j;
				}
			}
		}
		return ans;
    }
}