class Solution {


    int missingDataSum1;
    int missingDataSum2;
    int missingDataNum;

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
    }

    public static int sumFunc(int maxValue){

        int sumOfAllData = 0;

        for(int i=0; i <= maxValue; i++){ 

            sumOfAllData += i;

        }

        return sumOfAllData;
        
    }
   
    public static int maxValFinder(int[] nums1, int[] nums2){

        int maxVal;

        if(nums1[nums1.length - 1] > nums2[nums2.length - 1] ) {maxVal = nums1[nums1.length - 1]}    
        else if( nums2[nums2.length - 1] > nums1[nums1.length - 1] ) {maxVal = nums2[nums1.length - 1]}    
        else{maxVal = nums1[nums1.length - 1]}  

        return maxVal; 

    }
    

    public static int missingDataNum(int[] nums1, int[] nums2){

        for(int i=0; i<nums1.lenght; i++){

            

        }

    }

    public static int missingSumFunc(){}


} 
