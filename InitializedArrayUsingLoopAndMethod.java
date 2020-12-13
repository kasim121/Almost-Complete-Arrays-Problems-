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
    }

    public void print(int[] arr){
        for(int i = 0; i < arr.length; i++){
        System.out.println(arr[i] + " ");
        }
    }

}