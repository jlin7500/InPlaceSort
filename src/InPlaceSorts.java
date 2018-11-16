public class InPlaceSorts {
    public static void insertionSort(int[] list1)
    {

    }
    public static void selectionSort(double[] list1)
    {
        int swapPostion = 0;
        double min = 0;
        for(int i = 0; i < list1.length; i++)
        {
            swapPostion = i;
            min = list1[i];
            for(int x = i; x < list1.length; i++)
            {
                if(min < list1[i])
                {
                    swapPostion = i;
                    min = list1[swapPostion];
                }
            }
        }

    }
    public static void bubbleSort(String[] list1)
    {
        int swap = 0;
        while(swap != 1)
        {

            for(int i = 0 ; i < list1.length ; i++)
            {
                if(list1[i].compareTo(list1[i+1]) > 0)
                {
                    String blank = list1[i];
                    list1[i] = list1[i+1];
                    list1[i+1] = blank;
                    swap = 0;
                }
            }
        }
        swap = 1;
    }
}
