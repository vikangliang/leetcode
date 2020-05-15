package arrays.removeNums;

public class Remove_Duplicates_from_Sorted_ArrayII {
    public static int removeDuplicates(int[] nums) {
        if(nums == null) return 0;
        //设置标志位
        boolean flag=false;
        int i=0;
        for(int j=i+1;j<nums.length;j++){
            //i下标的值不等于j下标的值时
            if(nums[i]!=nums[j]){
                //i后移
                i++;
                //把j的值赋给后移后的i
                nums[i] = nums[j];
                //不等时设置标志位为false
                flag=false;
            }else{
                //若相等，判断标志位，若原标志位为true时，直接跳过；若原标志位为false时，可进入判断
                if(!flag){
                    i ++;
                    nums[i] = nums[j];
                    //s设置标志位为true，表示有相同
                    flag = true;
                }
            }
        }
        return i+1;
    }

    public static void main(String args[]){
        System.out.println(removeDuplicates(new int[]{1,1,1,2,2,3}));
    }
}
