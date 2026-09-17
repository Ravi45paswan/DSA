class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int size = nums.length;
        
       HashMap<Integer, Integer> map = new HashMap<>();
       for(int num: nums)
       {
        map.put(num, map.getOrDefault(num,0)+1);
       }
        List<Integer> result = new ArrayList<>();
       for(int num:map.keySet())
       {
        if((size/3)<map.get(num))
        {
            result.add(num);
        }
       }

       return result;
    }
}