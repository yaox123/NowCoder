import java.util.HashSet;

/**
 * @BelongsProject: Practice
 * @BelongsPackage: PACKAGE_NAME
 * @Author: yaox
 * @CreateTime: 2019-03-04 21:54
 * 数组中重复的数字
 */
public class Solution1 {
    // Parameters:
    //    numbers:     an array of integers
    //    length:      the length of array numbers
    //    duplication: (Output) the duplicated number in the array number,length of duplication array is 1,so using duplication[0] = ? in implementation;
    //                  Here duplication like pointor in C/C++, duplication[0] equal *duplication in C/C++
    //    这里要特别注意~返回任意重复的一个，赋值duplication[0]
    // Return value:       true if the input is valid, and there are some duplications in the array number
    //                     otherwise false
    public static void main(String[] args) {
        int[] num={22,3,1,0,2,5,33};
        int length=num.length;
        int[] duplication=new int[1];
        boolean duplicate = duplicate(num, length, duplication);
        System.out.println(duplicate);
    }


    public static boolean duplicate(int numbers[],int length,int [] duplication) {
        HashSet<Integer> integers = new HashSet<>();
        boolean res=false;
        for (int i=0;i<length;i++){
            if (integers.contains(numbers[i])){
                duplication[0]=numbers[i];
                res=true;
                break;
            }else {
                integers.add(numbers[i]);
            }
        }
        return res;
    }
}
