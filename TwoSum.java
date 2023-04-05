class Solution {
    public int[] twoSum(int[] nums, int target) {
       
int number=0,sum=0;
int i,j;
int numsSize=nums.length;
int[] res=new int[2];
for(i=0;i<numsSize;i++)
{
number=nums[i];
for(j=i+1;j<numsSize;j++)
{
    sum=number+nums[j];
    if(sum==target)
    {
        res[0]=i;
        res[1]=j;

    }
}
}
return res;
}
}
