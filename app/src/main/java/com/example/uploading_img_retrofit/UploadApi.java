package com.example.uploading_img_retrofit;

import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;

public interface UploadApi {
    @Multipart
    @POST("uploadPdf.php")
    Call<ResponseBody> uploadPhoto(
            @Part ("description")RequestBody description,                // as we know multipart request seprates requst into various parts  so due to this we have to annotate every parametr with @part
            @Part MultipartBody.Part photo
    );
}
