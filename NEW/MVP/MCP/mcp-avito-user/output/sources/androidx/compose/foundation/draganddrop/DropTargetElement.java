package androidx.compose.foundation.draganddrop;

import androidx.compose.ui.node.AbstractC22430p0;
import androidx.compose.ui.v;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: DragAndDropTarget.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/draganddrop/DropTargetElement;", "Landroidx/compose/ui/node/p0;", "Landroidx/compose/foundation/draganddrop/n;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class DropTargetElement extends AbstractC22430p0<n> {
    @Override // androidx.compose.ui.node.AbstractC22430p0
    public final v.d a() {
        return new n();
    }

    @Override // androidx.compose.ui.node.AbstractC22430p0
    public final void b(v.d dVar) {
        n nVar = (n) dVar;
        nVar.getClass();
        if (L.f(null, null)) {
            return;
        }
        androidx.compose.ui.draganddrop.p pVar = nVar.f27106r;
        if (pVar != null) {
            nVar.l2(pVar);
        }
        androidx.compose.ui.draganddrop.e eVarA = androidx.compose.ui.draganddrop.l.a(new m(nVar), null);
        nVar.k2(eVarA);
        nVar.f27106r = eVarA;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DropTargetElement)) {
            return false;
        }
        DropTargetElement dropTargetElement = (DropTargetElement) obj;
        dropTargetElement.getClass();
        if (!L.f(null, null)) {
            return false;
        }
        dropTargetElement.getClass();
        return true;
    }

    public final int hashCode() {
        throw null;
    }
}
