package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.AbstractC20580i2;
import androidx.compose.ui.layout.C22387u;
import androidx.compose.ui.node.AbstractC22430p0;
import androidx.compose.ui.v;
import kotlin.Metadata;

/* compiled from: RowColumnImpl.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/WithAlignmentLineElement;", "Landroidx/compose/ui/node/p0;", "Landroidx/compose/foundation/layout/i2$b;", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class WithAlignmentLineElement extends AbstractC22430p0<AbstractC20580i2.b> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C22387u f28525b;

    public WithAlignmentLineElement(@Y61.k C22387u c22387u) {
        this.f28525b = c22387u;
    }

    @Override // androidx.compose.ui.node.AbstractC22430p0
    public final v.d a() {
        AbstractC20580i2.b bVar = new AbstractC20580i2.b(null);
        bVar.f28647p = this.f28525b;
        return bVar;
    }

    @Override // androidx.compose.ui.node.AbstractC22430p0
    public final void b(v.d dVar) {
        ((AbstractC20580i2.b) dVar).f28647p = this.f28525b;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        WithAlignmentLineElement withAlignmentLineElement = obj instanceof WithAlignmentLineElement ? (WithAlignmentLineElement) obj : null;
        if (withAlignmentLineElement == null) {
            return false;
        }
        return kotlin.jvm.internal.L.f(this.f28525b, withAlignmentLineElement.f28525b);
    }

    public final int hashCode() {
        return this.f28525b.hashCode();
    }
}
