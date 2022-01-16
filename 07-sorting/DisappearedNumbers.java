class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        
     
		
		int i=0;
		
		while(i < nums.length) {
			
			int index = nums[i] -1;
			
			if(nums[i] != nums[index]){
				swap(nums,i,index);
				
			}
			else {
				i++;
			}
			
		}
		
		List<Integer> list = new ArrayList<Integer>();
		
		for (int j=0; j< nums.length; j++) {
			
		
			
			if(nums[j] != j + 1) {
				list.add(j+1);
			}
		}
		
		 return list;
	}
	
	static void swap(int [] arr, int i, int j) {
		int temp = arr[j];
		arr[j] = arr[i];
		arr[i] = temp;
	}
        
}

