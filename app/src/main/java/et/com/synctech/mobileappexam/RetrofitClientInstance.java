package et.com.synctech.mobileappexam;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.lang.reflect.Type;

import retrofit2.Converter;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClientInstance {
    private static final String BASE_URL = "http://dummy.restapiexample.com";

    private static Converter.Factory createGsonConverter(Type type, Object typeAdapter) {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapter(type, typeAdapter);
        Gson gson = gsonBuilder.create();

        return GsonConverterFactory.create(gson);
    }

    public static Retrofit getRetrofitInstance(Type type, Object typeAdapter) {
        return new retrofit2.Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(createGsonConverter(type, typeAdapter))
                .build();
    }

}
