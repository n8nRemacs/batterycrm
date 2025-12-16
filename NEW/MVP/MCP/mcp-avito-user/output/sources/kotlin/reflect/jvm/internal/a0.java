package kotlin.reflect.jvm.internal;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.AbstractC42817q;
import kotlin.jvm.internal.InterfaceC42819t;
import kotlin.jvm.internal.n0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42905x;

/* compiled from: ReflectionFactoryImpl.java */
/* loaded from: classes8.dex */
public class a0 extends n0 {
    public static KDeclarationContainerImpl n(AbstractC42817q abstractC42817q) {
        kotlin.reflect.h owner = abstractC42817q.getOwner();
        return owner instanceof KDeclarationContainerImpl ? (KDeclarationContainerImpl) owner : C42846h.f407156e;
    }

    @Override // kotlin.jvm.internal.n0
    public final kotlin.reflect.i a(kotlin.jvm.internal.G g12) {
        return new A(n(g12), g12.getF407039i(), g12.getSignature(), null, g12.getBoundReceiver());
    }

    @Override // kotlin.jvm.internal.n0
    public final kotlin.reflect.d b(Class cls) {
        return C42841c.f407081a.a(cls);
    }

    @Override // kotlin.jvm.internal.n0
    public final kotlin.reflect.h c(Class cls, String str) {
        return C42841c.f407082b.a(cls);
    }

    @Override // kotlin.jvm.internal.n0
    public final kotlin.reflect.k d(kotlin.jvm.internal.V v12) {
        return new B(n(v12), v12.getF407039i(), v12.getSignature(), v12.getBoundReceiver());
    }

    @Override // kotlin.jvm.internal.n0
    public final kotlin.reflect.l e(kotlin.jvm.internal.X x12) {
        return new D(n(x12), x12.getF407039i(), x12.getSignature(), x12.getBoundReceiver());
    }

    @Override // kotlin.jvm.internal.n0
    public final kotlin.reflect.m f(kotlin.jvm.internal.Z z12) {
        return new E(n(z12), z12.getF407039i(), z12.getSignature());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.internal.n0
    public final kotlin.reflect.r g(kotlin.reflect.r rVar, kotlin.reflect.r rVar2) {
        return new T(kotlin.reflect.jvm.internal.impl.types.P.c((kotlin.reflect.jvm.internal.impl.types.Y) ((T) rVar).f407060b, (kotlin.reflect.jvm.internal.impl.types.Y) ((T) rVar2).f407060b), null, 2, 0 == true ? 1 : 0);
    }

    @Override // kotlin.jvm.internal.n0
    public final kotlin.reflect.o h(kotlin.jvm.internal.e0 e0Var) {
        return new I(n(e0Var), e0Var.getF407039i(), e0Var.getSignature(), e0Var.getBoundReceiver());
    }

    @Override // kotlin.jvm.internal.n0
    public final kotlin.reflect.p i(kotlin.jvm.internal.g0 g0Var) {
        return new L(n(g0Var), g0Var.getF407039i(), g0Var.getSignature(), g0Var.getBoundReceiver());
    }

    @Override // kotlin.jvm.internal.n0
    public final kotlin.reflect.q j(kotlin.jvm.internal.i0 i0Var) {
        return new M(n(i0Var), i0Var.getF407039i(), i0Var.getSignature());
    }

    @Override // kotlin.jvm.internal.n0
    public final String k(kotlin.jvm.internal.E e12) {
        A aB2;
        A a12 = kotlin.reflect.jvm.g.a(e12);
        if (a12 == null || (aB2 = i0.b(a12)) == null) {
            return super.k(e12);
        }
        b0 b0Var = b0.f407078a;
        InterfaceC42905x interfaceC42905xS = aB2.n();
        b0Var.getClass();
        StringBuilder sb2 = new StringBuilder();
        b0.a(sb2, interfaceC42905xS);
        C42745f0.N(interfaceC42905xS.g(), sb2, ", ", "(", ")", c0.f407091l, 48);
        sb2.append(" -> ");
        sb2.append(b0.f407079b.Y(interfaceC42905xS.getReturnType()));
        return sb2.toString();
    }

    @Override // kotlin.jvm.internal.n0
    public final String l(kotlin.jvm.internal.N n12) {
        return k(n12);
    }

    @Override // kotlin.jvm.internal.n0
    public final kotlin.reflect.r m(kotlin.reflect.d dVar, List list, boolean z12) {
        if (!(dVar instanceof InterfaceC42819t)) {
            return kotlin.reflect.full.m.a(dVar, list, z12, Collections.emptyList());
        }
        Class<?> clsF = ((InterfaceC42819t) dVar).f();
        AbstractC42839a<r<? extends Object>> abstractC42839a = C42841c.f407081a;
        if (list.isEmpty()) {
            return z12 ? C42841c.f407084d.a(clsF) : C42841c.f407083c.a(clsF);
        }
        ConcurrentHashMap<kotlin.Q<List<kotlin.reflect.t>, Boolean>, kotlin.reflect.r> concurrentHashMapA = C42841c.f407085e.a(clsF);
        kotlin.Q<List<kotlin.reflect.t>, Boolean> q12 = new kotlin.Q<>(list, Boolean.valueOf(z12));
        kotlin.reflect.r rVar = concurrentHashMapA.get(q12);
        if (rVar == null) {
            T tA2 = kotlin.reflect.full.m.a(C42841c.f407081a.a(clsF), list, z12, C42784z0.f406748b);
            kotlin.reflect.r rVarPutIfAbsent = concurrentHashMapA.putIfAbsent(q12, tA2);
            rVar = rVarPutIfAbsent == null ? tA2 : rVarPutIfAbsent;
        }
        return rVar;
    }
}
