package kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C42745f0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42854g;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42882k;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42905x;

/* compiled from: StarProjectionImpl.kt */
@kotlin.jvm.internal.s0
/* renamed from: kotlin.reflect.jvm.internal.impl.types.g0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42978g0 {
    @Y61.k
    public static final O a(@Y61.k kotlin.reflect.jvm.internal.impl.descriptors.g0 g0Var) {
        InterfaceC42882k interfaceC42882kF = g0Var.f();
        if (interfaceC42882kF instanceof InterfaceC42854g) {
            List<kotlin.reflect.jvm.internal.impl.descriptors.g0> parameters = ((InterfaceC42854g) interfaceC42882kF).l().getParameters();
            ArrayList arrayList = new ArrayList(C42745f0.q(parameters, 10));
            Iterator<T> it = parameters.iterator();
            while (it.hasNext()) {
                arrayList.add(((kotlin.reflect.jvm.internal.impl.descriptors.g0) it.next()).l());
            }
            List<O> upperBounds = g0Var.getUpperBounds();
            kotlin.reflect.jvm.internal.impl.builtins.k kVarE = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.e(g0Var);
            O oJ2 = E0.e(new C42976f0(arrayList)).j((O) C42745f0.E(upperBounds), Variance.f410071f);
            return oJ2 == null ? kVarE.n() : oJ2;
        }
        if (!(interfaceC42882kF instanceof InterfaceC42905x)) {
            throw new IllegalArgumentException("Unsupported descriptor type to build star projection type based on type parameters of it");
        }
        List<kotlin.reflect.jvm.internal.impl.descriptors.g0> typeParameters = ((InterfaceC42905x) interfaceC42882kF).getTypeParameters();
        ArrayList arrayList2 = new ArrayList(C42745f0.q(typeParameters, 10));
        Iterator<T> it2 = typeParameters.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((kotlin.reflect.jvm.internal.impl.descriptors.g0) it2.next()).l());
        }
        List<O> upperBounds2 = g0Var.getUpperBounds();
        kotlin.reflect.jvm.internal.impl.builtins.k kVarE2 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.e(g0Var);
        O oJ3 = E0.e(new C42976f0(arrayList2)).j((O) C42745f0.E(upperBounds2), Variance.f410071f);
        return oJ3 == null ? kVarE2.n() : oJ3;
    }
}
