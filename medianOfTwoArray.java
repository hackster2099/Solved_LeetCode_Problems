class Solution {

    int sumOfAllData1; // for the first array
    int sumOfAllData2; // for the second array
    int missingDataSum1;
    int missingDataSum2;
    int maxVal;
    int missingDataNum;

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {


    }

    public static int sumFunc(){}
   
    public static int maxValFinder(int[] nums1, int[] nums2){

        if(nums1[nums1.length - 1] > nums2[nums2.length - 1] ) {maxVal = nums1[nums1.length - 1]}    
        else if( nums2[nums2.length - 1] > nums1[nums1.length - 1] ) {maxVal = nums2[nums1.length - 1]}    
        else{maxVal = nums1[nums1.length - 1]}   

    }
    
    public static int missingDataNum(){}
    public static int missingSumFunc(){}


}
