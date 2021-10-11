package it.boshen.suanfa.demo01;

//import static java.util.function.Predicate.isEqual;
//import static jdk.nashorn.internal.objects.NativeJava.copyArray;

/*
* 对数器：
*       对数期是判断自己写的方法对不对的一个仪器
*       通过生成随机数据量存在数组里面作为输入，
*       之后对比输出结果，从而判断某方法的正确性
*
* 关键：生成一个随机数组（数据随机，大小随机）
*       技术关键：
*           Math.random -->[0,1)所有的小数，等概率返回一个
*           Math.random*N -->[0,N)
*           （int）（Math.random()*N）--->[0,N-1]所有整数，等概率返回一个
*
* 在测试的时候生成生成一个随机数组，在用copyArray拷贝一个相同的数组，用isEqual方法打印比较结果
*
* */
public class comparator {
    public static int[] generateRandomArray(int maxSize,int maxValue){
//        长度随机

        int[] arr = new int[(int)((maxSize+1)*Math.random())];
        for (int i:arr) {
//        每个数随机,之所以要减去一个是因为这样可以让数据产生负数
            arr[i] = (int)((maxValue+1)*Math.random())-(int)(maxValue*Math.random());
        }

        return arr;
    }
    public static int[] copyArray(int[] arr){
        return arr;
    }

}
