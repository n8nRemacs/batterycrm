package kotlin.jvm.internal;

import kotlin.InterfaceC42733c0;
import kotlin.reflect.p;

/* compiled from: PropertyReference1.java */
/* loaded from: classes8.dex */
public abstract class g0 extends k0 implements kotlin.reflect.p {
    public g0() {
    }

    @Override // kotlin.jvm.internal.AbstractC42817q
    public kotlin.reflect.c computeReflected() {
        return m0.f406844a.i(this);
    }

    @Override // kotlin.reflect.p
    @InterfaceC42733c0
    public Object getDelegate(Object obj) {
        return ((kotlin.reflect.p) getReflected()).getDelegate(obj);
    }

    @Override // Y41.l
    public Object invoke(Object obj) {
        return get(obj);
    }

    @InterfaceC42733c0
    public g0(Object obj) {
        super(obj);
    }

    @Override // kotlin.reflect.n
    public p.b getGetter() {
        return ((kotlin.reflect.p) getReflected()).getGetter();
    }

    @InterfaceC42733c0
    public g0(Object obj, Class cls, String str, String str2, int i12) {
        super(obj, cls, str, str2, i12);
    }
}
