package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.layout.R1;
import androidx.compose.ui.unit.C22712b;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.unit.h;
import kotlin.Metadata;

/* compiled from: LazyStaggeredGridDsl.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/ui/unit/d;", "Landroidx/compose/ui/unit/b;", "constraints", "Landroidx/compose/foundation/lazy/staggeredgrid/w0;", "invoke-0kLqBqw", "(Landroidx/compose/ui/unit/d;J)Landroidx/compose/foundation/lazy/staggeredgrid/w0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class C extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.ui.unit.d, C22712b, w0> {
    @Override // Y41.p
    public final w0 invoke(androidx.compose.ui.unit.d dVar, C22712b c22712b) {
        androidx.compose.ui.unit.d dVar2 = dVar;
        long j12 = c22712b.f42843a;
        if (C22712b.j(j12) == Integer.MAX_VALUE) {
            androidx.compose.foundation.internal.e.a("LazyVerticalStaggeredGrid's width should be bound by parent.");
        }
        LayoutDirection layoutDirection = LayoutDirection.f42838b;
        float f12 = R1.f(null, layoutDirection) + R1.g(null, layoutDirection);
        h.a aVar = androidx.compose.ui.unit.h.f42849c;
        C22712b.j(j12);
        dVar2.y0(f12);
        throw null;
    }
}
