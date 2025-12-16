package androidx.compose.foundation.draganddrop;

import androidx.compose.foundation.W0;
import androidx.compose.ui.node.AbstractC22430p0;
import androidx.compose.ui.v;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: LegacyDragAndDropSource.android.kt */
@W0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0083\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/draganddrop/LegacyDragAndDropSourceElement;", "Landroidx/compose/ui/node/p0;", "Landroidx/compose/foundation/draganddrop/r;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final /* data */ class LegacyDragAndDropSourceElement extends AbstractC22430p0<r> {
    @Override // androidx.compose.ui.node.AbstractC22430p0
    public final v.d a() {
        return new r(null, null);
    }

    @Override // androidx.compose.ui.node.AbstractC22430p0
    public final void b(v.d dVar) {
        r rVar = (r) dVar;
        rVar.getClass();
        rVar.f27111s = null;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LegacyDragAndDropSourceElement)) {
            return false;
        }
        ((LegacyDragAndDropSourceElement) obj).getClass();
        return L.f(null, null) && L.f(null, null);
    }

    public final int hashCode() {
        throw null;
    }

    @Y61.k
    public final String toString() {
        return "LegacyDragAndDropSourceElement(drawDragDecoration=null, dragAndDropSourceHandler=null)";
    }
}
