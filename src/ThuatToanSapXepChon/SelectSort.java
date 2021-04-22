package ThuatToanSapXepChon;

public class SelectSort {
    static double[] list = {1, 9, 4.5, 6.6, 5.7, -4.5};
    public static void main(String[] args) {
        selectSort(list);
        for (int i = 0; i < list.length; i++)
            System.out.print(list[i] + " ");

    }
    public static void selectSort(double[] list){
        for(int i = 0;i<list.length;i++){
            double min = list[i];
            int index =i;
            for(int j=i+1;j<list.length;j++){
                if(list[j]<list[i]){
                    min =list[j];
                    index =j;

                }
            }
            if(index !=i){
                list[index]= list[i];
                list [i]= min;


            }

        }

    }
}
