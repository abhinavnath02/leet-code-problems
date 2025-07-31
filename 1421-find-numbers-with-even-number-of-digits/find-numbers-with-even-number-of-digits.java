import java.util.ArrayList;
class Solution {
    public int findNumbers(int[] nums) {
        ArrayList<Integer> app = new ArrayList<>();
        if(nums.length == 0) return 0;
        for(int num:nums)
        {
            String strNum = String.valueOf(num);
            if(strNum.length() % 2 == 0)
            {
                app.add(num);
            }                       

        }
        return app.size();
}
}