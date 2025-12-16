package androidx.compose.foundation.gestures;

import androidx.compose.runtime.F3;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: TargetedFlingBehavior.kt */
@F3
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/gestures/m2;", "Landroidx/compose/foundation/gestures/a1;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.gestures.m2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC20481m2 extends InterfaceC20432a1 {
    @Override // androidx.compose.foundation.gestures.InterfaceC20432a1
    @Y61.l
    default Object a(@Y61.k G1 g12, float f12, @Y61.k Continuation<? super Float> continuation) {
        return b(g12, f12, C20485n2.f27879a, (ContinuationImpl) continuation);
    }

    @Y61.l
    Object b(@Y61.k G1 g12, float f12, @Y61.k Y41.l lVar, @Y61.k ContinuationImpl continuationImpl);
}
