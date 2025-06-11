// Eager initialization
public class DataBase2 {
    private static DataBase2 instance = new DataBase2();

    private DataBase2() {
       
    }

    public static DataBase2 getInstance() {
        return instance;
    }
}