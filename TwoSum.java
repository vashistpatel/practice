class Solution {
    public int[] twoSum(int[] nums, int target) {

        //go trough all the number in the array
        //add them and checkk if they match the "target"

        for(int i=0; i < nums.length; i++){
            for(int j=0; j<nums.length; j++){

                if(i!=j){
                    if(nums[i] == target - nums[j]){
                    return new int[] { i, j };
                    }
                }
            }
        }

        throw new IllegalArgumentException("No two number add up to the target");


    }
}
