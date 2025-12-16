package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.ui.layout.K0;
import androidx.compose.ui.unit.C22712b;
import java.util.List;
import kotlin.Metadata;

/* compiled from: LazyStaggeredGridMeasure.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b \u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/h0;", "Landroidx/compose/foundation/lazy/layout/V;", "Landroidx/compose/foundation/lazy/staggeredgrid/l0;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.lazy.staggeredgrid.h0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC20768h0 implements androidx.compose.foundation.lazy.layout.V<l0> {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f29617a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final M f29618b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final androidx.compose.foundation.lazy.layout.Q f29619c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final w0 f29620d;

    public AbstractC20768h0(boolean z12, @Y61.k M m12, @Y61.k androidx.compose.foundation.lazy.layout.Q q12, @Y61.k w0 w0Var) {
        this.f29617a = z12;
        this.f29618b = m12;
        this.f29619c = q12;
        this.f29620d = w0Var;
    }

    @Override // androidx.compose.foundation.lazy.layout.V
    public final androidx.compose.foundation.lazy.layout.T a(int i12, int i13, long j12, int i14) {
        M m12 = this.f29618b;
        return b(i12, i13, i14, m12.getKey(i12), m12.g(i12), this.f29619c.W(i12, j12), j12);
    }

    @Y61.k
    public abstract l0 b(int i12, int i13, int i14, @Y61.k Object obj, @Y61.l Object obj2, @Y61.k List<? extends K0> list, long j12);

    @Y61.k
    public final l0 c(int i12, long j12) {
        int i13;
        long jD2;
        M m12 = this.f29618b;
        Object key = m12.getKey(i12);
        Object objG = m12.g(i12);
        w0 w0Var = this.f29620d;
        int[] iArr = w0Var.f29677b;
        int length = iArr.length;
        int i14 = (int) (j12 >> 32);
        int i15 = length - 1;
        if (i14 <= i15) {
            i15 = i14;
        }
        int i16 = ((int) (j12 & 4294967295L)) - i14;
        int i17 = length - i15;
        if (i16 > i17) {
            i16 = i17;
        }
        if (i16 == 1) {
            i13 = iArr[i15];
        } else {
            int[] iArr2 = w0Var.f29676a;
            int i18 = (i15 + i16) - 1;
            i13 = (iArr2[i18] + iArr[i18]) - iArr2[i15];
        }
        if (this.f29617a) {
            C22712b.f42842b.getClass();
            jD2 = C22712b.a.e(i13);
        } else {
            C22712b.f42842b.getClass();
            jD2 = C22712b.a.d(i13);
        }
        long j13 = jD2;
        return b(i12, i15, i16, key, objG, this.f29619c.W(i12, j13), j13);
    }
}
