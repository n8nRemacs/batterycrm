package androidx.compose.foundation.gestures.snapping;

import androidx.compose.animation.core.C20315s;
import androidx.compose.animation.core.C20318t;
import androidx.compose.animation.core.V;
import androidx.compose.foundation.gestures.G1;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: SnapFlingBehavior.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Landroidx/compose/foundation/gestures/snapping/x;", "Landroidx/compose/foundation/gestures/snapping/b;", "", "Landroidx/compose/animation/core/t;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class x implements b<Float, C20318t> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final V f28057a;

    public x(@Y61.k V v12) {
        this.f28057a = v12;
    }

    @Override // androidx.compose.foundation.gestures.snapping.b
    public final Object a(G1 g12, Float f12, Float f13, Y41.l lVar, Continuation continuation) {
        float fFloatValue = f12.floatValue();
        float fFloatValue2 = f13.floatValue();
        Object objC = t.c(g12, Math.signum(fFloatValue2) * Math.abs(fFloatValue), fFloatValue, C20315s.a(0.0f, fFloatValue2, 28), this.f28057a, lVar, (ContinuationImpl) continuation);
        return objC == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objC : (a) objC;
    }
}
