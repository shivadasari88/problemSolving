public class SelectionSort {
    public static void main(String[] args)
    {
        int nums [] = {3, 4, 5,7, 1, 4};
        for(int i = 0 ; i<nums.length-1; i++){
           int minIndex = i;
            for(int j =i+1; j<nums.length;j++){
                
                if(nums[j] < nums[minIndex]){
                    minIndex = j;
                }

            }
            if (minIndex != i) {
                int temp = nums[minIndex];
                nums[minIndex] = nums[i];
                nums[i] = temp;
            }

        }

        for (int i : nums) {
            System.out.println(i);
        }

        
    }
}
