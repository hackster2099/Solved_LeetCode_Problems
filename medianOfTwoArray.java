class Solution {

    public static int minVal = 0;
    public static int maxVal = 0;
    public static int missingDataNum = 0;

    Hashmap <int, int> foundRanges = new Hashmap<int, int>;

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

        int difference = 0;
        boolean flag = false;
        int tempValue;

        for(int i=0; i<nums1.lenght; i++){

            difference = nums1[i+1] - nums1[i];

            if((difference > 1) && !flag){

                foundRange.put(nums1[i], nums1[i+1]);
                missingDataNum += (difference - 1);
                minVal = nums1[i];
                maxVal = nums1[i+1]; 
                flag = true;              

            }

            if((difference > 1) && flag){
            
                foundRange.put(nums1[i], nums1[i+1]);
                missingDataNum += (difference - 1);
                
                if (minVal > nums1[i]){ minVal = nums1[i];}
                if (maxVal < nums1[i+1]){ maxVal = nums1[i+1];}                

            }

        }

        for(int i=0; i<nums2.lenght; i++) {

            boolean flag = false;
            int tempValue

            difference = nums2[i+1] - nums2[i];

            if(difference > 1) {

                foundRange.put(nums2[i], nums2[i+1]);
                missingDataNum += (difference - 1);
                if (minVal > nums2[i]){ minVal = nums2[i];}
                if (maxVal < nums2[i+1]){ maxVal = nums2[i+1];}   

            }

        }

    }

    public static int missingSumFunc() {


        // implement the algorithm written on the notebook here.
        

        for(int i=minVal; i<=maxVal; i++){

            if(foundRanges.containsKey(i)){


            }    

        }


    }

}   
