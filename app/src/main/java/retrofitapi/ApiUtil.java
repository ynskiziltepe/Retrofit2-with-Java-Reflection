package retrofitapi;

public class ApiUtil {
    private static final String BASE_URL = "https://run.mocky.io/";

    public static RetrofitInterface getServiceClass(){
        return RetrofitAPI.getRetrofit(BASE_URL).create(RetrofitInterface.class);
    }
}
