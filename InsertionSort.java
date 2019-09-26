public class InsertionSort implements SortingAlgorithm{

	public void sort(int[] a){
		for(int j = 1; j < a.length; j++){
			int temp = a[j];
			int i = j-1;
			while((i> -1) && (a[i] > temp)){
				a[i+1] = a[i];
				i--;
			}
			a[i+1] = temp;
		}
	}
}