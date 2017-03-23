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
	 * ����һ���������飬�������֮�����Ŀ��ֵ������Ԫ�ص��±�
	 * ���������е�ÿ��Ԫ�أ����Map���Ƿ������Ӧ��Ԫ�أ����������û�������Map��
	 * O(n)
	 * @param nums ��������
	 * @param target Ŀ��ֵ
	 * @return ��������Ԫ�ص�indice
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
