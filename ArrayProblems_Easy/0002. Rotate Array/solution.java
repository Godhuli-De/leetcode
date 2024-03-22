class Solution {
    public void rotate(int[] nums, int k) {
        int newArr[]=nums.clone();
        int len=nums.length;
        
        k=k%len;//to make less iterations if k>length
        
        for(int i=0;i<len;i++)
        {
            if(i<k){
                //for rightmost 3
                nums[i]=newArr[len+i-k];
                System.out.print(nums[i]+" ");
            }
            else
            {   nums[i]=newArr[i-k];
                System.out.print(nums[i] + " ");
            }
        }
       
        
    }
}
