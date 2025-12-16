package kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import kotlin.collections.C42745f0;
import kotlin.reflect.jvm.internal.impl.types.C42997w;

/* compiled from: SpecialTypes.kt */
@kotlin.jvm.internal.s0
/* renamed from: kotlin.reflect.jvm.internal.impl.types.c0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42964c0 {
    @Y61.k
    public static final J0 a(@Y61.k J0 j02, boolean z12) {
        C42997w c42997wA = C42997w.a.a(C42997w.f410264e, j02, z12);
        if (c42997wA != null) {
            return c42997wA;
        }
        Y yB2 = b(j02);
        return yB2 != null ? yB2 : j02.L0(false);
    }

    public static final Y b(J0 j02) {
        M m12;
        q0 q0VarH0 = j02.H0();
        M m13 = q0VarH0 instanceof M ? (M) q0VarH0 : null;
        if (m13 == null) {
            return null;
        }
        LinkedHashSet<O> linkedHashSet = m13.f410032b;
        ArrayList arrayList = new ArrayList(C42745f0.q(linkedHashSet, 10));
        boolean z12 = false;
        for (O oA2 : linkedHashSet) {
            if (G0.f(oA2)) {
                oA2 = a(oA2.K0(), false);
                z12 = true;
            }
            arrayList.add(oA2);
        }
        if (z12) {
            O oA3 = m13.f410031a;
            if (oA3 == null) {
                oA3 = null;
            } else if (G0.f(oA3)) {
                oA3 = a(oA3.K0(), false);
            }
            m12 = new M(new M(arrayList).f410032b);
            m12.f410031a = oA3;
        } else {
            m12 = null;
        }
        if (m12 == null) {
            return null;
        }
        return m12.d();
    }

    @Y61.k
    public static final Y c(@Y61.k Y y12, @Y61.k Y y13) {
        return Q.a(y12) ? y12 : new C42959a(y12, y13);
    }
}
