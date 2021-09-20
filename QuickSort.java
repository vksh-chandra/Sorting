import java.util.*;
public class QuickSort {
    static int partition(int[] array, int lb, int ub){
        int start = lb;
        int pivot = array[lb]; 
        int end = ub;

        while(start<end){
            while(array[start]<= pivot){
                start++;
            }
            while(array[end]>pivot){
                end--;
            }
            if(start<end){
                int temp = array[start];
                array[start] = array[end];
                array[end] = temp;
            }
        }
        int temp = array[end];
        array[end] = array[lb];
        array[lb] = temp; 

        return end;
    }

    static void quickSort(int[] array, int lb, int ub){
        if(lb<ub){
            int loc = partition(array, lb, ub);
            quickSort(array, lb, loc-1);
            quickSort(array, loc+1, ub);
        }
    }
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = src.nextInt();
        System.out.println("Enter "+n + " elemnt in array: ");
        int[] array = new int[n];
        for(int i=0;i<n;i++){
            array[i] = src.nextInt();
        }

        quickSort(array,0, n-1);
        System.out.println(Arrays.toString(array));
        src.close();
    }
}
