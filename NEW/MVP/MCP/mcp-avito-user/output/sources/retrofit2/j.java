package retrofit2;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: Invocation.java */
/* loaded from: classes9.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final Method f430007a;

    /* renamed from: b, reason: collision with root package name */
    public final List<?> f430008b;

    public j(Method method, ArrayList arrayList) {
        this.f430007a = method;
        this.f430008b = Collections.unmodifiableList(arrayList);
    }

    public final String toString() {
        Method method = this.f430007a;
        return String.format("%s.%s() %s", method.getDeclaringClass().getName(), method.getName(), this.f430008b);
    }
}
