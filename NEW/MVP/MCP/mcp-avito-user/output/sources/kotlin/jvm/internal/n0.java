package kotlin.jvm.internal;

import java.util.List;
import kotlin.InterfaceC42733c0;

/* compiled from: ReflectionFactory.java */
/* loaded from: classes8.dex */
public class n0 {
    public kotlin.reflect.d b(Class cls) {
        return new C42820u(cls);
    }

    public kotlin.reflect.h c(Class cls, String str) {
        return new c0(cls);
    }

    @InterfaceC42733c0
    public kotlin.reflect.r g(kotlin.reflect.r rVar, kotlin.reflect.r rVar2) {
        return new x0(rVar.getF406862b(), rVar.D(), rVar2, ((x0) rVar).f406865e);
    }

    @InterfaceC42733c0
    public String k(E e12) {
        String string = e12.getClass().getGenericInterfaces()[0].toString();
        return string.startsWith("kotlin.jvm.functions.") ? string.substring(21) : string;
    }

    @InterfaceC42733c0
    public String l(N n12) {
        return k(n12);
    }

    @InterfaceC42733c0
    public kotlin.reflect.r m(kotlin.reflect.d dVar, List list, boolean z12) {
        return new x0(dVar, list, null, z12 ? 1 : 0);
    }

    public kotlin.reflect.i a(G g12) {
        return g12;
    }

    public kotlin.reflect.k d(V v12) {
        return v12;
    }

    public kotlin.reflect.l e(X x12) {
        return x12;
    }

    public kotlin.reflect.m f(Z z12) {
        return z12;
    }

    public kotlin.reflect.o h(e0 e0Var) {
        return e0Var;
    }

    public kotlin.reflect.p i(g0 g0Var) {
        return g0Var;
    }

    public kotlin.reflect.q j(i0 i0Var) {
        return i0Var;
    }
}
