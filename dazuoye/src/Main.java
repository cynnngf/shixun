import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean flag = true;
        while (flag){
        System.out.println("影城管理系统");
        System.out.println("1.管理员");
        System.out.println("2.经理");
        System.out.println("3.前台");
        System.out.println("4.用户");
        System.out.println("5.退出");
        System.out.println("请输入相应数字");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        switch (num){
            case 1:
          Guanli guanli=new Guanli();
                break;
            case 2:
                Jingli jingli=new Jingli();
                break;
            case 3:
                qiantai qiantai=new qiantai();
                break;
            case 4:
                yonghu yonghu=new yonghu();
                break;
            case 5:
                flag=false;
                break;
        }
    }
}
}