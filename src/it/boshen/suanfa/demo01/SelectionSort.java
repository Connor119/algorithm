package it.boshen.suanfa.demo01;

/*第一课：代码---time23：50
       概念---4：30：遍历一遍数字找数组中的最小值，找到最小值之后和0位置上的数字做交换
                    在1到n-1在遍历找最小值，找到放1位置
                    ...
                    直到最后一个也排好序
       big0平方算法
*/
public class SelectionSort {
    public static void main(String[] args) {
        int[] arrtest = {4,2,6,7,2,1,5,6};
        SelectionSort.selectionsort(arrtest);
        for (int i:arrtest) {
            System.out.println(i);
        }
    }

    public static void selectionsort(int[] arr){
        if(arr.length<2 ||arr == null){
            System.out.println("successful sort");
        }

        for (int i = 0; i < arr.length-1; i++) {
//            把数组从0到n-1一次规定为最小值(由于数组最后一个数字不用排序，所以到数组长度减一)
            int minIndex = i;
            for (int j = i+1; j < arr.length; j++) {
//                找到数字最小的位置
                minIndex = arr[j]<arr[minIndex]?j:minIndex;

            }
            swap(arr,i,minIndex);

        }
    }
    public static void swap(int[] arr,int i,int j){
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;


    }
}
