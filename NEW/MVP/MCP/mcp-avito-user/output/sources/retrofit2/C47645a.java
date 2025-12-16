package retrofit2;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import kotlin.G0;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okio.C44802l;
import retrofit2.f;

/* compiled from: BuiltInConverters.java */
/* renamed from: retrofit2.a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
final class C47645a extends f.a {

    /* renamed from: a, reason: collision with root package name */
    public boolean f429968a = true;

    /* compiled from: BuiltInConverters.java */
    /* renamed from: retrofit2.a$a, reason: collision with other inner class name */
    public static final class C12388a implements retrofit2.f<ResponseBody, ResponseBody> {

        /* renamed from: a, reason: collision with root package name */
        public static final C12388a f429969a = new C12388a();

        @Override // retrofit2.f
        public final ResponseBody convert(ResponseBody responseBody) throws IOException {
            ResponseBody responseBody2 = responseBody;
            try {
                C44802l c44802l = new C44802l();
                responseBody2.getSource().E1(c44802l);
                return ResponseBody.create(responseBody2.get$contentType(), responseBody2.getContentLength(), c44802l);
            } finally {
                responseBody2.close();
            }
        }
    }

    /* compiled from: BuiltInConverters.java */
    /* renamed from: retrofit2.a$b */
    public static final class b implements retrofit2.f<RequestBody, RequestBody> {

        /* renamed from: a, reason: collision with root package name */
        public static final b f429970a = new b();

        @Override // retrofit2.f
        public final RequestBody convert(RequestBody requestBody) {
            return requestBody;
        }
    }

    /* compiled from: BuiltInConverters.java */
    /* renamed from: retrofit2.a$c */
    public static final class c implements retrofit2.f<ResponseBody, ResponseBody> {

        /* renamed from: a, reason: collision with root package name */
        public static final c f429971a = new c();

        @Override // retrofit2.f
        public final ResponseBody convert(ResponseBody responseBody) {
            return responseBody;
        }
    }

    /* compiled from: BuiltInConverters.java */
    /* renamed from: retrofit2.a$d */
    public static final class d implements retrofit2.f<Object, String> {

        /* renamed from: a, reason: collision with root package name */
        public static final d f429972a = new d();

        @Override // retrofit2.f
        public final String convert(Object obj) {
            return obj.toString();
        }
    }

    /* compiled from: BuiltInConverters.java */
    /* renamed from: retrofit2.a$e */
    public static final class e implements retrofit2.f<ResponseBody, G0> {

        /* renamed from: a, reason: collision with root package name */
        public static final e f429973a = new e();

        @Override // retrofit2.f
        public final G0 convert(ResponseBody responseBody) throws IOException {
            responseBody.close();
            return G0.f406611a;
        }
    }

    /* compiled from: BuiltInConverters.java */
    /* renamed from: retrofit2.a$f */
    public static final class f implements retrofit2.f<ResponseBody, Void> {

        /* renamed from: a, reason: collision with root package name */
        public static final f f429974a = new f();

        @Override // retrofit2.f
        public final Void convert(ResponseBody responseBody) throws IOException {
            responseBody.close();
            return null;
        }
    }

    @Override // retrofit2.f.a
    @I41.h
    public final retrofit2.f a(Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        if (RequestBody.class.isAssignableFrom(D.e(type))) {
            return b.f429970a;
        }
        return null;
    }

    @Override // retrofit2.f.a
    @I41.h
    public final retrofit2.f<ResponseBody, ?> b(Type type, Annotation[] annotationArr, z zVar) {
        if (type == ResponseBody.class) {
            return D.h(annotationArr, J81.w.class) ? c.f429971a : C12388a.f429969a;
        }
        if (type == Void.class) {
            return f.f429974a;
        }
        if (!this.f429968a || type != G0.class) {
            return null;
        }
        try {
            return e.f429973a;
        } catch (NoClassDefFoundError unused) {
            this.f429968a = false;
            return null;
        }
    }
}
