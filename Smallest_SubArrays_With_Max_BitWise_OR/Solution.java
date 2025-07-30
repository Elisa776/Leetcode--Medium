class Solution {
    public int[] smallestSubarrays(int[] nums) 
    {
        int ans = 0;
        int max_val = 0;
        int[] arr = new int[nums.length];
        for(int i = nums.length - 1; i >= 0; i--)
        {
            ans |= nums[i];
            arr[i] = ans;
        }
        int[] arr1 = new int[nums.length];
        for(int i = 0; i < nums.length; i++)
        {
            int n = 0;
            for(int j = i; j < nums.length; j++)
            {
                n |= nums[j];
                if(n == arr[i])
                {
                    arr1[i] = j - i + 1;
                    break;
                }              
            }         
        }
        return arr1;
    }
}
