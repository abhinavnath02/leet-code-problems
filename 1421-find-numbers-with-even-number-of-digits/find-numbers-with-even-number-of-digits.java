class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        if(nums.length == 0) return 0;
        for(int num:nums)
        {
            String strNum = String.valueOf(num);
            if(strNum.length() % 2 == 0)
            {
                count ++;
            }                       

        }
        return count;
}
}