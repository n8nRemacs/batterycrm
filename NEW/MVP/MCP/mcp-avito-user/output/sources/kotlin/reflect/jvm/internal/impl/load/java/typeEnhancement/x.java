package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import java.util.Set;
import kotlin.collections.C42745f0;
import kotlin.collections.b1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: typeEnhancementUtils.kt */
@s0
/* loaded from: classes8.dex */
public final class x {
    public static final Object a(Set set, Enum r22, Enum r32, Enum r42, boolean z12) {
        Set setP0;
        if (!z12) {
            if (r42 != null && (setP0 = C42745f0.P0(b1.i(set, r42))) != null) {
                set = setP0;
            }
            return C42745f0.v0(set);
        }
        Enum r12 = set.contains(r22) ? r22 : set.contains(r32) ? r32 : null;
        if (L.f(r12, r22) && L.f(r42, r32)) {
            return null;
        }
        return r42 == null ? r12 : r42;
    }
}
