public class Singelton {
    public static void main(String [] args){

        DataBase1 db1 = DataBase1.getInstance();
        DataBase1 db2 = DataBase1.getInstance();
        System.out.println(db1 == db2);
        DataBase2 db3 = DataBase2.getInstance();
        DataBase2 db4 = DataBase2.getInstance();
        System.out.println(db3 == db4);
    }
    
}