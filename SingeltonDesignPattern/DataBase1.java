// Lazy initialization
public class DataBase1 {

    private static DataBase1 instance;

    private DataBase1() {

    }

    // method synchronized
    // public synchronized static DataBase1 getInstance() { // static because we
    // need object to create non-static methods
    // if (instance == null) {
    // instance = new DataBase1();
    // }
    // return instance;
    // }

    public synchronized static DataBase1 getInstance() {

        if(instance == null) {
            synchronized (DataBase1.class) {
                if (instance == null) {
                    instance = new DataBase1();
                }
            }
        }
        return instance;
    }
}