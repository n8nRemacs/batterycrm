package androidx.compose.foundation;

import androidx.compose.ui.node.AbstractC22430p0;
import androidx.compose.ui.node.InterfaceC22419k;
import androidx.compose.ui.v;
import kotlin.Metadata;

/* compiled from: Overscroll.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/OverscrollModifierElement;", "Landroidx/compose/ui/node/p0;", "Landroidx/compose/foundation/P1;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class OverscrollModifierElement extends AbstractC22430p0<P1> {
    @Override // androidx.compose.ui.node.AbstractC22430p0
    public final v.d a() {
        P1 p12 = new P1();
        p12.f26816r = null;
        return p12;
    }

    @Override // androidx.compose.ui.node.AbstractC22430p0
    public final void b(v.d dVar) {
        P1 p12 = (P1) dVar;
        InterfaceC22419k interfaceC22419k = p12.f26816r;
        if (interfaceC22419k != null) {
            p12.l2(interfaceC22419k);
        }
        p12.f26816r = null;
        p12.f26816r = null;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OverscrollModifierElement)) {
            return false;
        }
        ((OverscrollModifierElement) obj).getClass();
        return kotlin.jvm.internal.L.f(null, null);
    }

    public final int hashCode() {
        return 0;
    }
}
