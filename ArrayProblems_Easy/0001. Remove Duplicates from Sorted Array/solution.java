import java.util.Arrays;
class Solution {
    public int removeDuplicates(int[] nums) {
        int len1=nums.length;
        int newlen=len1;
        for (int i=0;i <nums.length;i++){
            int flag=0;
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j] && nums[j]!=9999){
                    flag++;
                    nums[j]=9999;
                }
                      
            }
            if (flag>0)
                newlen=newlen-flag;
        }
        
        Arrays.sort(nums);
        
        return newlen;
        
        
    }
}
