import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Jingli {
    public  Jingli(){
        Yingpian yingpian=new Yingpian();
        yingpian.b();
        Admin2 admin=new Admin2();
        admin.yanzheng(yingpian.list2);
    }
}
class Admin2{
    String admin="123";
    void yanzheng(ArrayList<Yingpian> list2) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("经理界面");
            System.out.println("请输入登录密码");
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
                int b = sc.nextInt();
                if(b ==0){
                    System.out.println("进入经理界面");
                    power2 p=new power2(list2);
                    break;
                }
                else if(b==1) {
                    System.out.println("请输入新密码");
                    this.admin = sc.next();
        }
    }
}
    }
class Yingpian {
    private String pianming;
    private String daoyan;
    private String zhuyan;
    private String jianjie;
    private String shichang;
    ArrayList<Yingpian> list2 = new ArrayList<>();
    Yingpian y1= new Yingpian("红火","小红","小火","抗战题材","90分钟");
    Yingpian y2= new Yingpian("黑暗","小黑","小暗","惊悚末日题材","98分钟");
    Yingpian y3= new Yingpian("开心果","小开","小欣","爆笑题材","100分钟");
      void b() { Collections.addAll(list2,y1, y2, y3);}

    public Yingpian(){

    }
    public Yingpian(String pianming, String daoyan, String zhuyan, String jianjie, String shichang) {
        this.pianming = pianming;
        this.daoyan = daoyan;
        this.zhuyan = zhuyan;
        this.jianjie = jianjie;
        this.shichang = shichang;
    }

    @Override
    public String toString() {
        System.out.println( this.getPianming()+"\t"+this.getDaoyan()+"\t"+this.getZhuyan()+"\t"+this.getJianjie()+"\t"+this.getShichang());
        return null;
    }

    public String getPianming() {
        return pianming;
    }

    public void setPianming(String pianming) {
        this.pianming = pianming;
    }

    public String getDaoyan() {
        return daoyan;
    }

    public void setDaoyan(String daoyan) {
        this.daoyan = daoyan;
    }

    public String getZhuyan() {
        return zhuyan;
    }

    public void setZhuyan(String zhuyan) {
        this.zhuyan = zhuyan;
    }

    public String getJianjie() {
        return jianjie;
    }

    public void setJianjie(String jianjie) {
        this.jianjie = jianjie;
    }

    public String getShichang() {
        return shichang;
    }

    public void setShichang(String shichang) {
        this.shichang = shichang;
    }
}
class power2{
    public power2(ArrayList<Yingpian> list2) {
       /* ArrayList<Yingpian> list2 = new ArrayList<>();
        Yingpian y1= new Yingpian("红火","小红","小火","抗战题材","90分钟");
        Yingpian y2= new Yingpian("黑暗","小黑","小暗","惊悚末日题材","98分钟");
        Yingpian y3= new Yingpian("开心果","小开","小欣","爆笑题材","100分钟");
        Collections.addAll(list2,y1, y2, y3);*/
        boolean flag = true;
        while (flag){
            System.out.println("1.列出影片信息");
            System.out.println("2.添加电影信息");
            System.out.println("3.修改电影信息");
            System.out.println("4.删除电影信息");
            System.out.println("5.查询电影信息");
            System.out.println("6.场次相关");
            System.out.println("7.退出");
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            changci changci=new changci();
            changci.c();
            chuli2 chuli2=new chuli2();
            switch (num) {
                case 1:
                    chuli2.pailie(list2);
                    break;
                case 2:
                    chuli2.add(list2);
                    break;
                case 3:
                    chuli2.xiugai(list2);
                    break;
                case 4:
                    chuli2.delete(list2);
                    break;
                case 5:
                    chuli2.chaxun2(list2);
                    break;
                case 6:
                    Paipian paipian=new Paipian(changci.list3);
                    break;
                    case 7:
                        flag = false;
                    break;
            }
        }
    }
        }
