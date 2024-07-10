public class sortAndRotat {
  
   //mid =si+(si-ei)/2
   
   public static int search(int arr[], int target, int si, int ei ){
      if(si > ei){
         return -1; //invalid index
      }
   
      // mid find
      int mid= si+ (ei-si)/2;

      // target on mid
      if(arr[mid] == target){
         return mid;
      }

      //target in l1
      
      if(arr[si] <= arr[ei]){
         //case a=>left
         if(arr[si]<= target && target <= arr[mid]){
            return search(arr, target , si, mid-1 );
         }else{

            // case b =<> right side
            return search(arr, target , mid+1,ei );
         }
      }
    else{
      //l2 on lay
      if(arr[mid] <= target && target <=arr[ei]){
          //case d =>right side
         return search(arr, target , mid+1 , ei );
      }else{
          //case c => left hoal
         return search(arr, target , si, mid-1 );
      }
   }
}

public static void main(String args[]){
   int arr[] ={4,5,6,7,0,1,2};
   int target=6;
   int idx= search(arr, target , 0, arr.length-1);
   System.out.println(idx);
    

}
}




