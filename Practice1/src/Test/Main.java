package Test;

/**
 * @BelongsProject: Practice
 * @BelongsPackage: Test
 * @Author: yaox
 * @CreateTime: 2018-10-23 18:23
 */

import java.util.Scanner;
//水仙花数
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            int m = in.nextInt();
            int n = in.nextInt();
            boolean isfirst = true;
            for(int i=m; i<=n; i++){
                int g = i%10;
                int s = i/10%10;
                int b = i/100;
                if((Math.pow(g,3)+Math.pow(s,3)+Math.pow(b,3))==i){
                    if(isfirst){
                        System.out.print(i);
                        isfirst = false;
                    } else
                        System.out.print(" "+i);
                }
            }
            if(isfirst){
                System.out.println("no");
            }
        }
    }
}
