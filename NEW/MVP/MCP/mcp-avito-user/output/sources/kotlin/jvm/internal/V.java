package kotlin.jvm.internal;

import kotlin.reflect.k;
import kotlin.reflect.o;

/* compiled from: MutablePropertyReference0.java */
/* loaded from: classes8.dex */
public abstract class V extends b0 implements kotlin.reflect.k {
    @Override // kotlin.jvm.internal.AbstractC42817q
    public final kotlin.reflect.c computeReflected() {
        return m0.f406844a.d(this);
    }

    @Override // Y41.a
    public final Object invoke() {
        return get();
    }

    @Override // kotlin.reflect.j
    public final k.b c() {
        return ((kotlin.reflect.k) getReflected()).c();
    }

    @Override // kotlin.reflect.n
    public final o.b getGetter() {
        return ((kotlin.reflect.k) getReflected()).getGetter();
    }
}
