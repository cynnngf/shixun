import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import static java.util.Collections.list;

public class Guanli {
   public Guanli(){
        Admin admin=new Admin();
        admin.yanzheng();
    }
}
//管理员登录界面
class Admin{
    String admin="ynuadmin";
    void yanzheng() {
        while (true) {
            System.out.println("管理员界面");
            System.out.println("请输入登录密码");
            Scanner sc = new Scanner(System.in);
            String a = sc.next();
            if (admin.equals(a)) {
                System.out.println("登录成功");
                break;
            }
            else {
                System.out.println("登录失败，请重新登录");
            }
        }
        while(true){
            System.out.println("是否修改密码.1.修改   0.不修改");
            Scanner sc = new Scanner(System.in);
            int b = sc.nextInt();
            if(b ==0){
                System.out.println("进入管理员界面");
                xinxi xinxi=new xinxi();
                xinxi.a();
                power p=new power(xinxi.list);
                break;
            }
            else if(b==1) {
                System.out.println("请输入新密码");
                this.admin = sc.next();
            }
        }
    }
}
    //管理员权限界面
class power {
        public power(ArrayList<xinxi> list) {
           /* ArrayList<xinxi> list = new ArrayList<>();
            boolean flag = true;
            xinxi x1 = new xinxi(1, "小王", "铜牌用户", "22年9月", 50, 3, 15069696, "123@1");
            xinxi x2 = new xinxi(2, "小李", "银牌用户", "22年8月", 500, 8, 15068677, "123@2");
            xinxi x3 = new xinxi(3, "小姜", "金牌用户", "22年7月", 5000, 13, 38669586, "123@3");
            Collections.addAll(list, x1, x2, x3);*/
            boolean flag = true;
            while (flag){
            System.out.println("1.重置用户密码");
            System.out.println("2.列出用户信息");
            System.out.println("3.删除用户信息");
            System.out.println("4.查询用户信息");
            System.out.println("5.退出登录");
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            chuli chuli=new chuli();
            switch (num) {
                case 1:
                    break;
                case 2:
                    chuli.pailie(list);
                    break;
                case 3:
                    chuli.delete(list);
                    break;
                case 4:
                    chuli.chaxun(list);
                    break;
                case 5:
                    flag = false;
                    break;
            }
        }
        }
}
//用户信息
class xinxi{
   private int ID;
    private String name;
    private String grade;
    private String registertime;
    private double summoney;
    private int count;
    private long number;
    private String mail;
    ArrayList<xinxi> list = new ArrayList<>();
    boolean flag = true;
    xinxi x1 = new xinxi(1, "小王", "铜牌用户", "22年9月", 50, 3, 15069696, "123@1");
    xinxi x2 = new xinxi(2, "小李", "银牌用户", "22年8月", 500, 8, 15068677, "123@2");
    xinxi x3 = new xinxi(3, "小姜", "金牌用户", "22年7月", 5000, 13, 38669586, "123@3");
           void a(){ Collections.addAll(list, x1, x2, x3);}
public xinxi(){

}
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getregistertime() {
        return registertime;
    }

    public void setregistertime(String registertime) {
        this.registertime = registertime;
    }

    public double getSummoney() {
        return summoney;
    }

    public void setSummoney(double summoney) {
        this.summoney = summoney;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public xinxi(int ID, String name, String grade, String registertime, double summoney, int count, long number, String mail) {
        this.ID = ID;
        this.name = name;
        this.grade = grade;
        this.registertime = registertime;
        this.summoney = summoney;
        this.count = count;
        this.number = number;
        this.mail = mail;
    }
    public String getInfo(){
        return getID()+"\t"+getName()+"\t"+getGrade()+
                "\t"+getregistertime()+"\t"+getSummoney()+"\t"+getCount()+"\t"+getNumber()+"\t"+getMail();
    }
     public String toString(){
        System.out.println(getID()+"\t"+getName()+"\t"+getGrade()+
                "\t"+getregistertime()+"\t"+getSummoney()+"\t"+getCount()+"\t"+getNumber()+"\t"+getMail());
         return null;
     }


}

class chuli{

//删除
    void delete(ArrayList list){
        System.out.println("请输入要删除的用户的ID");
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        for(int i=0;i<list.size();i++){
            if(a==i+1){
                System.out.println("找到该用户，请确认是否删除，1.删除 0.不删除");
                int b= sc.nextInt();
                if(b==1)
                list.remove(i);
                else if(b==0)
                    break;
            }
        }
    }
    //列出所有用户信息
    void pailie(ArrayList list) {
        System.out.println("ID  用户名  级别  注册时间  消费金额  消费次数  手机号  邮箱");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
    void chaxun(ArrayList list){

        System.out.println("1.请输入要查询的的用户的ID或用户名");
        System.out.println("2.查询全部用户的信息");
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        if(a==1){
            System.out.println("1选择.输入要查询的的用户的ID");
            System.out.println("2选择.输入要查询的的用户的用户名");
            int b= sc.nextInt();
            if(b==1){
                System.out.println("输入ID");
                int c= sc.nextInt();
                System.out.println(list.get(c-1));
            }
            if(b==2){
                System.out.println("输入用户名");
                String d= sc.next();
                for (int i = 0; i < list.size(); i++) {
                    if(list.contains(d)==true){
                        System.out.println(list.get(i));
                        break;
                    }
                }


            }
        }
        else if (a==2) {
            System.out.println("ID  用户名  级别  注册时间  消费金额  消费次数  手机号  邮箱");
            for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i));
            }
        }
    }


}