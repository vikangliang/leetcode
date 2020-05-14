package arrays.numSums;

/**
 * 1.两数之和
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 */
public class Two_Sum {
    //思路：判断目标值-数组值是否等于其他数组值
    public static void main(String a[]){
        int b[]={2,7,11,15};
        twoSum(b,9);
    }

    public static int[] twoSum(int[] nums, int target) {
        //第一层循环，左指针在后
        for(int i=0;i<=nums.length-1;i++){
            //第二层循环，右指针在左指针前
            for(int j=i+1;j<=nums.length-1;j++){
                //用target减去其中一个数，若等于则返回对应的两个下标
                if(target-nums[i]==nums[j]){
                    return new int[]{i,j};
                }
            }
        }
        //当没有找到两数之和为target时，抛出异常
        throw new IllegalArgumentException("No two sum solution");
    }
}
