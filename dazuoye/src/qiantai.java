import java.util.ArrayList;
import java.util.Scanner;

public class qiantai {
    public qiantai(){

    }
}
class Admin3{
    String admin="123";
    Yingpian ying=new Yingpian();
    ArrayList<Yingpian>list4=ying.list2;
    changci chang=new changci();
    ArrayList<changci>list5=chang.list3;
    void yanzheng() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("前台界面");
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
                System.out.println("进入前台界面");
                new power3(list4,list5);
                break;
            }
            else if(b==1) {
                System.out.println("请输入新密码");
                this.admin = sc.next();
            }
        }
    }
}
class power3{
    public power3(ArrayList<Yingpian>list4, ArrayList<changci> list5){
        boolean flag=true;
      while (flag){
        System.out.println("1.列出影片信息");
        System.out.println("2.列出场次信息");
        System.out.println("3.列出指定影片和场次信息");
        System.out.println("4.售票");
        System.out.println("5.退出");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        chuli2 chu=new chuli2();
        changci p=new changci();
          chuli3 chuli3=new chuli3();
          zuowei zuo=new zuowei();
        switch (num) {
            case 1:
               chu.pailie(list4);
                break;
            case 2:
               chuli3.pailiec(list5);
                break;
            case 3:
                caozuo ca=new caozuo(list5);
                break;
            case 4:
                zuo.zuoxinxi(zuo.c);

                break;
            case 5:
                flag = false;
                break;
        }
    }
}
}
class caozuo{
    String a[][]=new String[8][13];
    zuowei zu=new zuowei();
   public caozuo(ArrayList<changci> list6) {
       zu.chushi(a);
       zu.zuoweixin(list6,a);

   }
}
class zuowei{
    Scanner sc=new Scanner(System.in);
    String c[][];


    void zuoweixin(ArrayList<changci> list6,String a[][]){
        System.out.println("请输入片名");
        String xc= sc.next();
        System.out.println("请输入场次大厅");
        String xb= sc.next();
        System.out.println("座位信息");
       for(int i=0;i< list6.size();i++){
           if(list6.get(i).getName().equals(xc)&&list6.get(i).getDating().equals(xb)){
               zuowei zuowei=new zuowei();
               String[][] ij= zuowei.xuanze(a);
               c=ij;
               print(a);
           }
       }
    }

    void chushi(String a[][]){
        int seat=0;
        for(int i=0;i<8;i++){
            a[i][0]= String.valueOf(i);
        }
        for(int j=1;j<8;j++){
            a[0][j]= String.valueOf(j);
        }
        for(int i=1;i<8;i++) {
            for (int j = 1; j < 13; i++) {
                a[i][j] = "o";
                System.out.println("o");
            }
            System.out.println("\n");
        }
    }
    static void print(String a[][]){
        for(int i=1;i<8;i++) {
            for (int j = 1; j < 13; i++) {
                System.out.println(a[i][j]);
            }
            System.out.println("\n");
    }
}



    static void zuoxinxi(String b[][]){
        int zuowei=94;
        int kong=0;
        for (int i = 1; i < 8; i++) {
            for (int j = 0; j < 13; j++) {
                if(b[i][j].equals("o")){
                    kong++;
                }
            }

        }
        System.out.print("总座位有"+zuowei);
        System.out.print("空座位有"+kong);
    }

   static String[][] xuanze(String[][] a){
        System.out.println("请选择座位，输入行号与列号");
       Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y= sc.nextInt();
        while (true){
        if(a[x][y].equals("o")){
            a[x][y]="x";
            break;
        }
        else if ((a[x][y].equals("x")))
            {
            System.out.println("该座位已有人,请重新选择");
       }
        }
        System.out.println("选择成功");
        return  a;
    }


}


