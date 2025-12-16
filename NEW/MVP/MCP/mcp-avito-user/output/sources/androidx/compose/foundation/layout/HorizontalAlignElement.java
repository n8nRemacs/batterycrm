package androidx.compose.foundation.layout;

import androidx.compose.ui.i;
import androidx.compose.ui.node.AbstractC22430p0;
import androidx.compose.ui.v;
import kotlin.Metadata;

/* compiled from: RowColumnImpl.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/HorizontalAlignElement;", "Landroidx/compose/ui/node/p0;", "Landroidx/compose/foundation/layout/s1;", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class HorizontalAlignElement extends AbstractC22430p0<C20618s1> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final i.a f28307b;

    public HorizontalAlignElement(@Y61.k i.a aVar) {
        this.f28307b = aVar;
    }

    @Override // androidx.compose.ui.node.AbstractC22430p0
    public final v.d a() {
        C20618s1 c20618s1 = new C20618s1();
        c20618s1.f28735p = this.f28307b;
        return c20618s1;
    }

    @Override // androidx.compose.ui.node.AbstractC22430p0
    public final void b(v.d dVar) {
        ((C20618s1) dVar).f28735p = this.f28307b;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        HorizontalAlignElement horizontalAlignElement = obj instanceof HorizontalAlignElement ? (HorizontalAlignElement) obj : null;
        if (horizontalAlignElement == null) {
            return false;
        }
        return kotlin.jvm.internal.L.f(this.f28307b, horizontalAlignElement.f28307b);
    }

    public final int hashCode() {
        return Float.hashCode(this.f28307b.f40046a);
    }
}
