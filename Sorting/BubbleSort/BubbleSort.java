public class BubbleSort {
    private int nums[];
    public BubbleSort(int a[]){
        nums = a;
    }

    public int[] Sort(){
        int size,temp;
        size = this.nums.length;
        for(int i=0;i<size;i++){
            for(int j=0;j<size-1;j++){
                if(nums[j] > nums[j+1]){
                    temp = nums[j+1];
                    nums[j+1] = nums[j];
                    nums[j] = temp;
                }
            }
        }

    return nums;
    }

}



