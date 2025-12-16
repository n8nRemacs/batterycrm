package androidx.compose.foundation.lazy;

import androidx.compose.ui.layout.K0;
import androidx.compose.ui.unit.C22712b;
import androidx.compose.ui.unit.C22713c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: LazyListMeasuredItemProvider.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b \u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Landroidx/compose/foundation/lazy/i0;", "Landroidx/compose/foundation/lazy/layout/V;", "Landroidx/compose/foundation/lazy/g0;", "Landroidx/compose/ui/unit/b;", "constraints", "", "isVertical", "Landroidx/compose/foundation/lazy/L;", "itemProvider", "Landroidx/compose/foundation/lazy/layout/Q;", "measureScope", "<init>", "(JZLandroidx/compose/foundation/lazy/L;Landroidx/compose/foundation/lazy/layout/Q;Lkotlin/jvm/internal/w;)V", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class i0 implements androidx.compose.foundation.lazy.layout.V<g0> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final L f29241a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final androidx.compose.foundation.lazy.layout.Q f29242b;

    /* renamed from: c, reason: collision with root package name */
    public final long f29243c;

    public i0(long j12, boolean z12, L l12, androidx.compose.foundation.lazy.layout.Q q12, C42822w c42822w) {
        this.f29241a = l12;
        this.f29242b = q12;
        this.f29243c = C22713c.b(z12 ? C22712b.j(j12) : Integer.MAX_VALUE, z12 ? Integer.MAX_VALUE : C22712b.i(j12), 5);
    }

    public static g0 c(V v12, int i12) {
        L l12 = v12.f29241a;
        Object key = l12.getKey(i12);
        Object objG = l12.g(i12);
        androidx.compose.foundation.lazy.layout.Q q12 = v12.f29242b;
        long j12 = v12.f29243c;
        return v12.b(i12, key, objG, q12.W(i12, j12), j12);
    }

    @Override // androidx.compose.foundation.lazy.layout.V
    public final androidx.compose.foundation.lazy.layout.T a(int i12, int i13, long j12, int i14) {
        L l12 = this.f29241a;
        return b(i12, l12.getKey(i12), l12.g(i12), this.f29242b.W(i12, j12), j12);
    }

    @Y61.k
    public abstract g0 b(int i12, @Y61.k Object obj, @Y61.l Object obj2, @Y61.k List<? extends K0> list, long j12);
}
