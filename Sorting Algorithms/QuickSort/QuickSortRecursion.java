class QuickSort{
	public static void main(String[] args){
		
		int arr[] = {2,6,1,8,9,7};	
		quickSort(arr,0,arr.length-1);
		for(int i = 0; i < arr.length; i++)
			System.out.println(arr[i]+" ");
	}
	
	public static void quickSort(int arr[] , int sI,int eI){
		if(sI >= eI)
			return;
		
		int pivotPos = partition(arr,sI,eI);
		
		quickSort(arr,sI,pivotPos-1);
		quickSort(arr,pivotPos+1,eI);
		
	}
	
	public static int partition(int arr[],int sI, int eI){
		
		int pivot = arr[sI];
		int count = 0;
		int pivotPos;
		for(int i = sI + 1; i <= eI; i++) 
		{
			if(arr[i] <= pivot)
				count++;
		}
		pivotPos = sI + count;
		int temp = arr[pivotPos];
		arr[pivotPos] = arr[sI];
		arr[sI] = temp;
		
		int i = sI;
		int j = eI;
		
		while(i < pivotPos && j > pivotPos){
			if(arr[i] <= pivot)
			{
				i++;
			}
			else if(arr[j] > pivot)
			{
				j--;
			}
			else{
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				
				i++;
				j--;
			}
		}
		return pivotPos;
	}
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
