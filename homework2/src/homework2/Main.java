package homework2;

public class Main {

	public static void main(String[] args) {
		int arr[]= {23,45,67,89,12,3,51,5,8,87,42};
		int n = arr.length;
        for (int i=1; i<n; ++i)
        {
            int deger = arr[i];
            int j = i-1;
 
            while (j>=0 && arr[j] > deger)
            {
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = deger;
        }
       System.out.println(arr);
	}

}

