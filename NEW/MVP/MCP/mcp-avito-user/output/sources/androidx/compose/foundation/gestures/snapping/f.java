package androidx.compose.foundation.gestures.snapping;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.grid.O;
import androidx.compose.ui.unit.q;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: LazyGridSnapLayoutInfoProvider.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class f {
    public static final int a(@Y61.k O o12, @Y61.k Orientation orientation) {
        long j12;
        if (orientation == Orientation.f27425b) {
            long jE2 = o12.e();
            q.a aVar = androidx.compose.ui.unit.q.f42862b;
            j12 = jE2 & 4294967295L;
        } else {
            long jE3 = o12.e();
            q.a aVar2 = androidx.compose.ui.unit.q.f42862b;
            j12 = jE3 >> 32;
        }
        return (int) j12;
    }
}
