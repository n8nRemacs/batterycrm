package androidx.compose.foundation.draganddrop;

import androidx.compose.foundation.W0;
import androidx.compose.ui.node.AbstractC22430p0;
import androidx.compose.ui.v;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: LegacyDragAndDropSourceWithDefaultPainter.android.kt */
@W0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/draganddrop/LegacyDragAndDropSourceWithDefaultShadowElement;", "Landroidx/compose/ui/node/p0;", "Landroidx/compose/foundation/draganddrop/v;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class LegacyDragAndDropSourceWithDefaultShadowElement extends AbstractC22430p0<v> {
    @Override // androidx.compose.ui.node.AbstractC22430p0
    public final v.d a() {
        v vVar = new v();
        c cVar = new c();
        vVar.k2(androidx.compose.ui.draw.o.a(new u(1, cVar, c.class, "cachePicture", "cachePicture(Landroidx/compose/ui/draw/CacheDrawScope;)Landroidx/compose/ui/draw/DrawResult;", 0)));
        vVar.k2(new r(new s(cVar), new t(vVar, null)));
        return vVar;
    }

    @Override // androidx.compose.ui.node.AbstractC22430p0
    public final void b(v.d dVar) {
        ((v) dVar).getClass();
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LegacyDragAndDropSourceWithDefaultShadowElement)) {
            return false;
        }
        ((LegacyDragAndDropSourceWithDefaultShadowElement) obj).getClass();
        return L.f(null, null);
    }

    public final int hashCode() {
        throw null;
    }
}
