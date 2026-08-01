class Solution {
    public int removeElement(int[] nums, int val) {
        int count=0;int i =0;int n=nums.length;
        while(i<n){
            if(nums[i]==val){
                 for(int j=i; j<n-1; j++){
                    nums[j] = nums[j+1];
                }
                n--;
            }else{i++;}
        }
        System.out.println(count);
        return n;
    }
}