public class Backtracking{
    public static void changValue(int arr[], int i, int val){
        //base case
        if(i == arr.length){
            printArr(arr); 
            return;
        }
    // recursion 
     arr[i]=val;
     changValue(arr , i+1 , val+1);
     arr[i]=arr[i]-2;

}
public static void printArr(int arr[]){
    for(int i=0; i<arr.length; i++){
        System.out.print(arr[i]+ " ");
    }
    System.out.println();
}

 public static void main(String args[]){
        int arr[]=new int[5]; //only declare arr not assing value bcz values are assing by recursion
        changValue(arr , 0 , 1);
        printArr(arr);
    }
}

// Time complaxity:- O(n);
/*bcz print arr is perform 2n step and constant is always egnore so tc is O(n) */
//space complaxity:-O(n);