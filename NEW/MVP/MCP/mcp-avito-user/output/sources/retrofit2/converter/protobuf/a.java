package retrofit2.converter.protobuf;

import I41.h;
import com.akita.compose.theme.re23.style.C0;
import com.google.protobuf.InterfaceC37707w0;
import com.google.protobuf.L0;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Type;
import okhttp3.ResponseBody;
import retrofit2.f;
import retrofit2.z;

/* compiled from: ProtoConverterFactory.java */
/* loaded from: classes9.dex */
public final class a extends f.a {
    @Override // retrofit2.f.a
    @h
    public final f a(Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        if ((type instanceof Class) && InterfaceC37707w0.class.isAssignableFrom((Class) type)) {
            return new b();
        }
        return null;
    }

    @Override // retrofit2.f.a
    @h
    public final f<ResponseBody, ?> b(Type type, Annotation[] annotationArr, z zVar) {
        L0 l02;
        if (!(type instanceof Class)) {
            return null;
        }
        Class cls = (Class) type;
        if (!InterfaceC37707w0.class.isAssignableFrom(cls)) {
            return null;
        }
        try {
            try {
                l02 = (L0) cls.getDeclaredMethod("parser", new Class[0]).invoke(null, new Object[0]);
            } catch (IllegalAccessException | NoSuchMethodException unused) {
                l02 = (L0) cls.getDeclaredField("PARSER").get(null);
            } catch (InvocationTargetException e12) {
                throw new RuntimeException(e12.getCause());
            }
            return new c(l02);
        } catch (IllegalAccessException | NoSuchFieldException e13) {
            throw new IllegalArgumentException(C0.f(cls, new StringBuilder("Found a protobuf message but "), " had no parser() method or PARSER field."), e13);
        }
    }
}
