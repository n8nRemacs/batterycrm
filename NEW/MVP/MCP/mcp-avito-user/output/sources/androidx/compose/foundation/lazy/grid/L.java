package androidx.compose.foundation.lazy.grid;

import androidx.compose.runtime.internal.C22096n;
import kotlin.Metadata;

/* compiled from: LazyGridIntervalContent.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/foundation/lazy/grid/X;", "", "it", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/lazy/grid/X;ILandroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class L extends kotlin.jvm.internal.N implements Y41.r<X, Integer, androidx.compose.runtime.A, Integer, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C22096n f29063l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L(C22096n c22096n) {
        super(4);
        this.f29063l = c22096n;
    }

    @Override // Y41.r
    public final kotlin.G0 invoke(X x12, Integer num, androidx.compose.runtime.A a12, Integer num2) {
        X x13 = x12;
        num.intValue();
        androidx.compose.runtime.A a13 = a12;
        int iIntValue = num2.intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= a13.B(x13) ? 4 : 2;
        }
        if (a13.p(iIntValue & 1, (iIntValue & 131) != 130)) {
            this.f29063l.invoke(x13, a13, Integer.valueOf(iIntValue & 14));
        } else {
            a13.f();
        }
        return kotlin.G0.f406611a;
    }
}
