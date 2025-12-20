class Solution {

    public int[] twoSum(int[] nums, int target) {

        int staticIndex = 0; 
        int dynamicIndex = 0;       
        // two temp variables

        int[] returnArr = new int[2]; 

        for(int i=0; i < nums.length; i++){
        
            if(nums[staticIndex] >  target){

                staticIndex+=1;
                i = 0;

            }

            if((i == staticIndex)){
                i++;

            }

            if((nums[staticIndex] + nums[i]) == target) {
                    
                returnArr[0] = staticIndex;
                returnArr[1] = i;
                break;

            }

            if(i == (nums.length-1)){

                i=0;
                staticIndex+=1;
                
                if((staticIndex == (nums.length-1)) && (i == (staticIndex - 1))){
                 
                    System.out.println("Static Index reached its max limit, no solution found");
                    break;

                }

            }

        }


        return returnArr;

    }

}
