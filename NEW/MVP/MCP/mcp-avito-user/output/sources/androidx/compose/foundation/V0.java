package androidx.compose.foundation;

import android.graphics.Rect;
import androidx.compose.ui.node.C22423m;
import kotlin.Metadata;

/* compiled from: SystemGestureExclusion.android.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/V0;", "Landroidx/compose/foundation/Y1;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@j.X
/* loaded from: classes.dex */
final class V0 extends Y1 {
    public V0() {
        throw null;
    }

    @Override // androidx.compose.foundation.Y1
    @Y61.k
    public final androidx.compose.runtime.collection.e<Rect> k2() {
        androidx.compose.runtime.collection.e<Rect> eVar = new androidx.compose.runtime.collection.e<>(new Rect[16], 0);
        eVar.d(eVar.f38262d, C22423m.a(this).getSystemGestureExclusionRects());
        return eVar;
    }

    @Override // androidx.compose.foundation.Y1
    public final void l2(@Y61.k androidx.compose.runtime.collection.e<Rect> eVar) {
        C22423m.a(this).setSystemGestureExclusionRects(eVar.f());
    }
}
