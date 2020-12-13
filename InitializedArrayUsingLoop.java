class InitializedArrayUsingLoop
{
    public static void main(String[] args)
    {
        int[] arr = new int[5];
        // arr[0] = 10;
        // arr[1] = 10;
        // arr[2] = 20;
        // arr[3] = 30;
        // arr[4] = 40;
        // //arr[0] = 10;
        
        for(int j = 0;  j < arr.length; j++)
        {
            arr[j] = j;
        }

        for(int i = 0; i < arr.length; i++)
        {
            System.out.println(arr[i] + " ");
        }

    }   

}