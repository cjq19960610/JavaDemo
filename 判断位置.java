import java.util.Arrays;
import java.util.Scanner;

public class Demo7 {
    public static void main(String[] args){
        //判断某数据在数组中第一次出现的位置（包含这个数据的输出位置，否则提示不存在）
        int[] arr=new int[6];
        Scanner scanner=new Scanner(System.in);
        for (int i=0;i<6;i++) {
            System.out.println("请输入第" + (i + 1) + "个数字");
            int num = scanner.nextInt();
            arr[i]=num;

        }
        System.out.println("请输入你要查找的数据： ");
        int num2=scanner.nextInt();
        int index=-1;
        for (int j=0;j<arr.length;j++){
            if (num2==arr[j]){
                index=j;
                break;
            }
        }


        if (index!=-1){
            System.out.println("您要查找的数据在"+index);
        }else {
            System.out.println("你要查找的数据不存在");
        }

    }
}
