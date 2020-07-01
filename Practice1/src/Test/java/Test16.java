import java.util.Scanner;

/**
 * @BelongsProject: Practice
 * @BelongsPackage: PACKAGE_NAME
 * @Author: yaox
 * @CreateTime: 2019-02-23 09:32
 * 数组普通查找
 */
public class Test16 {
    public static void main(String[] args) {
        int[] arr={1,53,15,5,15,43,3,66};
        Scanner sc=new Scanner(System.in);
        int input = sc.nextInt();
        for (int i=0;i<arr.length;i++) {
            if (input==arr[i]){
                System.out.println("元素已找到,索引为:"+i);
                return;
            }
        }
        System.out.println("数组中不存在该元素");
        System.out.println("数组中不存在该元素");
        
    }
}
