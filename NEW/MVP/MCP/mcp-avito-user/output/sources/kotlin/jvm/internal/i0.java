package kotlin.jvm.internal;

import kotlin.reflect.q;

/* compiled from: PropertyReference2.java */
/* loaded from: classes8.dex */
public abstract class i0 extends k0 implements kotlin.reflect.q {
    @Override // kotlin.jvm.internal.AbstractC42817q
    public final kotlin.reflect.c computeReflected() {
        return m0.f406844a.j(this);
    }

    @Override // Y41.p
    public final Object invoke(Object obj, Object obj2) {
        return ((j0) this).getGetter().call(obj, obj2);
    }

    @Override // kotlin.reflect.n
    public final q.b getGetter() {
        return ((kotlin.reflect.q) getReflected()).getGetter();
    }
}