class chuli2{
void pailie(ArrayList<Yingpian> list2){
    System.out.println("片名   导演  主演  简介  时长");
    for (int i = 0; i < list2.size(); i++) {
        System.out.println(list2.get(i));
    }
}
    void delete(ArrayList<Yingpian> list2){
        System.out.println("请输入要删除的电影名字");
        Scanner sc=new Scanner(System.in);
        String a= sc.next();
        for(int i=0;i<list2.size();i++){
            if(list2.get(i).getPianming().equals(a)){
                System.out.println("找到该电影，请确认是否删除，1.删除 0.不删除");
                int b= sc.nextInt();
                if(b==1)
                    list2.remove(i);
                else if(b==0)
                    break;
            }

    }
}
void add(ArrayList<Yingpian> list2){
    System.out.println("请输入要添加的电影个数");
    Scanner sc=new Scanner(System.in);
    int n= sc.nextInt();
    for(int i=1;i<=n;i++){
        System.out.println("请输入要添加的电影的信息");
        Yingpian y4=new Yingpian();
        System.out.println("请输入片名");
        String name = sc.next();
        y4.setPianming(name);
        System.out.println("请输入导演");
        String  dao= sc.next();
        y4.setDaoyan(dao);
        System.out.println("请输入主演");
        String zhu = sc.next();
        y4.setZhuyan(zhu);
        System.out.println("请输入简介");
        String jian = sc.next();
        y4.setJianjie(jian);
        System.out.println("请输入时长");
        String time = sc.next();
        y4.setShichang(time);
        list2.add(y4);
    }

}
void xiugai(ArrayList<Yingpian> list2){
    System.out.println("请输入要修改的电影名字");
    Scanner sc=new Scanner(System.in);
    String a= sc.next();
    for (int i = 0; i < list2.size(); i++) {
        if(list2.get(i).getPianming().equals(a)){
            System.out.println("请输入修改后的电影的信息：片名  导演   主演   简介   时长");
            Yingpian y5=new Yingpian();
            System.out.println("请输入片名");
            String name = sc.next();
            y5.setPianming(name);
            System.out.println("请输入导演");
            String  dao= sc.next();
            y5.setDaoyan(dao);
            System.out.println("请输入主演");
            String zhu = sc.next();
            y5.setZhuyan(zhu);
            System.out.println("请输入简介");
            String jian = sc.next();
            y5.setJianjie(jian);
            System.out.println("请输入时长");
            String time = sc.next();
            y5.setShichang(time);
            list2.set(i,y5);
            System.out.println("修改成功");
        }
    }
}
void chaxun2(ArrayList<Yingpian> list2){

        System.out.println("请输入要查询的电影的片名或者导演或者主演");
        System.out.println("1.输入片名");
        System.out.println("2.输入导演");
        System.out.println("3.输入主演");
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        if (b == 1) {
            String c = sc.next();
            for (int i = 0; i < list2.size(); i++) {
                if (list2.get(i).getPianming().equals(c)) {
                    System.out.println(list2.get(i));
                    break;
                }
            }
        } else if (b == 2) {
            String d = sc.next();
            for (int i = 0; i < list2.size(); i++) {
                if (list2.get(i).getPianming().equals(d)) {
                    System.out.println(list2.get(i));
                    break;
                }
            }
        } else if (b == 3) {
            String e = sc.next();
            for (int i = 0; i < list2.size(); i++) {
                if (list2.get(i).getPianming().equals(e)) {
                    System.out.println(list2.get(i));
                    break;
                }
            }
    }

}
}
class changci{
    private String name;
    private String dating;
    private String time;
    private String money;
    private String zhuangtai;
    ArrayList<changci> list3 = new ArrayList<>();
    changci y1= new changci("红火","1号大厅","9-10","100","有场");
    changci y2= new changci("黑暗","2号大厅","11-12","80","有场");
    changci y3= new changci("开心果","3号大厅","18-19","60","有场");
     void c()  { Collections.addAll(list3,y1, y2, y3);}

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        System.out.println( this.getName()+"\t"+this.getDating()+"\t"+this.getTime()+"\t"+this.getMoney()+"\t"+this.getZhuangtai());
        return null;
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

