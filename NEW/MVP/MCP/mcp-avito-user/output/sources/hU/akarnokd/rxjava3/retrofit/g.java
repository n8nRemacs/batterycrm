package hu.akarnokd.rxjava3.retrofit;

import io.reactivex.rxjava3.core.AbstractC41768a;
import io.reactivex.rxjava3.core.AbstractC41777j;
import io.reactivex.rxjava3.core.H;
import io.reactivex.rxjava3.core.I;
import io.reactivex.rxjava3.core.q;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import retrofit2.InterfaceC47647c;
import retrofit2.y;
import retrofit2.z;

/* compiled from: RxJava3CallAdapterFactory.java */
/* loaded from: classes8.dex */
public final class g extends InterfaceC47647c.a {

    /* renamed from: b, reason: collision with root package name */
    @j41.f
    public final H f398222b;

    public g(@j41.f H h12) {
        this.f398222b = h12;
    }

    public static g a() {
        return new g(null);
    }

    @Override // retrofit2.InterfaceC47647c.a
    @j41.f
    public final InterfaceC47647c<?, ?> get(Type type, Annotation[] annotationArr, z zVar) {
        Type parameterUpperBound;
        boolean z12;
        boolean z13;
        Class<?> rawType = InterfaceC47647c.a.getRawType(type);
        if (rawType == AbstractC41768a.class) {
            return new f(Void.class, this.f398222b, false, true, false, false, false, true);
        }
        boolean z14 = rawType == AbstractC41777j.class;
        boolean z15 = rawType == I.class;
        boolean z16 = rawType == q.class;
        if (rawType != io.reactivex.rxjava3.core.z.class && !z14 && !z15 && !z16) {
            return null;
        }
        if (!(type instanceof ParameterizedType)) {
            String str = !z14 ? !z15 ? z16 ? "Maybe" : "Observable" : "Single" : "Flowable";
            throw new IllegalStateException(str + " return type must be parameterized as " + str + "<Foo> or " + str + "<? extends Foo>");
        }
        Type parameterUpperBound2 = InterfaceC47647c.a.getParameterUpperBound(0, (ParameterizedType) type);
        Class<?> rawType2 = InterfaceC47647c.a.getRawType(parameterUpperBound2);
        if (rawType2 == y.class) {
            if (!(parameterUpperBound2 instanceof ParameterizedType)) {
                throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
            }
            parameterUpperBound = InterfaceC47647c.a.getParameterUpperBound(0, (ParameterizedType) parameterUpperBound2);
            z13 = false;
            z12 = false;
        } else if (rawType2 != d.class) {
            parameterUpperBound = parameterUpperBound2;
            z12 = true;
            z13 = false;
        } else {
            if (!(parameterUpperBound2 instanceof ParameterizedType)) {
                throw new IllegalStateException("Result must be parameterized as Result<Foo> or Result<? extends Foo>");
            }
            parameterUpperBound = InterfaceC47647c.a.getParameterUpperBound(0, (ParameterizedType) parameterUpperBound2);
            z13 = true;
            z12 = false;
        }
        return new f(parameterUpperBound, this.f398222b, z13, z12, z14, z15, z16, false);
    }
}
