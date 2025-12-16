package androidx.compose.foundation.layout;

import androidx.compose.ui.i;
import androidx.compose.ui.node.AbstractC22430p0;
import androidx.compose.ui.v;
import kotlin.Metadata;

/* compiled from: RowColumnImpl.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/VerticalAlignElement;", "Landroidx/compose/ui/node/p0;", "Landroidx/compose/foundation/layout/w2;", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class VerticalAlignElement extends AbstractC22430p0<C20635w2> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final i.b f28524b;

    public VerticalAlignElement(@Y61.k i.b bVar) {
        this.f28524b = bVar;
    }

    @Override // androidx.compose.ui.node.AbstractC22430p0
    public final v.d a() {
        C20635w2 c20635w2 = new C20635w2();
        c20635w2.f28776p = this.f28524b;
        return c20635w2;
    }

    @Override // androidx.compose.ui.node.AbstractC22430p0
    public final void b(v.d dVar) {
        ((C20635w2) dVar).f28776p = this.f28524b;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        VerticalAlignElement verticalAlignElement = obj instanceof VerticalAlignElement ? (VerticalAlignElement) obj : null;
        if (verticalAlignElement == null) {
            return false;
        }
        return kotlin.jvm.internal.L.f(this.f28524b, verticalAlignElement.f28524b);
    }

    public final int hashCode() {
        return Float.hashCode(this.f28524b.f40047a);
    }
}
