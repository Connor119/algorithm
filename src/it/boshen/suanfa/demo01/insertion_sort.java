package it.boshen.suanfa.demo01;
/*
* 第一课：概念1h：15min
*        代码：
*       实现思想：
*           先做到0~1上面有序，在做到0，2上面有序。。。一直到0到n-1上面有序
*           每一次如果后面的数字比前面的数字小，则一个一个位置进行交换
*
* 比选择排序和冒泡排序好一些，因为数据状况对插入排序产生了影响
*
*
*
*
* */
public class insertion_sort {
    public static void main(String[] args) {
        int[] arr ={1,3,5,1,3,5,7,2,3,5};
        insertionsort(arr);
        for (int i: arr) {
            System.out.println(i);
        }
    }
    public static void insertionsort(int[] arr){
        if(arr == null|| arr.length<2){
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i-1;j>=0&&arr[j]>arr[j+1]; j--) {
                swap(arr,j,j+1);
            }
        }
    }
    /*
    * 一定注意：这里面传入的j和i是数组的索引，不是让这两个数字进行交换
    *
    *
    * */
    public static void swap(int[] arr,int j,int i){
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;

    }
}
