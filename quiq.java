public class quiq {
    // first print arr
    public static void printArr(int arr[]) {
        for (int i = 0; i <= arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void quiqSort(int arr[], int si, int ei) {

        // base case
        if (si >= ei) {
            return;
        }

        // find piviot
        // first doing partation and store piviot index
        int pidx = partition(arr, si, ei);//
        quiqSort(arr, si, pidx - 1);
        quiqSort(arr, pidx + 1, ei);

    }

    public static int partition(int arr[], int si, int ei) {
        // give piviot

        int pivit = arr[ei];
        int i = si - 1; // make place foe elt smaller tahn piviot

        // swap
        for (int j = si; j < ei; j++) {
            if (arr[j] <= pivit) {
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }

        // pivit at place itself
        i++;
        int temp = pivit; // pivote is a variable & i have change in arrya index
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;

    }

    public static void main(String args[]) {

        int arr[] = { 6, 3, 9, 5, 2, 8 };
        quiqSort(arr, 0, arr.length - 1);
        printArr(arr);

    }
}
// //first print arr
// public static void printArr(int arr[]){

// for(int i=0 ; i<arr.length; i++){
// System.out.print(arr[i]+ " ");
// }
// System.out.println();
// }
// // find piviot
// //first doing partion and store pivit index
// public static void quiqS(int arr[], int si, int ei){
// // base case
// if(si >= ei){
// return;
// }
// //last elemet
// int pIdx=partition(arr,si ,ei);
// quiqS(arr, si, pIdx-1);//left
// quiqS(arr, pIdx+1, ei);//right
// }

// public static int partition(int arr[], int si, int ei){
// int pivot=arr[ei];
// int i=si-1; //pivot se pehale jo khali jagah hai wha pr element set krna-to make place foe elment smaller tahn pivot

// for(int j=si; j<ei; j++){
// if(arr[j]<=pivot){
// i++;
// int temp=arr[j];
// arr[j]=arr[i];
// arr[i]=temp;
// }
// }
// //pivot tyachya jagewr ghenyasathi
// i++;
// int temp=pivot; //pivote is a variable & i have change in arrya index
// arr[ei]=arr[i]; //so i give arr[ei]
// // arr[i]=temp;
// // return i;

// }

// public static void main(String args[]){
// int arr[]={6,3,9,5,2,8,-5};
// quiqS(arr , 0 , arr.length-1 );
// printArr(arr);

// }
// }
