package com.google.common.eventbus;

import java.lang.reflect.Method;
import java.util.concurrent.Executor;

/* compiled from: Subscriber.java */
@e
/* loaded from: classes6.dex */
class i {

    /* renamed from: a, reason: collision with root package name */
    @XY0.e
    public final Object f360166a;

    /* renamed from: b, reason: collision with root package name */
    public final Method f360167b;

    /* renamed from: c, reason: collision with root package name */
    public final Executor f360168c;

    /* compiled from: Subscriber.java */
    @XY0.e
    public static final class b extends i {
        public b(f fVar, Object obj, Method method, a aVar) {
            super(fVar, obj, method, null);
        }
    }

    public i(f fVar, Object obj, Method method, a aVar) throws SecurityException {
        obj.getClass();
        this.f360166a = obj;
        this.f360167b = method;
        method.setAccessible(true);
        this.f360168c = fVar.f360164b;
    }

    public final boolean equals(@I41.a Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f360166a == iVar.f360166a && this.f360167b.equals(iVar.f360167b);
    }

    public final int hashCode() {
        return System.identityHashCode(this.f360166a) + ((this.f360167b.hashCode() + 31) * 31);
    }
}
