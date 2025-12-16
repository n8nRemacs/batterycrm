package androidx.compose.foundation.content;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.node.AbstractC22430p0;
import androidx.compose.ui.v;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ReceiveContent.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/content/ReceiveContentElement;", "Landroidx/compose/ui/node/p0;", "Landroidx/compose/foundation/content/f;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class ReceiveContentElement extends AbstractC22430p0<f> {
    @Override // androidx.compose.ui.node.AbstractC22430p0
    public final v.d a() {
        return new f();
    }

    @Override // androidx.compose.ui.node.AbstractC22430p0
    public final void b(v.d dVar) {
        ((f) dVar).getClass();
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReceiveContentElement)) {
            return false;
        }
        ((ReceiveContentElement) obj).getClass();
        return L.f(null, null);
    }

    public final int hashCode() {
        throw null;
    }

    @k
    public final String toString() {
        return "ReceiveContentElement(receiveContentListener=null)";
    }
}
