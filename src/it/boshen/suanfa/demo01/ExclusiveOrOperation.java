package it.boshen.suanfa.demo01;
/*
* 1.任何数字和0异或都是这个数字
* 2.n和n异或是0
* 3.异或运算满足结合律交换律（所以一堆数字进行异或运算结果无关先后顺序）
*
*
* 不用用额外变量交换两个数字(内存不能是一个东西，如果是一个东西就会出问题，因为这个是交换底层变量存储空间（内存）的方法)
* a=a^b
* b=a^b
* a=a^b
* 所以当a和b是数组的索引的话，在过程中一定不能有a和b的重叠
*
* 相关面试题（异或运算）
*   在一共数组中，已知只有一种数字出现了基数次，其它的所有数都出现了偶数次，如何找到出现基数次？
*   在一共数组中有两个数字出现了基数词，其它都偶数，如何找到这两个数字？
*
* */


public class ExclusiveOrOperation {
    public static void main(String[]args){
        int[] arr={1,1,2,2,3,2,3,1};
        test2(arr);
    }
    public static int test1(int arr[]){
//        找一共数字为0的变量，在数组中依次异或下去
        int eor = 0;

        for(int i:arr){

            eor = eor^i;
        }
//        System.out.println(result);
        return eor;
    }
   /*
   第二问解：
    准备一共eor=0，从数组的头异或到尾，eor一定是a^b
    假设eor在第八位是1，那就说明a和b在第八位上不一样
    再准备eor2让异或运算上第八位不是1的数字，得到a或者b
    另一个数字就是eor异或上eor2就是另一个数字

    问题记录：
        如何让eor确定哪一位是1哪一位不是
        eor&（~eor+1）
        如何让eor2只异或上第八位不是1的数字
    */
    public static void test2(int[] arr){
        int eor = 0;
        int eor2 = 0;
        for(int i :arr){
            eor ^=i;
        }
        int rightOne = eor&(~eor+1);
        for(int j:arr){
            if( (rightOne&j) == 0){
                eor2 ^= j;
            }

        }
        int a = eor2;
        int b = eor2^eor;
        System.out.println(a);
        System.out.println(b);

    }

}
