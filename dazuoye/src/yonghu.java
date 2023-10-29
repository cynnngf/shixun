import java.util.ArrayList;
import java.util.Scanner;

public class yonghu {

}
class Admin4 {

    Scanner sc = new Scanner(System.in);

    void zhuce() {
        System.out.println("注册界面");
        System.out.println("请输入用户名，长度不少于五个字符");
        String A = sc.next();
        System.out.println("请输入密码，密码长度不少于8个字符，且要有大小写字母。数字和标点符号");
        String B = sc.next();
        System.out.println("注册成功");
        yanzheng(A, B);
    }


    void yanzheng(String A, String B) {

        System.out.println("用户界面");
        System.out.println("请输入登录账号");
        String a = sc.next();
        String b = sc.next();
        int i = 1;
        if (A.equals(a)) {
            System.out.println("请输入登录密码");
        }
        while (i <= 5) {
            if (B.equals(b)) {
                System.out.println("密码正确，登录成功");
                show3 show3=new show3();
                show3.jiemian(B);
                break;
            } else {
                System.out.println("密码错误，登录失败，请重新输入密码");
                i++;
            }
        }
        if(i == 5){
            System.out.println("连续多次输入错误，账户锁定");
        }
    }
    void xiugai(String B){
        System.out.println("请输入修改后的密码");
        String o=sc.next();
        B=o;
        System.out.println("修改成功");
    }
}
class show3{
    void jiemian(String B){
        boolean flag = true;
        while (flag) {
            System.out.println("用户功能界面");
            System.out.println("1.修改密码");
            System.out.println("2.购票");
            System.out.println("3.退出");
            Scanner sc = new Scanner(System.in);
            int s= sc.nextInt();
            switch (s){
                case 1:
                    Admin4 admin4=new Admin4();
                    admin4.xiugai(B);
                    break;
                case 2:
                    goupiao goupiao=new goupiao();
                    goupiao.mian();
                    break;
                case 3:
                    flag=false;
                    break;

            }
        }
    }
}
class goupiao{
    void mian(){
        boolean flag=true;
        while (flag){
            System.out.println("1.查看所有电影放映信息");
        System.out.println("2.查看指定电影放映信息");
        System.out.println("3.购票");
        System.out.println("4.查看购票历史");
        System.out.println("5.退出");
        Scanner sc = new Scanner(System.in);
        int s= sc.nextInt();
            Yingpian yingpian=new Yingpian();
            chuli2 chuli12=new chuli2();
            chuli3 chuli13=new chuli3();
            changci changc=new changci();
            zuowei zuowe=new zuowei();
            goupiao goupiao=new goupiao();
            int number=0;
        switch (s){
            case 1:
                chuli12.pailie(yingpian.list2);
                break;
            case 2:
                chuli13.pailiec(changc.list3);
                break;
            case 3:
                caozuo caozuo=new caozuo(changc.list3);
                goupiao.gou(changc.list3);
                break;
            case 4:

                break;
            case 5:
                flag=false;
                break;
        }
        }
    }
    void gou(ArrayList list3){
        System.out.println("1.支付成功。0.支付失败");
        boolean flag=true;
        Scanner sc =new Scanner(System.in);
        int U=sc.nextInt();
        while (flag) {
            if (U == 1) {
                flag=false;
                break;
            } else if (U == 0) {
                System.out.println("支付失败，请重新支付");
                break;
            }
        }
        System.out.println("请在下方取票");
        lishi(list3);
    }
void print(ArrayList<changci> list3){
        System.out.println(list3);
}
    void lishi(ArrayList<changci> list3){
        yixin yixin=new yixin();
        yixin.y.add(list3);
        print(list3);
    }

}
class yixin{
    private String name;
    private String dating;
    private String time;
    private String money;
    private String zhuangtai;
    ArrayList<ArrayList> y = new ArrayList<ArrayList>();
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDating() {
        return dating;
    }

    public void setDating(String dating) {
        this.dating = dating;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }

    public String getZhuangtai() {
        return zhuangtai;
    }

    public void setZhuangtai(String zhuangtai) {
        this.zhuangtai = zhuangtai;
    }
}