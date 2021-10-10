package it.boshen.suanfa.demo01;
/*

第一课：概念：26：55min
        代码：29：11min
        思路：
            每次就看两个数字，第一次0，1位置，第二次1，2位置...
            谁大谁往右边移动，这样经过一轮遍历就可以把最大的数字排到最右边
        big0平方算法

        引出问题：按位操作

*/

public class BubbleSort {
    public static void bubblesort(int[] arr){
        if(arr==null||arr.length<2){
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>arr[i+1]){
                swap(arr,i,i+1);
            }

        }
    }
    public static void swap(int[] arr,int i,int j){
        arr[i] =arr[i] ^ arr[j];
        arr[j] =arr[i] ^ arr[j];
        arr[i] =arr[i] ^ arr[j];
    }

}
