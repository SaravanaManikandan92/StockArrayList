public class StockArrayList {

    int bucketSize = 3;
    int initialState = 0;
    int endState = bucketSize;
    int[] integerArray = new int[bucketSize];
    int[] duplicateArray;

    public StockArrayList() {
        isDefaultSize();
        this.integerArray = integerArray;
        this.initialState = initialState;
        this.endState = endState;
        this.bucketSize = bucketSize;

    }

    public int isDefaultSize() {
        if (this.initialState == bucketSize ) {
            this.bucketSize += 2;
            return 1;
        }
        return 0;
    }


    public void add(int a) {
        int defaultSize  = isDefaultSize();
        if (defaultSize == 1) {
            //copy the array
            this.initialState = 0;
            this.duplicateArray = new int[this.bucketSize];
            copyTheArray(this.duplicateArray, this.integerArray, a);
        } else {
            this.integerArray[this.initialState++] = a;

        }

    }

    public void copyTheArray(int[] tobeCreated, int[] tobeCopied, int a) {

        for (int c_ : tobeCopied) {
            tobeCreated[this.initialState++] = c_;

        }
        tobeCreated[tobeCopied.length] = a;
        this.integerArray = tobeCreated;
        this.initialState++;

    }

    public int get(int g_)
    {
        try {
            if (this.integerArray.length != g_) {
                return this.integerArray[g_];
            }
        }
        catch(Exception ex)
        {
            return -1;

        }
        return -1;
    }

}
