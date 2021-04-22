public class ThuatToanChen {
    public  static  int[] array={2,3,454,65,77,0};
    public static void insertionSort(int [] array){
        int pos,x;
        for(int i =0;i<array.length;i++){
            x = array[i];
            pos = i;
            while(pos > 0 && x < array[pos-1]){
                array[pos] = array[pos-1];
                pos--;
            }
            array[pos] = x;
        }
    }

    public static void main(String[] args) {
        insertionSort(array);
        for(int i =0;i < array.length;i++){
            System.out.print(array[i]+"");
        }
    }
}
