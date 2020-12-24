class InitializedArrayUsingLoopAndMethod{
    int count = 0;
    public static void main(String[] args) {
        InitializedArrayUsingLoopAndMethod object = new InitializedArrayUsingLoopAndMethod();
        int[] arr = new int[5];
        // arr[0] = 10;
        // arr[1] = 10;
        // arr[2] = 20;
        // arr[3] = 30;
        // arr[4] = 40;
        // arr[0] = 10;
        for(int j = 0;  j < arr.length; j++){
            object.insertUsingMethod(arr, j+1);
        }

        object.print(arr);

    } 

    public void insertUsingMethod(int[] arr, int valuetobeInserted){
            arr[count++] = valuetobeInserted;
         //Ismain arr[0 (means count = 0)] = valuetobeInserted => j = 0+1 => j:- = 1
         //arr[1 (becoz count = count+1=>1)] => valuetobeInserted means j = 1+1 :- j = 2
         //arr[2 (becoz count = count+1=>2)] => valuetobeInserted means j = 2+1 :- j = 3
         // arr[3 (becoz count = count+1=>3)] => valuetobeInserted means j = 3+1 :- j = 4
        //arr[4 (becoz count = count+1=>4)]=> valuetobeInserted means j = 4+1 :- j = 5
    }

    public void print(int[] arr){
        for(int i = 0; i < arr.length; i++){
        System.out.println(arr[i] + " ");
        }
    }

}
