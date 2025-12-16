package androidx.compose.ui.node;

import androidx.compose.ui.layout.AbstractC22348a;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: LayoutNodeAlignmentLines.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/node/O;", "Landroidx/compose/ui/node/a;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class O extends AbstractC22399a {
    @Override // androidx.compose.ui.node.AbstractC22399a
    public final long b(@Y61.k AbstractC22443w0 abstractC22443w0, long j12) {
        I0 i02 = abstractC22443w0.f40907J;
        if (i02 != null) {
            j12 = i02.c(j12, false);
        }
        return androidx.compose.ui.unit.r.b(j12, abstractC22443w0.f40898A);
    }

    @Override // androidx.compose.ui.node.AbstractC22399a
    @Y61.k
    public final Map<AbstractC22348a, Integer> c(@Y61.k AbstractC22443w0 abstractC22443w0) {
        return abstractC22443w0.z0().t();
    }

    @Override // androidx.compose.ui.node.AbstractC22399a
    public final int d(@Y61.k AbstractC22443w0 abstractC22443w0, @Y61.k AbstractC22348a abstractC22348a) {
        return abstractC22443w0.d0(abstractC22348a);
    }
}
