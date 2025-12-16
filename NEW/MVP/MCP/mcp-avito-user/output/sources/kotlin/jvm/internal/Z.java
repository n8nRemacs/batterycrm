package kotlin.jvm.internal;

import kotlin.reflect.m;
import kotlin.reflect.q;

/* compiled from: MutablePropertyReference2.java */
/* loaded from: classes8.dex */
public abstract class Z extends b0 implements kotlin.reflect.m {
    @Override // kotlin.jvm.internal.AbstractC42817q
    public final kotlin.reflect.c computeReflected() {
        return m0.f406844a.f(this);
    }

    @Override // Y41.p
    public final Object invoke(Object obj, Object obj2) {
        return ((a0) this).getGetter().call(obj, obj2);
    }

    @Override // kotlin.reflect.j
    public final m.b c() {
        return ((kotlin.reflect.m) getReflected()).c();
    }

    @Override // kotlin.reflect.n
    public final q.b getGetter() {
        return ((kotlin.reflect.m) getReflected()).getGetter();
    }
}
