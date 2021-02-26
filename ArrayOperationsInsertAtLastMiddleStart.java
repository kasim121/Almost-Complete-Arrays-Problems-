class ArrayOperationsInsertAtLastMiddleStart{

    int count = 0; 

    public static void main(String[] args){
        ArrayOperationsInsertAtLastMiddleStart o = new ArrayOperationsInsertAtLastMiddleStart();
        int[] arr = new int[5];
   
     

        for(int j = 0; j < arr.length; j++){
         
            o.insert(arr, j + 1);
        }
                o.printArray(arr);
                //o.insertAtStart(arr,34);
                o.insertAtAnyPosition(arr, 100, 2);
                o.insertAtAnyPosition(arr, 1000, 4);
                o.insertAtAnyPosition(arr, 99, 0);
                //o.insertAtStart(arr,345);
                o.printArray(arr);


    }
        public void insert(int[] arr, int intjValue){

            arr[count++] = intjValue;
        }
//         public void insertAtStart(int arr[], int insertvalue){
//         //   for(int i = arr.length-1; i > 2; i--){
//               for(int i = count-1; i > 0; i--){
//               arr[i] = arr[i-1];
              
//           }
//           arr[0] = insertvalue;

          
//         }
        public void insertAtAnyPosition(int[] arr, int value, int position){
            for(int i = count-1; i > position; i--){
                    arr[i] = arr[i-1];

            }
            arr[position] = value;
        }
    
        public void printArray(int[] arr){

            for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
            }
            System.out.println();

        }
}