    public changci() {
    }

    public changci(String name, String dating, String time, String money, String zhuangtai) {
        this.name=name;
        this.dating = dating;
        this.time = time;
        this.money = money;
        this.zhuangtai = zhuangtai;
    }
}
class Paipian{
    public Paipian(ArrayList<changci>list3){
       /* ArrayList<changci> list3 = new ArrayList<>();
        changci y1= new changci("红火","1号大厅","9-10","100","有场");
        changci y2= new changci("黑暗","2号大厅","11-12","80","有场");
        changci y3= new changci("开心果","3号大厅","18-19","60","有场");
        Collections.addAll(list3,y1, y2, y3);*/
        boolean flag = true;
        while (flag){
            System.out.println("1.添加场次");
            System.out.println("2.修改场次");
            System.out.println("3.删除场次");
            System.out.println("4.列出场次信息");
            System.out.println("5.退出");
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
          changci changci=new changci();
            chuli3 chuli3=new chuli3();
            switch (num) {
                case 1:
                    chuli3.addc(list3);
                    break;
                case 2:
                    chuli3.xiugaic(list3);
                    break;
                case 3:
                    chuli3.deletec(list3);
                    break;
                case 4:
                    chuli3.pailiec(list3);
                    break;
                case 5:
                    flag=false;
                    break;
            }
        }

    }
}
class chuli3{
    void addc(ArrayList<changci>list3){
        System.out.println("请输入要添加的场次个数");
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        for(int i=1;i<=n;i++){
            System.out.println("请输入要添加的场次的信息：片名  大厅  时段   价格   状态");
            changci y6=new changci();
            System.out.println("请输入片名");
            String name = sc.next();
            y6.setName(name);
            System.out.println("请输入大厅");
            String  da= sc.next();
            y6.setDating(da);
            System.out.println("请输入时段");
            String shi = sc.next();
            y6.setTime(shi);
            System.out.println("请输入价格");
            String money = sc.next();
            y6.setMoney(money);
            System.out.println("请输入状态");
            String t = sc.next();
            y6.setZhuangtai(t);
            list3.add(y6);
    }
    }
    void xiugaic(ArrayList<changci>list3){
        System.out.println("请输入要修改的场次大厅");
        Scanner sc=new Scanner(System.in);
        String a= sc.next();
        for (int i = 0; i < list3.size(); i++) {
            if(list3.get(i).getDating().equals(a)){
                System.out.println("请输入修改后的场次的信息：片名  大厅  时段   价格   状态");
                changci y7=new changci();
                System.out.println("请输入片名");
                String name = sc.next();
                y7.setName(name);
                System.out.println("请输入大厅");
                String  da= sc.next();
                y7.setDating(da);
                System.out.println("请输入时段");
                String shi = sc.next();
                y7.setTime(shi);
                System.out.println("请输入价格");
                String jia = sc.next();
                y7.setMoney(jia);
                System.out.println("请输入状态");
                String z = sc.next();
                y7.setZhuangtai(z);
                list3.set(i,y7);
                System.out.println("修改成功");
            }
        }
    }
    void deletec(ArrayList<changci>list3){
        System.out.println("请输入要删除的场次大厅");
        Scanner sc=new Scanner(System.in);
        String a= sc.next();
        for(int i=0;i<list3.size();i++){
            if(list3.get(i).getDating().equals(a)){
                System.out.println("找到该场次，请确认是否删除，1.删除 0.不删除");
                int b= sc.nextInt();
                if(b==1)
                    list3.remove(i);
                else if(b==0)
                    break;
            }

        }
    }
    void pailiec(ArrayList<changci>list3){
        System.out.println("片名  大厅  时段   价格   状态");
        for (int i = 0; i < list3.size(); i++)
        {
            System.out.println(list3.get(i));
        }

}
}
