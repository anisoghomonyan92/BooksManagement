package jdbcexample.db;

public class SingletoneExample {

    private static  SingletoneExample instance;

    private SingletoneExample(){

    }

    public static SingletoneExample getInstance(){
        return instance;
    }


}
