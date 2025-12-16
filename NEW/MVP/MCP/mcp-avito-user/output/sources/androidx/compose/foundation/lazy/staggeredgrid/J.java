package androidx.compose.foundation.lazy.staggeredgrid;

import kotlin.Metadata;

/* compiled from: LazyStaggeredGridIntervalContent.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/U;", "", "it", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/lazy/staggeredgrid/U;ILandroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class J extends kotlin.jvm.internal.N implements Y41.r<U, Integer, androidx.compose.runtime.A, Integer, kotlin.G0> {
    @Override // Y41.r
    public final kotlin.G0 invoke(U u12, Integer num, androidx.compose.runtime.A a12, Integer num2) {
        U u13 = u12;
        num.intValue();
        androidx.compose.runtime.A a13 = a12;
        int iIntValue = num2.intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= a13.B(u13) ? 4 : 2;
        }
        if (a13.p(iIntValue & 1, (iIntValue & 131) != 130)) {
            throw null;
        }
        a13.f();
        return kotlin.G0.f406611a;
    }
}
