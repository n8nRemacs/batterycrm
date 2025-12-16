package M71;

import java.lang.reflect.Method;
import org.mockito.internal.invocation.m;

/* compiled from: DelegatingMethod.java */
/* loaded from: classes7.dex */
public class a implements m {

    /* renamed from: b, reason: collision with root package name */
    public final Method f10409b;

    /* renamed from: c, reason: collision with root package name */
    public final Class<?>[] f10410c;

    public a(Method method) {
        this.f10409b = method;
        this.f10410c = c.a(method.getParameterTypes());
    }

    @Override // org.mockito.internal.invocation.m
    public final Class<?>[] a() {
        return this.f10410c;
    }

    @Override // org.mockito.internal.invocation.m
    public final boolean b() {
        return this.f10409b.isVarArgs();
    }

    @Override // org.mockito.internal.invocation.m
    public final Method c() {
        return this.f10409b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        boolean z12 = obj instanceof a;
        Method method = this.f10409b;
        return z12 ? method.equals(((a) obj).f10409b) : method.equals(obj);
    }

    public final int hashCode() {
        return this.f10409b.hashCode();
    }
}
