package kotlin.jvm.internal;

import kotlin.InterfaceC42733c0;
import kotlin.reflect.l;
import kotlin.reflect.p;

/* compiled from: MutablePropertyReference1.java */
/* loaded from: classes8.dex */
public abstract class X extends b0 implements kotlin.reflect.l {
    @Override // kotlin.jvm.internal.AbstractC42817q
    public final kotlin.reflect.c computeReflected() {
        return m0.f406844a.e(this);
    }

    @Override // kotlin.reflect.p
    @InterfaceC42733c0
    public final Object getDelegate(Object obj) {
        return ((kotlin.reflect.l) getReflected()).getDelegate(obj);
    }

    @Override // Y41.l
    public final Object invoke(Object obj) {
        return get(obj);
    }

    @Override // kotlin.reflect.j
    public final l.b c() {
        return ((kotlin.reflect.l) getReflected()).c();
    }

    @Override // kotlin.reflect.n
    public final p.b getGetter() {
        return ((kotlin.reflect.l) getReflected()).getGetter();
    }
}
