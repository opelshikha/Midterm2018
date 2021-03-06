package algorithm;

public class Sort {

    long executionTime = 0;
	/*
	 * Please implement all the sorting algorithm. Feel free to add helper methods.
	 * Store all the sorted data into one of the databases.
	 */


    public int[] selectionSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;

        for(int i=0; i<array.length; i++){
            for(int j=i+1; j<array.length; j++){
                if(array[j]<array[i]){
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }

        }

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public int[] insertionSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;
        //implement here

        int in, out;
        for(out=1; out<array.length; out++)
        {
            int temp = array[out];
            in = out;
            while(in>0 && array[in-1] >= temp)
            {
                array[in] = array[in-1];
                --in;
            }
            array[in] = temp;
        }

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }


    public int[] bubbleSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int[] list = array;
        //implement here
        for (int i = 0; i < array.length; i++) {
            for (int x = 1; x < array.length - 1; x++) {
                if (array[x - 1] > array[x]) {
                    int temp = array[x - 1];
                    array[x - 1] = array[x];
                    array[x] = temp;
                }
            }
        }
        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }


    public int [] mergeSort(int [] array){
        int [] list = array;
        //implement here
        
        

        return list;
    }


    public int [] quickSort(int [] array){
        int [] list = array;
        //implement here



        return list;
    }



    public int [] bucketSort(int [] array){
        int [] list = array;
        //implement here
        
        

        return list;
    }
    
    public int [] shellSort(int [] array){
        int [] list = array;
        //implement here
        
        

        return list;
    }

    public static void printSortedArray(int [] array){
        for(int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }
}
