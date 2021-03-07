package retrofitapi;

import com.yunus.retrofit2.SimpleObject;

import java.util.List;
import retrofit2.Call;
import retrofit2.http.GET;

public interface RetrofitInterface {

    @GET("v3/5bb75d0c-8ed7-4954-ab82-88342c2f2449")
    Call<List<SimpleObject>> getAllPostFromLink1();

    @GET("v3/08eacc50-9230-455b-9b58-080a51fdf2c0")
    Call<List<SimpleObject>> getAllPostFromLink2();
}
