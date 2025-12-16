package androidx.compose.foundation.layout;

import androidx.compose.ui.unit.C22712b;
import androidx.compose.ui.unit.C22713c;
import kotlin.Metadata;

/* compiled from: RowColumnImpl.kt */
@X41.g
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0081@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/foundation/layout/P1;", "", "value", "Landroidx/compose/ui/unit/b;", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class P1 {

    /* renamed from: a, reason: collision with root package name */
    public final long f28466a;

    public static long a(long j12, @Y61.k LayoutOrientation layoutOrientation) {
        LayoutOrientation layoutOrientation2 = LayoutOrientation.f28394b;
        return C22713c.a(layoutOrientation == layoutOrientation2 ? C22712b.l(j12) : C22712b.k(j12), layoutOrientation == layoutOrientation2 ? C22712b.j(j12) : C22712b.i(j12), layoutOrientation == layoutOrientation2 ? C22712b.k(j12) : C22712b.l(j12), layoutOrientation == layoutOrientation2 ? C22712b.i(j12) : C22712b.j(j12));
    }

    public static long b(int i12, long j12) {
        return C22713c.a(0, C22712b.j(j12), (i12 & 4) != 0 ? C22712b.k(j12) : 0, C22712b.i(j12));
    }

    public static final long c(long j12, @Y61.k LayoutOrientation layoutOrientation) {
        return layoutOrientation == LayoutOrientation.f28394b ? C22713c.a(C22712b.l(j12), C22712b.j(j12), C22712b.k(j12), C22712b.i(j12)) : C22713c.a(C22712b.k(j12), C22712b.i(j12), C22712b.l(j12), C22712b.j(j12));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof P1) {
            return C22712b.d(this.f28466a, ((P1) obj).f28466a);
        }
        return false;
    }

    public final int hashCode() {
        C22712b.a aVar = C22712b.f42842b;
        return Long.hashCode(this.f28466a);
    }

    public final String toString() {
        return "OrientationIndependentConstraints(value=" + ((Object) C22712b.n(this.f28466a)) + ')';
    }
}
