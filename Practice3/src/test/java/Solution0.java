/**
 * @BelongsProject: Practice
 * @BelongsPackage: PACKAGE_NAME
 * @Author: yaox
 * @CreateTime: 2019-03-04 20:54
 * 把字符串转化成整数
 */
public class Solution0 {

    public static void main(String[] args) {
        int i = StrToInt("+336347568");
        System.out.println(i);
    }
    public static int StrToInt(String str) {
        if(str == null || str.length() == 0)
            return 0;
        if(judge(str) == false)
            return 0;
        long tmp = 0;
        int flag = 0;
        if(str.charAt(0) == '-')
        {
            flag = 1;
            if(str.length() == 1)
                return 0;
            str = str.substring(1,str.length());
        }
        if(str.charAt(0) == '+')
        {
            if(str.length() == 1)
                return 0;
            str = str.substring(1,str.length());
        }
        for(int i = 0;i < str.length();i++)
        {
            tmp = tmp * 10 + str.charAt(i)-'0';
        }
        if(flag == 1)
            tmp = 0 - tmp;
        if(tmp > Integer.MAX_VALUE || tmp < Integer.MIN_VALUE)
            return 0;
        else
            return (int)tmp;
    }

    public static boolean judge(String str)
    {
        for(int i = 0;i < str.length();i++)
        {
            if(i == 0)
            {
                if(str.charAt(i) == '-' || str.charAt(i) == '+')
                    continue;
            }
            if(str.charAt(i) < '0' || str.charAt(i) > '9')
                return false;
        }
        return true;
    }
}
