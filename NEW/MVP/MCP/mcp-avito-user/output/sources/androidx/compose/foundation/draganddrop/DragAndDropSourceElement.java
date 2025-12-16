package androidx.compose.foundation.draganddrop;

import androidx.compose.ui.node.AbstractC22430p0;
import androidx.compose.ui.v;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: DragAndDropSource.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/draganddrop/DragAndDropSourceElement;", "Landroidx/compose/ui/node/p0;", "Landroidx/compose/foundation/draganddrop/i;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final /* data */ class DragAndDropSourceElement extends AbstractC22430p0<i> {
    @Override // androidx.compose.ui.node.AbstractC22430p0
    public final v.d a() {
        return new i(null);
    }

    @Override // androidx.compose.ui.node.AbstractC22430p0
    public final void b(v.d dVar) {
        ((i) dVar).f27101r = null;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DragAndDropSourceElement)) {
            return false;
        }
        ((DragAndDropSourceElement) obj).getClass();
        return L.f(null, null) && L.f(null, null) && L.f(null, null);
    }

    public final int hashCode() {
        throw null;
    }

    @Y61.k
    public final String toString() {
        return "DragAndDropSourceElement(drawDragDecoration=null, detectDragStart=null, transferData=null)";
    }
}
