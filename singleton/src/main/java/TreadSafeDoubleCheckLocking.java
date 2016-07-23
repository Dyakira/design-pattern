/**
 * Created by Dyakira on 2016/7/23.
 */
public class TreadSafeDoubleCheckLocking {

    private volatile static TreadSafeDoubleCheckLocking singleton = null;

    private TreadSafeDoubleCheckLocking(){}

    public static TreadSafeDoubleCheckLocking getInstance(){
        if(singleton != null){
            return singleton;
        }
        synchronized (TreadSafeDoubleCheckLocking.class){
            if(singleton == null){
                singleton = new TreadSafeDoubleCheckLocking();
            }
        }
        return singleton;
    }
}
