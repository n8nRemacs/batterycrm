package androidx.compose.foundation.lazy.grid;

import kotlin.Metadata;

/* compiled from: LazyGridDsl.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Landroidx/compose/foundation/lazy/grid/X;", "", "it", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/lazy/grid/X;ILandroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: androidx.compose.foundation.lazy.grid.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C20680k extends kotlin.jvm.internal.N implements Y41.r<X, Integer, androidx.compose.runtime.A, Integer, kotlin.G0> {
    @Override // Y41.r
    public final kotlin.G0 invoke(X x12, Integer num, androidx.compose.runtime.A a12, Integer num2) {
        int i12;
        X x13 = x12;
        int iIntValue = num.intValue();
        androidx.compose.runtime.A a13 = a12;
        int iIntValue2 = num2.intValue();
        if ((iIntValue2 & 6) == 0) {
            i12 = (a13.B(x13) ? 4 : 2) | iIntValue2;
        } else {
            i12 = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i12 |= a13.m(iIntValue) ? 32 : 16;
        }
        if (a13.p(i12 & 1, (i12 & 147) != 146)) {
            throw null;
        }
        a13.f();
        return kotlin.G0.f406611a;
    }
}
