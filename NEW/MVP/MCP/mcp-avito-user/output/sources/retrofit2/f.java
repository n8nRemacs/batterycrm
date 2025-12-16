package retrofit2;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import okhttp3.ResponseBody;

/* compiled from: Converter.java */
/* loaded from: classes9.dex */
public interface f<F, T> {

    /* compiled from: Converter.java */
    public static abstract class a {
        @I41.h
        public f a(Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
            return null;
        }

        @I41.h
        public f<ResponseBody, ?> b(Type type, Annotation[] annotationArr, z zVar) {
            return null;
        }

        @I41.h
        public f c(Type type, Annotation[] annotationArr) {
            return null;
        }
    }

    @I41.h
    T convert(F f12);
}
