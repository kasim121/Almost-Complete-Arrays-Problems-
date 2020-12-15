class ArrayOperations{

    int count = 0; 

    public static void main(String[] args){
        ArrayOperations o = new ArrayOperations();
        int[] arr = new int[10];
   
     

        for(int j = 0; j < arr.length; j++){
         
            o.insert(arr, j + 1);
        }
                o.printArray(arr);

    }
        public void insert(int[] arr, int value){

            arr[count++] = value;
        }
        public void printArray(int[] arr){

            for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
            }

        }
}