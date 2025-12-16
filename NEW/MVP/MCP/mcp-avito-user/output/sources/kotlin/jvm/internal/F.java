package kotlin.jvm.internal;

import java.io.Serializable;
import kotlin.InterfaceC42830m;
import kotlin.InterfaceC43072x;

/* compiled from: FunctionImpl.java */
@Deprecated
@InterfaceC42830m
/* loaded from: classes8.dex */
public abstract class F implements InterfaceC43072x, Serializable, Y41.a, Y41.l, Y41.p, Y41.q, Y41.r, Y41.s, Y41.t, Y41.u, Y41.v, Y41.w, Y41.b, Y41.c, Y41.d, Y41.e, Y41.f, Y41.g, Y41.h, Y41.i, Y41.j, Y41.k, Y41.m, Y41.n, Y41.o {
    public final void a(int i12) {
        if (getArity() == i12) {
            return;
        }
        StringBuilder sbJ = androidx.camera.camera2.internal.G.j(i12, "Wrong function arity, expected: ", ", actual: ");
        sbJ.append(getArity());
        throw new IllegalStateException(sbJ.toString());
    }

    public abstract int getArity();

    @Override // Y41.u
    public final Object i(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Serializable serializable) {
        a(7);
        throw new UnsupportedOperationException();
    }

    @Override // Y41.a
    public final Object invoke() {
        a(0);
        throw new UnsupportedOperationException();
    }

    @Override // Y41.l
    public final Object invoke(Object obj) {
        a(1);
        throw new UnsupportedOperationException();
    }

    @Override // Y41.p
    public final Object invoke(Object obj, Object obj2) {
        a(2);
        throw new UnsupportedOperationException();
    }

    @Override // Y41.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        a(3);
        throw new UnsupportedOperationException();
    }

    @Override // Y41.r
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        a(4);
        throw new UnsupportedOperationException();
    }

    @Override // Y41.s
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        a(5);
        throw new UnsupportedOperationException();
    }

    @Override // Y41.t
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        a(6);
        throw new UnsupportedOperationException();
    }
}
