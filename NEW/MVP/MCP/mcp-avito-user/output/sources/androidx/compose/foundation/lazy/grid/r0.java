package androidx.compose.foundation.lazy.grid;

import androidx.compose.ui.unit.C22712b;
import java.util.List;
import kotlin.Metadata;

/* compiled from: LazyGridMeasuredItemProvider.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b \u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/grid/r0;", "Landroidx/compose/foundation/lazy/layout/V;", "Landroidx/compose/foundation/lazy/grid/p0;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class r0 implements androidx.compose.foundation.lazy.layout.V<C20691p0> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final P f29223a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final androidx.compose.foundation.lazy.layout.Q f29224b;

    /* renamed from: c, reason: collision with root package name */
    public final int f29225c;

    public r0(@Y61.k P p12, @Y61.k androidx.compose.foundation.lazy.layout.Q q12, int i12) {
        this.f29223a = p12;
        this.f29224b = q12;
        this.f29225c = i12;
    }

    @Override // androidx.compose.foundation.lazy.layout.V
    public final androidx.compose.foundation.lazy.layout.T a(int i12, int i13, long j12, int i14) {
        return c(i12, i13, i14, this.f29225c, j12);
    }

    @Y61.k
    public abstract C20691p0 b(int i12, @Y61.k Object obj, @Y61.l Object obj2, int i13, int i14, @Y61.k List<? extends androidx.compose.ui.layout.K0> list, long j12, int i15, int i16);

    @Y61.k
    public final C20691p0 c(int i12, int i13, int i14, int i15, long j12) {
        int iK2;
        P p12 = this.f29223a;
        Object key = p12.getKey(i12);
        Object objG = p12.g(i12);
        List<androidx.compose.ui.layout.K0> listW = this.f29224b.W(i12, j12);
        if (C22712b.h(j12)) {
            iK2 = C22712b.l(j12);
        } else {
            if (!C22712b.g(j12)) {
                androidx.compose.foundation.internal.e.a("does not have fixed height");
            }
            iK2 = C22712b.k(j12);
        }
        return b(i12, key, objG, iK2, i15, listW, j12, i13, i14);
    }
}
