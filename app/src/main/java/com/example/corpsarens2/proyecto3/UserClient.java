package com.example.corpsarens2.proyecto3;

        import java.util.List;
        import retrofit2.Call;
        import retrofit2.http.Body;
        import retrofit2.http.GET;
        import retrofit2.http.POST;
        import retrofit2.http.Path;

public interface UserClient {


    @POST("usuarios")
    Call <Usuarios> create(@Body Usuarios usuarios);
}
