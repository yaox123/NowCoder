package Test;

/**
 * @BelongsProject: Practice
 * @BelongsPackage: Test
 * @Author: yaox
 * @CreateTime: 2018-10-24 21:44
 */
public class test1 {
    private static int j = 0;

    private static Boolean methodB(int k) {
        j += k;
        return true;
    }

    public static void methodA(int i) {
        boolean b;
        b = i < 10 | methodB(4);
        b = i < 10 || methodB(8);

    }

    public static void main(String args[]) {
        methodA(0);
        System.out.println(j);
    }
}
