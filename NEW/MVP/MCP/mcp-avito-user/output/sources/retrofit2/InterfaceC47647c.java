package retrofit2;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* compiled from: CallAdapter.java */
/* renamed from: retrofit2.c, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public interface InterfaceC47647c<R, T> {

    /* compiled from: CallAdapter.java */
    /* renamed from: retrofit2.c$a */
    public static abstract class a {
        public static Type getParameterUpperBound(int i12, ParameterizedType parameterizedType) {
            return D.d(i12, parameterizedType);
        }

        public static Class<?> getRawType(Type type) {
            return D.e(type);
        }

        @I41.h
        public abstract InterfaceC47647c<?, ?> get(Type type, Annotation[] annotationArr, z zVar);
    }

    T adapt(InterfaceC47646b<R> interfaceC47646b);

    Type responseType();
}
