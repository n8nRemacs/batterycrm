package androidx.compose.material3;

import androidx.compose.ui.node.AbstractC22430p0;
import androidx.compose.ui.v;
import kotlin.Metadata;

/* compiled from: TabRow.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/material3/TabIndicatorModifier;", "Landroidx/compose/ui/node/p0;", "Landroidx/compose/material3/vh;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class TabIndicatorModifier extends AbstractC22430p0<C21934vh> {
    public TabIndicatorModifier() {
        throw null;
    }

    @Override // androidx.compose.ui.node.AbstractC22430p0
    public final v.d a() {
        C21934vh c21934vh = new C21934vh();
        c21934vh.f37567p = null;
        c21934vh.f37568q = false;
        return c21934vh;
    }

    @Override // androidx.compose.ui.node.AbstractC22430p0
    public final void b(v.d dVar) {
        C21934vh c21934vh = (C21934vh) dVar;
        c21934vh.f37567p = null;
        c21934vh.f37568q = false;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TabIndicatorModifier)) {
            return false;
        }
        ((TabIndicatorModifier) obj).getClass();
        return kotlin.jvm.internal.L.f(null, null);
    }

    public final int hashCode() {
        throw null;
    }

    @Y61.k
    public final String toString() {
        return "TabIndicatorModifier(tabPositionsState=null, selectedTabIndex=0, followContentSize=false)";
    }
}
