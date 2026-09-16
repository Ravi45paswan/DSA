class Solution {
    public int subarraySum(int[] nums, int k) {
        int count =0;
       for(int i=0; i<nums.length; i++)
      {
        int previous = 0;
        for(int j=i; j<nums.length; j++ )
        {
            previous= previous + nums[j];
            if(previous==k)
            {
             count++;
            }
        }
      } 
      return count; 
    }
}