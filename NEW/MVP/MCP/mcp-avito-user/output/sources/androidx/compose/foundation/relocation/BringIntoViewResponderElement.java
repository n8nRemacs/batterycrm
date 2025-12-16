package androidx.compose.foundation.relocation;

import androidx.compose.ui.node.AbstractC22430p0;
import androidx.compose.ui.v;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BringIntoViewResponder.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/relocation/BringIntoViewResponderElement;", "Landroidx/compose/ui/node/p0;", "Landroidx/compose/foundation/relocation/l;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class BringIntoViewResponderElement extends AbstractC22430p0<l> {
    @Override // androidx.compose.ui.node.AbstractC22430p0
    public final v.d a() {
        return new l(null);
    }

    @Override // androidx.compose.ui.node.AbstractC22430p0
    public final void b(v.d dVar) {
        ((l) dVar).f30096p = null;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this != obj) {
            if (obj instanceof BringIntoViewResponderElement) {
                ((BringIntoViewResponderElement) obj).getClass();
                if (L.f(null, null)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        throw null;
    }
}
