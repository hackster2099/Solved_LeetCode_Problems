class Solution {

    // declaring and initializing the hashmap and an array to contain the final result.
    public static HashMap<Integer, Integer> hashMap;
    public static int[] result = new int[2]; 

    public int[] twoSum(int[] nums, int target) {
        
        // two variables for holding the value based on the for loop index, as well as operation value
        int x;
        int valueInSet;
    
        hashMap = loader(nums);

        for(int i=0; i<nums.length; ++i) {


            x = nums[i];
            // checking if the difference between the target value and the x exist in the hashmap as a key
            valueInSet = target - x; 
            
            // if the key exist in the hashmap, and its value doesnt match with the current index, finalize the result in the 
            // array
            if(hashMap.containsKey(valueInSet) && (hashMap.get(valueInSet) != i)){

                result[0] = i;
                result[1] = hashMap.get(valueInSet);
            }

        }

        return result;

    }

    // method for loading all the in values into the hashmap
    public HashMap loader(int[] arr){

        // temporary hashmap
        HashMap<Integer, Integer> temp = new HashMap<>();

        // inserting the values as the key to eliminate the duplicate values, and the index as the value
        for(int i=0; i<arr.length; i++){
            
            temp.put(arr[i], i);
            
        }

        // returning the hashmap product
        return temp;

    }

}
