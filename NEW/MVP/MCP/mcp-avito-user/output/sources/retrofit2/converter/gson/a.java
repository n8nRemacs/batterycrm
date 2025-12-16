package retrofit2.converter.gson;

import com.google.gson.Gson;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import okhttp3.ResponseBody;
import retrofit2.f;
import retrofit2.z;

/* compiled from: GsonConverterFactory.java */
/* loaded from: classes9.dex */
public final class a extends f.a {

    /* renamed from: a, reason: collision with root package name */
    public final Gson f429975a;

    public a(Gson gson) {
        this.f429975a = gson;
    }

    public static a d(Gson gson) {
        if (gson != null) {
            return new a(gson);
        }
        throw new NullPointerException("gson == null");
    }

    @Override // retrofit2.f.a
    public final f a(Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        com.google.gson.reflect.a<?> aVar = com.google.gson.reflect.a.get(type);
        Gson gson = this.f429975a;
        return new b(gson, gson.f(aVar));
    }

    @Override // retrofit2.f.a
    public final f<ResponseBody, ?> b(Type type, Annotation[] annotationArr, z zVar) {
        com.google.gson.reflect.a<?> aVar = com.google.gson.reflect.a.get(type);
        Gson gson = this.f429975a;
        return new c(gson, gson.f(aVar));
    }
}
