import controller.mobile.MobileRoutes;
import controller.site.SiteRoutes;
import controller.site.admin.AdministrationRoutes;
import controller.mobile.api.users.UsersRoutes;
import dao.Factory;
import model.Users;
import model.tableWork;

import java.sql.SQLException;

import static spark.Spark.port;
import static spark.Spark.staticFileLocation;

public class Application {
    public static void main(String[] args){

        staticFileLocation("/public");

        int port;
        port(5555);
//        port = Integer.parseInt(args[0]);
//        port(port);
            Factory.getInstance().getGenericRepositoryInterface().addObject(new tableWork("Антипова",7.025,11.845,6.942,0.589));
        Factory.getInstance().getGenericRepositoryInterface().addObject(new tableWork("Корезина",5.342,9.327,5.457,2.165));
//        Factory.getInstance().getGenericRepositoryInterface().addObject(new tableWork("Нечаев",9.114,18.54,4.629,10.078));
        Factory.getInstance().getGenericRepositoryInterface().addObject(new tableWork("Одиноков",1.25,0.727,0.543,3.542));
        Factory.getInstance().getGenericRepositoryInterface().addObject(new tableWork("Смирнов1",8.864,2.129,0.409,8.427));
        Factory.getInstance().getGenericRepositoryInterface().addObject(new tableWork("Субботина",3.269,4.56,3.426,4.367));
        //внутрипротоковые
        Factory.getInstance().getGenericRepositoryInterface().addObject(new tableWork("Пивцов",24.05,21.395,7.275,11.519));
        Factory.getInstance().getGenericRepositoryInterface().addObject(new tableWork("Пациент1",10.05,15.395,8.275,7.519));
        Factory.getInstance().getGenericRepositoryInterface().addObject(new tableWork("Пациент2",15.05,16.395,9.275,8.519));
        Factory.getInstance().getGenericRepositoryInterface().addObject(new tableWork("Пациент3",8.05,10.395,7.275,6.519));
        Factory.getInstance().getGenericRepositoryInterface().addObject(new tableWork("Смирнов2",4.113,8.34,8.37,4.532));
        double bdA1=0;
        int [][] mas = new int[2][8];
        for (int i=1;i<=10;i++) {
            tableWork tableWork = tableWork.class.cast(Factory.getInstance().getGenericRepositoryInterface(tableWork.class).getObject("usersId", i));
            bdA1 = bdA1 + tableWork.getA4();
        }
        double bd1 = bdA1/10;
        int count1=0;
        int count2=0;
        for (int i=1;i<=10;i++) {
            tableWork tableWork = tableWork.class.cast(Factory.getInstance().getGenericRepositoryInterface(tableWork.class).getObject("usersId", i));
            double A1 = tableWork.getA1();
            if (A1>bd1){
                mas[0][0] = count1++;
            }else {

                mas[1][1] = count2++;
            }

        }
        // получение А2
        double bdA2=0;
        for (int i=1;i<=10;i++) {
            tableWork tableWork = tableWork.class.cast(Factory.getInstance().getGenericRepositoryInterface(tableWork.class).getObject("usersId", i));
            bdA2 = bdA2 + tableWork.getA4();
        }
        double bd2 = bdA2/10;
        int count3=0;
        int count4=0;
        for (int i=1;i<=10;i++) {
            tableWork tableWork = tableWork.class.cast(Factory.getInstance().getGenericRepositoryInterface(tableWork.class).getObject("usersId", i));
            double A2 = tableWork.getA2();
            if (A2>bd2){
                mas[0][2] = count3++;
            }else {

                mas[1][3] = count4++;
            }

        }
        //получени А3
        double bdA3=0;
        for (int i=1;i<=10;i++) {
            tableWork tableWork = tableWork.class.cast(Factory.getInstance().getGenericRepositoryInterface(tableWork.class).getObject("usersId", i));
            bdA3 = bdA3 + tableWork.getA4();
        }
        double bd3 = bdA3/10;
        int count5=0;
        int count6=0;
        for (int i=1;i<=10;i++) {
            tableWork tableWork = tableWork.class.cast(Factory.getInstance().getGenericRepositoryInterface(tableWork.class).getObject("usersId", i));
            double A3 = tableWork.getA3();
            if (A3>bd3){
                mas[0][4] = count5++;
            }else {

                mas[1][5] = count6++;
            }

        }
        //получение А4
        double bdA4=0;
        for (int i=1;i<=10;i++) {
            tableWork tableWork = tableWork.class.cast(Factory.getInstance().getGenericRepositoryInterface(tableWork.class).getObject("usersId", i));
            bdA4 = bdA4 + tableWork.getA4();
        }
        double bd4 = bdA4/10;
        System.out.println(bd4);
        int count7=0;
        int count8=0;
        for (int i=1;i<=10;i++) {
            tableWork tableWork = tableWork.class.cast(Factory.getInstance().getGenericRepositoryInterface(tableWork.class).getObject("usersId", i));
            double A4 = tableWork.getA4();
            if (A4>bd4){
                mas[0][6] = count7++;
            }else {

                mas[1][7] = count8++;
            }

        }
//        for(int i = 0; i<2;i++){
//            for (int j=0;j<8;j++){
//                System.out.println(mas[i][j]);
//            }
//
//        }
//        Factory.getInstance().getGenericRepositoryInterface(tableWork.class).
        new MobileRoutes();
        new SiteRoutes();
        new AdministrationRoutes();
    }
}
