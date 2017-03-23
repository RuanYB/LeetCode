package leetcode;

import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;

/**
 * Leetcode problem solution
 * @author wufaz
 *
 */
public class Solution1 {
	/**
	 * 给定一个整数数组，返回相加之后等于目标值的两个元素的下标
	 * 对于数组中的每个元素，检查Map中是否有其对应的元素，有则输出，没有则加入Map中
	 * O(n)
	 * @param nums 输入数组
	 * @param target 目标值
	 * @return 两个加数元素的indice
	 */
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
    	Map<Integer, Integer> map = new HashMap<Integer, Integer>();
    	for(int i=0; i<nums.length; i++){
    		if(map.containsKey(target - nums[i])){
    			result[1] = i+1;
    			result[0] = map.get(target - nums[i]);
    		}
    		map.put(nums[i], i+1);
    	}
    	return result;
    }
    
    
    public static void main(String[] args){
    	int[] example = {2, 3, 4};
    	System.out.println(Arrays.toString(new Solution1().twoSum(example, 6)));
    }
}
