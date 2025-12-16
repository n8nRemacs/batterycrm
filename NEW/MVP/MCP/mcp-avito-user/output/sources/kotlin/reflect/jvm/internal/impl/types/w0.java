package kotlin.reflect.jvm.internal.impl.types;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.C42745f0;
import kotlin.collections.P0;
import kotlin.reflect.jvm.internal.impl.types.s0;
import kotlin.reflect.jvm.internal.impl.types.u0;

/* compiled from: TypeParameterUpperBoundEraser.kt */
@kotlin.jvm.internal.s0
/* loaded from: classes8.dex */
final class w0 extends kotlin.jvm.internal.N implements Y41.l<u0.b, O> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ u0 f410267l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(u0 u0Var) {
        super(1);
        this.f410267l = u0Var;
    }

    @Override // Y41.l
    public final O invoke(u0.b bVar) {
        u0.b bVar2 = bVar;
        kotlin.reflect.jvm.internal.impl.descriptors.g0 g0Var = bVar2.f410260a;
        u0.a aVar = u0.f410255e;
        u0 u0Var = this.f410267l;
        F f12 = bVar2.f410261b;
        Set<kotlin.reflect.jvm.internal.impl.descriptors.g0> setC = f12.c();
        if (setC != null && setC.contains(g0Var.n0())) {
            return u0Var.a(f12);
        }
        Y yQ2 = g0Var.q();
        LinkedHashSet<kotlin.reflect.jvm.internal.impl.descriptors.g0> linkedHashSet = new LinkedHashSet();
        kotlin.reflect.jvm.internal.impl.types.typeUtil.a.d(yQ2, yQ2, linkedHashSet, setC);
        int iF2 = P0.f(C42745f0.q(linkedHashSet, 10));
        if (iF2 < 16) {
            iF2 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iF2);
        for (kotlin.reflect.jvm.internal.impl.descriptors.g0 g0Var2 : linkedHashSet) {
            linkedHashMap.put(g0Var2.l(), (setC == null || !setC.contains(g0Var2)) ? u0Var.f410256a.a(g0Var2, f12, u0Var, u0Var.b(g0Var2, f12.d(g0Var))) : G0.l(g0Var2, f12));
        }
        kotlin.collections.builders.j jVarC = u0Var.c(E0.e(s0.a.b(s0.f410245b, linkedHashMap)), g0Var.getUpperBounds(), f12);
        if (jVarC.f406711b.isEmpty()) {
            return u0Var.a(f12);
        }
        u0Var.f410257b.getClass();
        if (jVarC.f406711b.f406693j == 1) {
            return (O) C42745f0.t0(jVarC);
        }
        throw new IllegalArgumentException("Should only be one computed upper bound if no need to intersect all bounds");
    }
}
