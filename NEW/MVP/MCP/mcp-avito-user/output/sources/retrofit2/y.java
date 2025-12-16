package retrofit2;

import java.util.Objects;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import retrofit2.OkHttpCall;

/* compiled from: Response.java */
/* loaded from: classes9.dex */
public final class y<T> {

    /* renamed from: a, reason: collision with root package name */
    public final Response f430118a;

    /* renamed from: b, reason: collision with root package name */
    @I41.h
    public final T f430119b;

    /* renamed from: c, reason: collision with root package name */
    @I41.h
    public final ResponseBody f430120c;

    public y(Response response, @I41.h T t12, @I41.h ResponseBody responseBody) {
        this.f430118a = response;
        this.f430119b = t12;
        this.f430120c = responseBody;
    }

    public static <T> y<T> a(int i12, ResponseBody responseBody) {
        if (i12 >= 400) {
            return b(responseBody, new Response.Builder().body(new OkHttpCall.b(responseBody.contentType(), responseBody.contentLength())).code(i12).message("Response.error()").protocol(Protocol.HTTP_1_1).request(new Request.Builder().url("http://localhost/").build()).build());
        }
        throw new IllegalArgumentException(AK.c.g(i12, "code < 400: "));
    }

    public static <T> y<T> b(ResponseBody responseBody, Response response) {
        Objects.requireNonNull(responseBody, "body == null");
        Objects.requireNonNull(response, "rawResponse == null");
        if (response.isSuccessful()) {
            throw new IllegalArgumentException("rawResponse should not be successful response");
        }
        return new y<>(response, null, responseBody);
    }

    public static <T> y<T> c(@I41.h T t12) {
        return d(t12, new Response.Builder().code(200).message("OK").protocol(Protocol.HTTP_1_1).request(new Request.Builder().url("http://localhost/").build()).build());
    }

    public static <T> y<T> d(@I41.h T t12, Response response) {
        Objects.requireNonNull(response, "rawResponse == null");
        if (response.isSuccessful()) {
            return new y<>(response, t12, null);
        }
        throw new IllegalArgumentException("rawResponse must be successful response");
    }

    public final String toString() {
        return this.f430118a.toString();
    }
}
