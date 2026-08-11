import java.Math;

// rule:   Left1 <= Right2 && Left2 <= Right1

class Solution {

    int arr1IndexL;
    int arr1IndexR;
    int arr2IndexL;
    int arr2IndexR;

    double totalArraySize; 
    double leftPartition;
    double rightPartition;
    String operation1;

    boolean reIndexFlag = false;

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int halfOfArray;
        int index1;
        int index2;
    

        if(nums1.length == 1 && nums2.length == 1){
            
            return ((nums1[0] + nums2[0]) / 2);

        }


        else if(nums1.length == 1 && nums2.length > 1){
            
            // check if the single element inside the array is bigger than or equal to the larger array max value
            if(nums1[0] >= nums2[nums2.length - 1]){

                if(((nums1.length + nums2.length) % 2) == 0){

                    index1 = (nums2.length) / 2;
                    index1 


                }


            }
            
        
        }

        else if(nums2.length == 1 && nums1.length > 1){

        

        }

        

        else {

        }


        // use all the functions here
    }

    public static void totalSizeOfArray(int[] nums1, int[] nums2){

        this.totalArraySize = nums1.length + nums2.length;
        
        if((this.totalArraySize % 2) == 0){

            this.operation1 = "even";

        }

        else{

            this.operation1 = "odd";
        }
    
    }

    public static void partition(double totalArraySize, String operation){

        if (operation == "even") {

            this.leftPartition = this.rightPartition = (totalArraySize / 2);

        }

        else if (operation == "odd") {

            this.leftPartition = Math.ceil(totalArraySize / 2);
            this.rightPartition = Math.floor(totalArraySize / 2);

        }

    }


    // if you get an error, im pretty sure its happening here

    public static void indexing(boolean reIndexFlag, String operation, double leftPartition, double rightPartition, int[] nums1
                                ,int[] nums2) {


        int arrSize1 = nums1.length;
        int arrSize2 = nums2.length;

        if(!reIndexFlag){

            if(operation == "even"){
                
                if(arrSize1 > arrSize2){

                    // ceil will take care of the even or odd size
                    this.arr1IndexL = (int) (Math.ceil(arrSize1 / 2) - 1 );
                    this.arr2IndexL = this.totalArraySize - this.arr1IndexL; 
                    
                }

                else if(arrSize2 > arrSize1){

                    this.arr2IndexL

                }

                else if(){}
                

            }            


        }      


        else{


        }  
        
    }

    public static boolean conditionChecking(int arr1IndexL, int arr1IndexR, int arr2IndexL, int arr2IndexR){
    

    }


}


