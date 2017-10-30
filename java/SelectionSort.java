package b;

public class SelectionSort {
	public static void SelectionSort(int[] arr) {
		int MinIndex = 0, i = 1,temp=0;
		for (i = 0; i < arr.length-1; i++) {
			MinIndex = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j]<arr[MinIndex]) {
					MinIndex = j;
				}

			}
			temp=arr[i];
			arr[i]=arr[MinIndex];
			arr[MinIndex]=temp;
		}
	}

	  public static void display(int[] arr)
	    {
	    	for(int i =0 ; i<arr.length;i++){
	    		System.out.println(arr[i]);
	    	}
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 50, 40, 30, 20, 10 };
		SelectionSort(arr);
		display(arr);

	}

}
