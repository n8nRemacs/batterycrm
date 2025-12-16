package kotlin.reflect.jvm.internal.impl.types.typesApproximation;

import Y61.k;
import Y61.l;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.q0;
import kotlin.reflect.jvm.internal.impl.types.s0;
import kotlin.reflect.jvm.internal.impl.types.x0;
import kotlin.reflect.jvm.internal.impl.types.z0;

/* compiled from: CapturedTypeApproximation.kt */
/* loaded from: classes8.dex */
public final class c extends s0 {
    @Override // kotlin.reflect.jvm.internal.impl.types.s0
    @l
    public final x0 g(@k q0 q0Var) {
        kotlin.reflect.jvm.internal.impl.resolve.calls.inference.b bVar = q0Var instanceof kotlin.reflect.jvm.internal.impl.resolve.calls.inference.b ? (kotlin.reflect.jvm.internal.impl.resolve.calls.inference.b) q0Var : null;
        if (bVar == null) {
            return null;
        }
        if (bVar.h().c()) {
            return new z0(bVar.h().getType(), Variance.f410071f);
        }
        return bVar.h();
    }
}
