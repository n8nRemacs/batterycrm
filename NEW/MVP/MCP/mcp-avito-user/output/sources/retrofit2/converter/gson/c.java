package retrofit2.converter.gson;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import java.io.Reader;
import okhttp3.ResponseBody;
import retrofit2.f;

/* compiled from: GsonResponseBodyConverter.java */
/* loaded from: classes9.dex */
final class c<T> implements f<ResponseBody, T> {

    /* renamed from: a, reason: collision with root package name */
    public final Gson f429980a;

    /* renamed from: b, reason: collision with root package name */
    public final TypeAdapter<T> f429981b;

    public c(Gson gson, TypeAdapter<T> typeAdapter) {
        this.f429980a = gson;
        this.f429981b = typeAdapter;
    }

    @Override // retrofit2.f
    public final Object convert(ResponseBody responseBody) throws IOException {
        ResponseBody responseBody2 = responseBody;
        Reader readerCharStream = responseBody2.charStream();
        this.f429980a.getClass();
        com.google.gson.stream.a aVar = new com.google.gson.stream.a(readerCharStream);
        aVar.f362208c = false;
        try {
            T t12 = this.f429981b.read(aVar);
            if (aVar.F() == JsonToken.f362205k) {
                return t12;
            }
            throw new JsonIOException("JSON document was not fully consumed.");
        } finally {
            responseBody2.close();
        }
    }
}
