
//Recursion
class Merge{
	public static void main(String[] args)
	{
		int arr[] = {1,8,6,3,7};
		mergeSort2(arr,0,arr.length-1);
		
		for(int i = 0;i < arr.length; i++)
		{
			System.out.println(arr[i]+ " ");
			
		}
	}
		
	 public static void mergeSort2(int input[],int sI, int eI)
    {
        if(sI >= eI)
            return;
        
        int mid = (sI+eI)/2;
        
        mergeSort2(input,sI,mid);
        mergeSort2(input,mid+1,eI);
        
        merge(input,sI,eI);
    }
    public static void merge(int arr[],int sI,int eI)
    {
        int mid = (sI+eI)/2;
        int ans[] = new int[eI - sI + 1];
        int i = sI;
        int j = mid+1;
        int k = 0;
        while(i <= mid && j <= eI)
        {
            if(arr[i]<arr[j]){
                ans[k] = arr[i];
                k++;
                i++;
            }
            else{
                ans[k] = arr[j];
                k++;
                j++;
            }   
        }
       while(i <= mid)
       {
            ans[k] = arr[i];
                k++;
                i++;   
       }
        while(j <= eI)
        {
             ans[k] = arr[j];
             
                k++;
                j++;
        }
        for(int x = 0 ; x < ans.length; x++)
        {
            arr[x + sI] = ans[x];
        }
        
    }
}
