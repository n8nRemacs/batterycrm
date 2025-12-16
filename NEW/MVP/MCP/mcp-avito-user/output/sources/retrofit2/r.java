package retrofit2;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Optional;
import okhttp3.ResponseBody;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import retrofit2.f;

/* compiled from: OptionalConverterFactory.java */
@IgnoreJRERequirement
/* loaded from: classes9.dex */
final class r extends f.a {

    /* renamed from: a, reason: collision with root package name */
    public static final f.a f430017a = new r();

    /* compiled from: OptionalConverterFactory.java */
    @IgnoreJRERequirement
    public static final class a<T> implements f<ResponseBody, Optional<T>> {

        /* renamed from: a, reason: collision with root package name */
        public final f<ResponseBody, T> f430018a;

        public a(f<ResponseBody, T> fVar) {
            this.f430018a = fVar;
        }

        @Override // retrofit2.f
        public final Object convert(ResponseBody responseBody) {
            return Optional.ofNullable(this.f430018a.convert(responseBody));
        }
    }

    @Override // retrofit2.f.a
    @I41.h
    public final f<ResponseBody, ?> b(Type type, Annotation[] annotationArr, z zVar) {
        if (D.e(type) != Optional.class) {
            return null;
        }
        return new a(zVar.d(D.d(0, (ParameterizedType) type), annotationArr));
    }
}
