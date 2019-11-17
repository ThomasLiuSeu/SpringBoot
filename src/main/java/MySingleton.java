/**
 * Created by admin on 2019/6/13.
 */
public class MySingleton {
    private static MySingleton ourInstance = new MySingleton();

    public static MySingleton getInstance() {
        return ourInstance;
    }

    private MySingleton() {
    }
}
